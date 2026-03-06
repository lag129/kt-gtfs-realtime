package model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class FeedEntity(

    @ProtoNumber(1)
    val id: String,

    @ProtoNumber(2)
    val isDeleted: Boolean? = null,

    @ProtoNumber(3)
    val tripUpdate: TripUpdate? = null,

    @ProtoNumber(4)
    val vehicle: VehiclePosition? = null,

    @ProtoNumber(5)
    val alert: Alert? = null,

    @ProtoNumber(6)
    val shape: Shape? = null,

    @ProtoNumber(7)
    val stop: Stop? = null,

    @ProtoNumber(8)
    val tripModifications: TripModifications? = null
)
