package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SpringApplication.run(CourseApiApp.class, args);

/*Above method does the following
 1.Set up the default configuration
 (default conf for 80% of use case)
 2. Performs class path scan... reads Annotations over classes 
 3.starts tomcat server
 4.starts spring applicaion context 
 */


	}

}
/*
Spring boot appln is standalone ; doesn't need a servlet container ; doesnt need a server to be deployed




*/



/*
Video 6->
set JAVA_HOME poiniting to 
IDE ->Spring STS -> Spring Tool Suite -> flavor of Eclipse tweaked to work with Spring

Manage Dependency ->
jars in classpath
Maven -> declare all dependencies in single file pom.xml ; not need to download jars and add them to classpath
Dependency Management Tool -> MAVEN
All dependenies are read by MAVEn from pom.xml and all jars are imported from repository
Creates starter project 
*/


/*

View tier of spring boot appln handled by a framework known as Spring MVC



*/



/*

Srping boot initializr -> A UI interface at http://start.spring.io/ by which you can select the dependencies and specify
project details , jdk version and other configuration setting and finally download a spring boot application with those
defined settigs

*/