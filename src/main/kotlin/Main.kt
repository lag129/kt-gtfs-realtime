import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.json.Json
import kotlinx.serialization.protobuf.ProtoBuf
import model.FeedMessage
import java.io.File

@OptIn(ExperimentalSerializationApi::class)
fun main() {
    val json = Json { prettyPrint = true }

    val protoBuf = File("")
        .readBytes()
        .let { ProtoBuf.decodeFromByteArray<FeedMessage>(it) }
        .let { json.encodeToString(it) }

    println(protoBuf)
}
