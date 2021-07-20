plugins {
    kotlin("jvm") version "1.5.21"
}

group = "de.gehring.openapi.model"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.fasterxml.jackson.core:jackson-databind:2.12.4")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.2")
    // https://mvnrepository.com/artifact/com.fasterxml.jackson.dataformat/jackson-dataformat-yaml
    testImplementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.12.4")
    testImplementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.12.3")

}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}



