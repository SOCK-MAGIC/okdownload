plugins {
    alias(libs.plugins.bilibilias.android.library)
    alias(libs.plugins.bilibilias.android.library.jacoco)
}

android {
    namespace = "com.liulishuo.okdownload"
}

dependencies {
    implementation("androidx.annotation:annotation:1.7.1")
    testImplementation(libs.junit)
}