
# Introduction

This is an archetype that allows you to generate a Spring MVC project with simple configuration. This is for guys love using maven command line

# How to use

1. Download this project, using maven build:
	 $ cd springmvc01-archetype/
	 $ mvn clean install
	
2. Using the archetype to generate Spring MVC project
	 $ mvn archetype:generate -DarchetypeCatalog=local
	
	Display list of local archetypes
	
	 $ Choose archetype:
	 $ 1: local -> com.dee.archetype:springmvc01-archetype (springmvc01-archetype)
	 $ Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): : 1
	
	Enter your information of your project:
	 $ Define value for property 'groupId': : com.dee.web
	 $ Define value for property 'artifactId': : sample01
	 $ ...
	
	Go to your project (mine is sample01)
	 $ mvn clean install
	
3. Start Web: The generated project is using embedded jetty and embedded tomcat7. You can use whether jetty or tomcat7
	
	> Tomcat7
	$ mvn tomcat7:run
	
	> Jetty
	$ mvn jetty:run
	
	Go to: http://localhost:8080/sample01/webstatus to see the result.

	
