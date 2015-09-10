name := "orange-extensions"

organization := "com.yuvimasory"

version := "1.6.0-SNAPSHOT"

description := "A pluggable jar containing stubs for the Apple Java Extensions, updated for Java 5 & 6"

javacOptions ++= Seq(
  "-source", "1.5",
  "-target", "1.5",
  "-Xlint:unchecked",
  "-Xlint:deprecation"
)

javacOptions in doc := Seq()

/* sbt behavior */
logLevel in compile := Level.Warn

traceLevel := 5

crossPaths := false

autoScalaLibrary := false

/* publishing */
publishMavenStyle := true

publishTo <<= version { (v: String) =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT")) Some(
    "snapshots" at nexus + "content/repositories/snapshots"
  )
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

// publishArtifact in (Compile, packageDoc) := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>http://ymasory.github.com/OrangeExtensions/</url>
  <licenses>
    <license>
      <name>BSD</name>
      <url>https://github.com/ymasory/OrangeExtensions/blob/master/LICENSE</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:ymasory/OrangeExtensions.git</url>
    <connection>scm:git:git@github.com/ymasory/OrangeExtensions.git</connection>
  </scm>
  <developers>
    <developer>
      <id>ymasory</id>
      <name>Yuvi Masory</name>
      <email>ymasory@gmail.com</email>
      <url>http://yuvimasory.com</url>
    </developer>
  </developers>
)

