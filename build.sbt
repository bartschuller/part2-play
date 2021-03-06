name := """social-list"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "org.webjars" % "bootstrap" % "2.3.2",
  jdbc,
  anorm,
  cache,
  ws
)
