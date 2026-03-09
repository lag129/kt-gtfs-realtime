package model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class TripDescriptor(

    @ProtoNumber(1)
    val tripId: String? = null,

    @ProtoNumber(5)
    val routeId: String? = null,

    @ProtoNumber(6)
    val directionId: Int? = null,

    @ProtoNumber(2)
    val startTime: String? = null,

    @ProtoNumber(3)
    val startDate: String? = null,

    @ProtoNumber(4)
    val scheduleRelationship: ScheduleRelationship? = null,

    @ProtoNumber(7)
    val modifiedTrip: ModifiedTripSelector? = null,
) {
    @Serializable
    enum class ScheduleRelationship {
        SCHEDULED,
        ADDED,
        UNSCHEDULED,
        CANCELED,
        REPLACEMENT,
        DUPLICATED,
        DELETED,
        NEW
    }

    @Serializable
    data class ModifiedTripSelector(

        @ProtoNumber(1)
        val modificationsId: String? = null,

        @ProtoNumber(2)
        val affectedTripId: String? = null,

        @ProtoNumber(3)
        val startTime: String? = null,

        @ProtoNumber(4)
        val startDate: String? = null,
    )

}
