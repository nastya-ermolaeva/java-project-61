plugins {
    application
    id("com.github.ben-manes.versions") version "0.52.0"
    id("org.sonarqube") version "6.0.1.5171"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("hexlet.code.App")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

sonar {
    properties {
        property("sonar.projectKey", "nastya-ermolaeva_java-project-61")
        property("sonar.organization", "nastya-ermolaeva")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}