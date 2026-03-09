package model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class VehiclePosition(

    @ProtoNumber(1)
    val trip: TripDescriptor? = null,

    @ProtoNumber(8)
    val vehicle: VehicleDescriptor? = null,

    @ProtoNumber(2)
    val position: Position? = null,

    @ProtoNumber(3)
    val currentStopSequence: Int? = null,

    @ProtoNumber(7)
    val stopId: String? = null,

    @ProtoNumber(4)
    val currentStatus: VehicleStopStatus = VehicleStopStatus.IN_TRANSIT_TO,

    @ProtoNumber(5)
    val timestamp: Int? = null,

    @ProtoNumber(6)
    val congestionLevel: CongestionLevel? = null,

    @ProtoNumber(9)
    val occupancyStatus: OccupancyStatus? = null,

    @ProtoNumber(10)
    val occupancyPercentage: Int? = null,

    @ProtoNumber(11)
    val multiCarriageDetails: List<CarriageDetails>? = emptyList(),
) {
    @Suppress("unused")
    @Serializable
    enum class VehicleStopStatus {
        INCOMING_AT,
        STOPPED_AT,
        IN_TRANSIT_TO
    }

    @Suppress("unused")
    @Serializable
    enum class CongestionLevel {
        UNKNOWN_CONGESTION_LEVEL,
        RUNNING_SMOOTHLY,
        STOP_AND_GO,
        CONGESTION,
        SEVERE_CONGESTION
    }

    @Suppress("unused")
    @Serializable
    enum class OccupancyStatus {
        EMPTY,
        MANY_SEATS_AVAILABLE,
        FEW_SEATS_AVAILABLE,
        STANDING_ROOM_ONLY,
        CRUSHED_STANDING_ROOM_ONLY,
        FULL,
        NOT_ACCEPTING_PASSENGERS,
        NO_DATA_AVAILABLE,
        NOT_BOARDABLE
    }

    @Serializable
    data class CarriageDetails(

        @ProtoNumber(1)
        val id: String? = null,

        @ProtoNumber(2)
        val label: String? = null,

        @ProtoNumber(3)
        val occupancyStatus: OccupancyStatus = OccupancyStatus.NO_DATA_AVAILABLE,

        @ProtoNumber(4)
        val occupancyPercentage: Int? = -1,

        @ProtoNumber(5)
        val carriageSequence: Int? = null,
    )

}
