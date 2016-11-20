name := "nubia"

version := "1.0"

lazy val `nubia` = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq( jdbc , cache , ws  , javaJdbc , specs2 % Test, javaJpa, "org.hibernate" % "hibernate-entitymanager" % "5.1.0.Final", "org.postgresql" % "postgresql" % "9.4-1201-jdbc41")

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

PlayKeys.externalizeResources := false


sources in (Compile, doc) := Seq.empty

publishArtifact in (Compile, packageDoc) := false