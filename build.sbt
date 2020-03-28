name := """bookshop"""
organization := "com.br.dev"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  javaJdbc,
  cacheApi,
  guice
)
