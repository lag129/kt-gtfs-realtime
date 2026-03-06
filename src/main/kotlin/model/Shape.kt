package model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class Shape(

    @ProtoNumber(1)
    val shapeId: String? = null,

    @ProtoNumber(2)
    val encodedPolyline: String? = null,
)
