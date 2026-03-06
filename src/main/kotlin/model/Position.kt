package model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class Position(

    @ProtoNumber(1)
    val latitude: Float,

    @ProtoNumber(2)
    val longitude: Float,

    @ProtoNumber(3)
    val bearing: Float? = null,

    @ProtoNumber(4)
    val odometer: Double? = null,

    @ProtoNumber(5)
    val speed: Float? = null,
)
