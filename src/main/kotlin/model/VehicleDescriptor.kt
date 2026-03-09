package model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class VehicleDescriptor(

    @ProtoNumber(1)
    val id: String? = null,

    @ProtoNumber(2)
    val label: String? = null,

    @ProtoNumber(3)
    val licensePlate: String? = null,

    @ProtoNumber(4)
    val wheelchairAccessible: WheelchairAccessible = WheelchairAccessible.NO_VALUE
) {
    @Serializable
    enum class WheelchairAccessible {
        NO_VALUE,
        UNKNOWN,
        WHEELCHAIR_ACCESSIBLE,
        WHEELCHAIR_INACCESSIBLE
    }

}
