import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.protobuf.ProtoBuf
import model.FeedMessage
import java.io.File

@OptIn(ExperimentalSerializationApi::class)
fun main() {
    val file = File("")
    val bytes: ByteArray = file.readBytes()

    val protoBuf = ProtoBuf.decodeFromByteArray<FeedMessage>(bytes)

    println(protoBuf.toString())
}
