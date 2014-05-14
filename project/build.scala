import sbt._

object SampleBuild extends Build {

  lazy val root = project.in( file(".") ).dependsOn( jdalvikvmLibrary )
  lazy val jdalvikvmLibrary = uri("https://github.com/Trugath/jdalvikvm.git#0.8.1")
}