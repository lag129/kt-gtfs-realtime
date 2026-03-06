package model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class TranslatedImage(

    @ProtoNumber(1)
    val localizedImage: List<LocalizedImage>
) {
    @Serializable
    data class LocalizedImage(
        @ProtoNumber(1) val url: String,
        @ProtoNumber(2) val mediaType: Int,
        @ProtoNumber(3) val language: String? = null,
    )
}
