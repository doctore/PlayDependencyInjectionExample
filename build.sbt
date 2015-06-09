name := "PlayDependencyInjectionExample"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
   javaJdbc
  ,javaEbean
  ,cache
  ,"org.reflections" % "reflections" % "0.9.10" withSources() withJavadoc()
)     

play.Project.playJavaSettings
