plugins {
    kotlin("jvm") version "1.9.22"
    application
}

group = "me.sahmad"
version = "1.0-SNAPSHOT"

application {
    mainClass = "me.sahmad.ApplicationKt"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-netty:2.3.8")
    implementation("io.ktor:ktor-html-builder:2.3.8")
    implementation("io.ktor:ktor-websockets:2.3.8")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}