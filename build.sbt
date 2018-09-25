enablePlugins(ScalaNativePlugin)
scalaVersion := "2.11.12"

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.2.0-SNAP10" % Test
nativeLinkStubs := true
