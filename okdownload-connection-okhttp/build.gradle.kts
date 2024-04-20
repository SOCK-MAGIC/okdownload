plugins {
    alias(libs.plugins.bilibilias.android.library)
    alias(libs.plugins.bilibilias.android.library.jacoco)
}

android {
    namespace = "com.liulishuo.okdownload"
}

dependencies {
    implementation(project(":okdownload"))
    implementation("androidx.annotation:annotation:1.7.1")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    testImplementation(libs.junit)
}
