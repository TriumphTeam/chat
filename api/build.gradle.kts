triumph {
    msgs(mapOf("version" to "2.2.2-SNAPSHOT", "type" to "adventure", "scope" to "api"))
    platform(mapOf("version" to "4.0.0-SNAPSHOT", "scope" to "api"))
}

dependencies {
    // Kotlin
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    api("net.kyori:text-serializer-plain:4.0.0-SNAPSHOT")
}