/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    `java-library`
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    testImplementation(libs.junit.junit)
}

group = "com.mycom"
version = "0.0.1-SNAPSHOT"
description = "version"
java.sourceCompatibility = JavaVersion.VERSION_1_8

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"

    tasks.withType<Jar>{
    manifest{
        attributes["Main-Class"]="org.example.App"
    }
}
}
tasks.withType<Jar>{
    manifest{
        attributes["Main-Class"]="com.mycom.version.App"
    }
}
