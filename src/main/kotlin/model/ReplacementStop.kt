package model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class ReplacementStop(

    @ProtoNumber(1)
    val travelTimeToStop: Int? = null,

    @ProtoNumber(2)
    val stopId: String? = null,
)
