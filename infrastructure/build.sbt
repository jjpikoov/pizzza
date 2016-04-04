import sbt._

lazy val infrastructureSettings = Seq(
  name := "pizzza.infrastructure",
  version := "1.0",
  scalaVersion := "2.11.8"
)

lazy val infrastructure = Project(id = "infrastructure", base = file(".")).settings(infrastructureSettings: _*).dependsOn(domain)
lazy val domain = ProjectRef(id = "domain", base = file("../domain"))