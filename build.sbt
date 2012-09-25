name := "orange-extensions"

organization := "com.yuvimasory"

version := "1.0.0"

description := "A pluggable jar containing stubs for the Apple Java Extensions, updated for Java 5 & 6"

homepage := Some( url("http://yuvimasory.com/software/orange-extensions"))

licenses := Seq(
  "BSD 3-clause" -> url("https://github.com/ymasory/OrangeExtensions/blob/master/LICENSE")
)

javacOptions ++= Seq("-Xlint:unchecked", "-Xlint:deprecation")

/* sbt behavior */
logLevel in compile := Level.Warn

traceLevel := 5

/* assembly plugin */
assemblySettings

test in AssemblyKeys.assembly := {}

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

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>https://github.com/ymasory/OrangeExtensions</url>
  <licenses>
    <license>
      <name>LICENSE NAME</name>
      <url>https://github.com/ymasory/OrangeExtensions/blob/master/LICENSE</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git://github.com/ymasory/OrangeExtensions.git</url>
    <connection>scm:git:git@github.com:github.com/ymasory/OrangeExtensions.git</connection>
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

// pgpPassphrase := Some("PASSWORD".toCharArray)

// pgpSigningKey := Some(0L)

// pgpSecretRing := file("/path/to/file")

// pgpPublicRing := file("/path/to/file")

// credentials += Credentials(
//   "Sonatype Nexus Repository Manager",
//   "oss.sonatype.org",
//   "ACCOUNT",
//   IO read file("/path/to/file")
// )
