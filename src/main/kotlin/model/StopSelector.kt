package model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class StopSelector(

    @ProtoNumber(1)
    val stopSequence: Int? = null,

    @ProtoNumber(2)
    val stopId: String? = null,
)
