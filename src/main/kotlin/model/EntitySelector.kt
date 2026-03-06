package model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class EntitySelector(

    @ProtoNumber(1)
    val agencyId: String? = null,

    @ProtoNumber(2)
    val routeId: String? = null,

    @ProtoNumber(3)
    val routeType: Int? = null,

    @ProtoNumber(4)
    val trip: TripDescriptor? = null,

    @ProtoNumber(5)
    val stopId: String? = null,

    @ProtoNumber(6)
    val directionId: Int? = null,
)
