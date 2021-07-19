plugins {
    kotlin("jvm") version "1.5.21"
    idea
    application
}

group = "de.gehring"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}



tasks.withType<Test> {
    useJUnitPlatform()
}


application {
    mainClass.set("de.gehring.cpider.CpiderApplication")
}

idea {
    module {
        isDownloadJavadoc = true
        isDownloadSources = true
    }
}
