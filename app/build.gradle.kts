/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.4.2/userguide/building_java_projects.html
 */




plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {

    // json dependecy
    implementation ("org.json:json:20220320")

    // Use TestNG framework, also requires calling test.useTestNG() below
    testImplementation("org.testng:testng:7.4.0")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:30.1.1-jre")
}


//running
tasks.named<Test>("test") {
    // Use TestNG for unit tests.
    useTestNG()
}

//generating javadocs
tasks.register<Jar>("sourcesJar") {
    from(sourceSets["main"].allJava)
    classifier = "sources"
}

tasks.register<Jar>("javadocJar") {
    from(tasks["javadoc"])
    classifier = "javadoc"
}

task<Delete>("cleanBuild") {
    delete(rootProject.buildDir)
}


