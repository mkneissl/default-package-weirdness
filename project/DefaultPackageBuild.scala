import sbt._
import sbt.Keys._

object DefaultPackageBuild extends Build {

  lazy val defaultPackage = Project(
    id = "default-package",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Default Package",
      organization := "org.example",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.0"
      // add other settings here
    )
  )
}
