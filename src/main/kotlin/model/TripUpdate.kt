package model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class TripUpdate(

    @ProtoNumber(1)
    val trip: TripDescriptor,

    @ProtoNumber(3)
    val vehicle: VehicleDescriptor? = null,

    @ProtoNumber(2)
    val stopTimeUpdate: List<StopTimeUpdate>? = emptyList(),

    @ProtoNumber(4)
    val timestamp: Int? = null,

    @ProtoNumber(5)
    val delay: Int? = null,

    @ProtoNumber(6)
    val tripProperties: TripProperties? = null,
) {
    @Serializable
    data class StopTimeEvent(

        @ProtoNumber(1)
        val delay: Int? = null,

        @ProtoNumber(2)
        val time: Int? = null,

        @ProtoNumber(3)
        val uncertainty: Int? = null,

        @ProtoNumber(4)
        val scheduledTime: Int? = null,
    )

    @Serializable
    data class StopTimeUpdate(

        @ProtoNumber(1)
        val stopSequence: Int? = null,

        @ProtoNumber(4)
        val stopId: String? = null,

        @ProtoNumber(2)
        val arrival: StopTimeEvent? = null,

        @ProtoNumber(3)
        val departure: StopTimeEvent? = null,

        @ProtoNumber(7)
        val departureOccupancyStatus: VehiclePosition.OccupancyStatus? = null,

        @ProtoNumber(5)
        val scheduleRelationship: ScheduleRelationship? = ScheduleRelationship.SCHEDULED,

        @ProtoNumber(6)
        val stopTimeProperties: StopTimeProperties? = null,
    )

    @Serializable
    data class StopTimeProperties(

        @ProtoNumber(1)
        val assignedStopId: String? = null,

        @ProtoNumber(2)
        val stopHeadsign: String? = null,

        @ProtoNumber(3)
        val pickupType: DropOffPickupType? = null,

        @ProtoNumber(4)
        val dropOffType: DropOffPickupType? = null,
    )

    @Serializable
    enum class ScheduleRelationship {
        SCHEDULED,
        SKIPPED,
        NO_DATA,
        UNSCHEDULED
    }

    @Serializable
    enum class DropOffPickupType {
        REGULAR,
        NONE,
        PHONE_AGENCY,
        COORDINATE_WITH_DRIVER
    }

    @Serializable
    data class TripProperties(

        @ProtoNumber(1)
        val tripId: String? = null,

        @ProtoNumber(2)
        val startDate: String? = null,

        @ProtoNumber(3)
        val startTime: String? = null,

        @ProtoNumber(4)
        val shapeId: String? = null,

        @ProtoNumber(5)
        val tripHeadsign: String? = null,

        @ProtoNumber(6)
        val tripShortName: String? = null,
    )

}
