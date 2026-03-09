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
    @Serializable
    enum class Cause {

        @ProtoNumber(1)
        UNKNOWN_CAUSE,

        @ProtoNumber(2)
        OTHER_CAUSE,

        @ProtoNumber(3)
        TECHNICAL_PROBLEM,

        @ProtoNumber(4)
        STRIKE,

        @ProtoNumber(5)
        DEMONSTRATION,

        @ProtoNumber(6)
        ACCIDENT,

        @ProtoNumber(7)
        HOLIDAY,

        @ProtoNumber(8)
        WEATHER,

        @ProtoNumber(9)
        MAINTENANCE,

        @ProtoNumber(10)
        CONSTRUCTION,

        @ProtoNumber(11)
        POLICE_ACTIVITY,

        @ProtoNumber(12)
        MEDICAL_EMERGENCY
    }

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

    @Serializable
    enum class SeverityLevel {
        UNKNOWN_SEVERITY,
        INFO,
        WARNING,
        SEVERE
    }
}
