import sbt._

lazy val applicationSettings = Seq(
  name := "pizzza.application",
  version := "1.0",
  scalaVersion := "2.11.8"
)

lazy val application = Project(id = "application", base = file(".")).settings(applicationSettings : _*).dependsOn(domain)
lazy val domain = ProjectRef(id = "domain", base = file("../domain"))