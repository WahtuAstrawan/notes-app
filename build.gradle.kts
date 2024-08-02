buildscript {
    repositories {
        google()
        mavenCentral()  // Tambahkan jika belum ada
    }

    dependencies {
        val navVersion = "2.7.5"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$navVersion")
    }
}

plugins {
    id("com.android.application") version "8.5.0" apply false
    id("com.android.library") version "7.3.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false
}