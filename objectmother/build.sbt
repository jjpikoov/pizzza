import sbt._

lazy val objectMotherSettings = Seq(
  name := "pizzza.objectmother",
  version := "1.0",
  scalaVersion := "2.11.8"
)

lazy val objectMother = Project(id = "objectMother", base = file(".")).settings(objectMotherSettings : _*).dependsOn(domain)
lazy val domain = ProjectRef(id = "domain", base = file("../domain"))