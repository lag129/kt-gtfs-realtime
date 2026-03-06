package model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class TranslatedString(

    @ProtoNumber(1)
    val translation: List<Translation>
) {
    @Serializable
    data class Translation(
        @ProtoNumber(1) val text: String,
        @ProtoNumber(2) val language: String? = null,
    )

}
