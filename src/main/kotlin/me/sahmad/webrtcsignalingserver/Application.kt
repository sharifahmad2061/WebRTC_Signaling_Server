package me.sahmad.webrtcsignalingserver

import io.ktor.serialization.kotlinx.KotlinxWebsocketSerializationConverter
import io.ktor.serialization.kotlinx.json.json
import io.ktor.server.application.install
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import io.ktor.server.routing.routing
import io.ktor.server.websocket.WebSockets
import io.ktor.server.websocket.receiveDeserialized
import io.ktor.server.websocket.webSocket
import io.ktor.websocket.Frame
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
data class SignalingMessage(val type: String, val data: Any)

fun main() {
    embeddedServer(Netty, port = 8080) {
        install(ContentNegotiation) {
            json()
        }
        install(WebSockets) {
            contentConverter = KotlinxWebsocketSerializationConverter(Json)
        }

        routing {
            webSocket("/ws") {
                val sessionId = call.parameters["sessionId"] ?: return@webSocket
                println("WebSocket connection established for session: $sessionId")

                           try {
                                // Handle incoming messages from clients
                                for (frame in incoming) {
                                    if (frame is Frame.Text) {
                                        val message = receiveDeserialized<SignalingMessage>()
                                        handleWebSocketMessage(sessionId, message)
                                    }
                                }
                            } catch (e: Exception) {
                                e.printStackTrace()
                            } finally {
                                // Cleanup when the WebSocket connection is closed
                                println("WebSocket connection closed for session: $sessionId")
                            }
                        }
        }
    }.start(wait = true)
}

fun handleWebSocketMessage(sessionId: String, message: SignalingMessage) {
    println("Received message for session $sessionId: $message")

    // Your signaling server logic here...
    // Depending on the message type, you may want to broadcast the message to other clients, store it, etc.
}
