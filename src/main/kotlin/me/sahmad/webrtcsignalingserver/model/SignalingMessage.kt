package me.sahmad.webrtcsignalingserver.model

import kotlinx.serialization.Serializable

@Serializable
data class SignalingMessage(val type: SignalingMessageType, val data: String)
