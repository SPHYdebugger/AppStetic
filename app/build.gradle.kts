plugins {
    id("com.android.application")
}

android {
<<<<<<< HEAD
    namespace = "com.sphy.steticappproject"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.sphy.steticappproject"
=======
    namespace = "com.sphy.appstetic"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.sphy.appstetic"
>>>>>>> ce4670dcd07848137edd4414b92569c0103f0b02
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
<<<<<<< HEAD
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
=======
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
>>>>>>> ce4670dcd07848137edd4414b92569c0103f0b02
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

<<<<<<< HEAD
    implementation("androidx.room:room-runtime:2.4.3")
    annotationProcessor("androidx.room:room-compiler:2.4.3")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
=======
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
>>>>>>> ce4670dcd07848137edd4414b92569c0103f0b02
}