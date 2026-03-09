package model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class FeedHeader(

    @ProtoNumber(1)
    val gtfsRealtimeVersion: String,

    @ProtoNumber(2)
    val incrementality: Incrementality? = Incrementality.FULL_DATASET,

    @ProtoNumber(3)
    val timestamp: Int? = null,

    @ProtoNumber(4)
    val feedVersion: String? = null,
) {
    @Suppress("unused")
    @Serializable
    enum class Incrementality {
        FULL_DATASET,
        DIFFERENTIAL
    }

}
