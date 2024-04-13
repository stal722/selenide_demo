plugins {
    id("java")
}

group = "ru.mail.stal722"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("com.codeborne:selenide:7.2.3")
}

tasks.test {
    useJUnitPlatform()
}