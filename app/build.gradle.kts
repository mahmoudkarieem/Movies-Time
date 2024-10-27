plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
    id("kotlin-parcelize")
}

android {
    namespace = "com.example.moviestime"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.moviestime"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    implementation(libs.androidx.core.splashscreen)


    implementation(libs.androidx.navigation.compose)
    implementation(libs.material3)


    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
    implementation(libs.androidx.hilt.navigation.compose)


    implementation(libs.retrofit)
    implementation(libs.converter.gson)


    implementation(libs.coil.compose)
    implementation(libs.coil.gif)


    implementation(libs.androidx.datastore.preferences)


    implementation(libs.androidx.foundation)


    implementation(libs.accompanist.systemuicontroller)


    implementation(libs.androidx.paging.runtime)
    implementation(libs.androidx.paging.compose)
    implementation(libs.androidx.paging.common.ktx)



    implementation (libs.androidx.room.runtime)
    kapt (libs.androidx.room.compiler)
    implementation (libs.androidx.room.ktx)


    implementation(libs.kotlinx.coroutines.android)
//
//    implementation("andrioidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
//    implementation("andrioidx.lifecycle:lifecycle-runtime-ktx:2.5.1")
//    implementation("androidx.compose.runtime:runtime-livedata:1.2.0-beta02")
//    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.2.0")
//
//    implementation("android.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
//    implementation("android.lifecycle:lifecycle-runtime-ktx:2.5.1")
//    implementation("android.compose.runtime:runtime-livedata:1.2.0-beta02")
//    implementation("android.lifecycle:lifecycle-livedata-ktx:2.2.0")



    implementation(libs.javax.inject)


}