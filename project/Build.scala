import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "angularjs"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm ,
    "org.json4s" % "json4s-native_2.10" % "3.2.5"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
