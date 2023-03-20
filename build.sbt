// See README.md for license details.

ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "1.0.0"
ThisBuild / organization     := "com.github.esyvjlomh"

val chiselVersion = "3.5.6"

lazy val root = (project in file("."))
  .settings(
    name := "chisel-template-0320",
    libraryDependencies ++= Seq(
      "edu.berkeley.cs" %% "chisel3" % "3.5.6",
      "edu.berkeley.cs" %% "chiseltest" % "0.5.6" % "test"
    ),
    scalacOptions ++= Seq(
      "-language:reflectiveCalls",
      "-deprecation",
      "-feature",
      "-Xcheckinit",
      "-P:chiselplugin:genBundleElements",
    ),
    addCompilerPlugin("edu.berkeley.cs" % "chisel3-plugin" % chiselVersion cross CrossVersion.full),
  )

