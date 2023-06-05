plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}


dependencies {
    core()
    di()
    async()
    retrofit()
}

fun DependencyHandlerScope.core() {
    implementation(Dependencies.other.kotlin)
}

fun DependencyHandlerScope.di() {
    api(Dependencies.di.javaxInject)
}

fun DependencyHandlerScope.async() {
    implementation(Dependencies.async.coroutinesCore)
}

fun DependencyHandlerScope.retrofit() {
    implementation(Dependencies.retrofit.retrofit)
    implementation(Dependencies.retrofit.gson)
    implementation(Dependencies.other.moshi)
}


