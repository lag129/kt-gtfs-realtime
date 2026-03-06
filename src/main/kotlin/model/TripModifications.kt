package model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class TripModifications(

    @ProtoNumber(1)
    val selectedTrips: List<SelectedTrips>? = emptyList(),

    @ProtoNumber(2)
    val startTimes: List<String>? = emptyList(),

    @ProtoNumber(3)
    val serviceDates: List<String>? = emptyList(),

    @ProtoNumber(4)
    val modifications: List<Modification>? = emptyList(),
) {
    @Serializable
    data class Modification(

        @ProtoNumber(1)
        val startStopSelector: StopSelector? = null,

        @ProtoNumber(2)
        val endStopSelector: StopSelector? = null,

        @ProtoNumber(3)
        val propagatedModificationDelay: Int = 0,

        @ProtoNumber(4)
        val replacementStops: List<ReplacementStop>? = emptyList(),

        @ProtoNumber(5)
        val serviceAlertId: String? = null,

        @ProtoNumber(6)
        val lastModifiedTime: Int? = null,

        )

    @Serializable
    data class SelectedTrips(
        @ProtoNumber(1)
        val tripIds: List<String>? = emptyList(),

        @ProtoNumber(2)
        val shapeId: String? = null,
    )

}
