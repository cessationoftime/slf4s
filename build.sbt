organization := "com.weiglewilczek.slf4s"

name := "slf4s"

version := "1.0.8"

scalaVersion := "2.10.0-RC1"

crossScalaVersions := Seq(
    "2.9.2",
    "2.10.0-RC1")

libraryDependencies ++= Seq(
    "org.slf4j" % "slf4j-api" % "1.7.1")
