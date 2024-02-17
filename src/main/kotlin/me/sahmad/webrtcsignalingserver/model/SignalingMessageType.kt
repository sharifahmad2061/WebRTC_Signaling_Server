package me.sahmad.webrtcsignalingserver.model

import kotlinx.serialization.Serializable

@Serializable
enum class SignalingMessageType {
    Offer,
    Answer,
    IceCandidate,
}
