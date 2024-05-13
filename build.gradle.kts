plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    id("androidx.navigation.safeargs.kotlin") version "2.7.4" apply false
    id("com.google.dagger.hilt.android") version "2.51.1" apply false
}