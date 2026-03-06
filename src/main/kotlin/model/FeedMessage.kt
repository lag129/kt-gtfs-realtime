package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * https://gtfs.org/documentation/realtime/proto/
 */

@Serializable
data class FeedMessage(

    @SerialName("header")
    val header: FeedHeader,

    @SerialName("entity")
    val entity: List<FeedEntity>? = emptyList(),
)
