package model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class TimeRange(

    @ProtoNumber(1)
    val start: Int? = null,

    @ProtoNumber(2)
    val end: Int? = null
)
