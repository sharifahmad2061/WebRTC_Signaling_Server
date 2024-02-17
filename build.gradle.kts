plugins {
    kotlin("jvm") version "1.9.22"
    application
    id("org.jlleitschuh.gradle.ktlint") version "12.1.0"
}

group = "me.sahmad"
version = "1.0-SNAPSHOT"

application {
    mainClass = "me.sahmad.webrtcsignalingserver.ApplicationKt"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-netty:2.3.8")
    implementation("io.ktor:ktor-server-content-negotiation:2.3.8")
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.8")
    implementation("io.ktor:ktor-server-websockets:2.3.8")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}