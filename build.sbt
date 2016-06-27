name := "akkademy-db-java"

organization := "com.akkademy-db"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.9",
  "com.typesafe.akka" %% "akka-remote" % "2.3.9",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.9" % "test",
  "junit"             % "junit"           % "4.12"  % "test",
  "com.novocode"      % "junit-interface" % "0.11"  % "test"
)

mappings in (Compile, packageBin) ~= {
  _.filterNot {
    case (_, name) => Seq("application.conf").contains(name)
  }
}
