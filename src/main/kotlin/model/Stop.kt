package model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class Stop(

    @ProtoNumber(1)
    val stopId: String? = null,

    @ProtoNumber(2)
    val stopCode: TranslatedString? = null,

    @ProtoNumber(3)
    val stopName: TranslatedString? = null,

    @ProtoNumber(4)
    val ttsStopName: TranslatedString? = null,

    @ProtoNumber(5)
    val stopDesc: TranslatedString? = null,

    @ProtoNumber(6)
    val stopLat: Float? = null,

    @ProtoNumber(7)
    val stopLon: Float? = null,

    @ProtoNumber(8)
    val zoneId: String? = null,

    @ProtoNumber(9)
    val stopUrl: TranslatedString? = null,

    @ProtoNumber(11)
    val parentStation: String? = null,

    @ProtoNumber(12)
    val stopTimezone: String? = null,

    @ProtoNumber(13)
    val wheelchairBoarding: WheelchairBoarding? = WheelchairBoarding.UNKNOWN,

    @ProtoNumber(14)
    val levelId: String? = null,

    @ProtoNumber(15)
    val platformCode: TranslatedString? = null,
) {
    @Serializable
    enum class WheelchairBoarding {
        UNKNOWN,
        AVAILABLE,
        NOT_AVAILABLE,
    }

}
