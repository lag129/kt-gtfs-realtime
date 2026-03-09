plugins {
    kotlin("jvm") version "2.3.0"
    kotlin("plugin.serialization") version "2.3.0"
}

group = "net.lag129"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.10.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf:1.10.0")
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}
