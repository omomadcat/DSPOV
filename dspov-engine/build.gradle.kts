plugins {
    id("com.utopia-rise.godot-kotlin-jvm") version "0.6.0" // Adjust version to match the latest
    kotlin("jvm") version "1.9.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    // Additional Godot Kotlin/JVM dependencies
}
