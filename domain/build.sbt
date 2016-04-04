import sbt._

lazy val domainSettings = Seq(
  version := "1.0",
  scalaVersion := "2.11.8"
)

lazy val domain = Project(id = "domain", base = file(".")).settings(domainSettings : _*).dependsOn(common)
lazy val common = ProjectRef(id = "common", base = file("../common"))