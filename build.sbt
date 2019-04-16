name := """Pramana-Project"""
organization := "Pramana"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
				guice,
				"org.mongodb" % "mongo-java-driver" % "3.9.1",
				"xyz.morphia.morphia" % "core" % "1.4.0",
				"com.google.code.gson" % "gson" % "2.2.4"
)


EclipseKeys.preTasks := Seq(compile in Compile, compile in Test)