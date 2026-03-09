package model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class Alert(

    @ProtoNumber(1)
    val activePeriod: List<TimeRange> = emptyList(),

    @ProtoNumber(5)
    val informedEntity: List<EntitySelector> = emptyList(),

    @ProtoNumber(6)
    val cause: Cause? = Cause.UNKNOWN_CAUSE,

    @ProtoNumber(7)
    val effect: Effect? = Effect.UNKNOWN_EFFECT,

    @ProtoNumber(8)
    val url: TranslatedString? = null,

    @ProtoNumber(10)
    val headerText: TranslatedString? = null,

    @ProtoNumber(11)
    val descriptionText: TranslatedString? = null,

    @ProtoNumber(12)
    val ttsHeaderText: TranslatedString? = null,

    @ProtoNumber(13)
    val ttsDescriptionText: TranslatedString? = null,

    @ProtoNumber(14)
    val severityLevel: SeverityLevel? = SeverityLevel.UNKNOWN_SEVERITY,

    @ProtoNumber(15)
    val image: TranslatedImage? = null,

    @ProtoNumber(16)
    val imageAlternativeText: TranslatedString? = null,

    @ProtoNumber(17)
    val causeDetail: TranslatedString? = null,

    @ProtoNumber(18)
    val effectDetail: TranslatedString? = null,
) {
    @Suppress("unused")
    @Serializable
    enum class Cause {
        UNKNOWN_CAUSE,
        OTHER_CAUSE,
        TECHNICAL_PROBLEM,
        STRIKE,
        DEMONSTRATION,
        ACCIDENT,
        HOLIDAY,
        WEATHER,
        MAINTENANCE,
        CONSTRUCTION,
        POLICE_ACTIVITY,
        MEDICAL_EMERGENCY
    }

    @Suppress("unused")
    @Serializable
    enum class Effect {
        NO_SERVICE,
        REDUCED_SERVICE,
        SIGNIFICANT_DELAYS,
        DETOUR,
        ADDITIONAL_SERVICE,
        MODIFIED_SERVICE,
        OTHER_EFFECT,
        UNKNOWN_EFFECT,
        STOP_MOVED,
        NO_EFFECT,
        ACCESSIBILITY_ISSUE
    }

    @Suppress("unused")
    @Serializable
    enum class SeverityLevel {
        UNKNOWN_SEVERITY,
        INFO,
        WARNING,
        SEVERE
    }
}
