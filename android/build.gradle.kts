plugins {
    id("com.android.library")
    kotlin("android")
}

group = "com.mymax.nfccompatibility"
version = "1.0-SNAPSHOT"

android {
    namespace = "com.mymax.nfccompatibility"
    compileSdk = 34 

    defaultConfig {
        minSdk = 21
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    sourceSets["main"].java.srcDirs("src/main/kotlin")

    lint {
        disable.add("InvalidPackage")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.9.0")
}
