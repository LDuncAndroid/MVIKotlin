setupMultiplatform()
setupPublication()

kotlinCompat {
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":rx"))
                implementation(project(":utils-internal"))
            }
        }
    }
}
