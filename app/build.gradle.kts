
plugins {
    id("application")
    id("org.cyclonedx.bom") version "1.4.0" apply true
    id("net.serenity-bdd.serenity-gradle-plugin") version "2.6.0" apply false
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")

    implementation("com.google.guava:guava:30.1.1-jre")
}

application {
    mainClass.set("demo.App")
}

tasks.test {
    useJUnitPlatform() // <6>
}
