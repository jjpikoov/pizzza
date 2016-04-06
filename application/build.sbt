import sbt.Keys._
import sbt._

resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

libraryDependencies += "org.scalactic" %% "scalactic" % "2.2.6"
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"

lazy val applicationSettings = Seq(
  name := "pizzza.application",
  version := "1.0",
  scalaVersion := "2.11.8"
)

lazy val application = Project(id = "application", base = file(".")).settings(applicationSettings : _*).dependsOn(domain, infrastructure)
lazy val domain = ProjectRef(id = "domain", base = file("../domain"))
lazy val infrastructure = ProjectRef(id = "infrastructure", base = file("../infrastructure"))