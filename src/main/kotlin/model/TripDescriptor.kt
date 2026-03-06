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

        @ProtoNumber(0)
        SCHEDULED,

        @ProtoNumber(1)
        ADDED,

        @ProtoNumber(2)
        UNSCHEDULED,

        @ProtoNumber(3)
        CANCELED,

        @ProtoNumber(5)
        REPLACEMENT,

        @ProtoNumber(6)
        DUPLICATED,

        @ProtoNumber(7)
        DELETED,

        @ProtoNumber(8)
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
