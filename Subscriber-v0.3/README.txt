
README
======

PubSubHubbub API v3.0
-----------------------

Welcome to the PubSubHubbub API v3.0 release!  This release includes the implementation 
of the "Discovery" and "Subscribing and Unsubscribing" functionalities of the PubSubHubbub 
protocol. You can find the PubSubHubbub specification from: 

	http://pubsubhubbub.googlecode.com/svn/trunk/pubsubhubbub-core-0.3.html


For more information about the project, please check the PubSubHubbub-java at http://code.google.com/p/pubsubhubbub-java/

Requirements
------------

Note that the PubSubHubbub API v3.0 release requires some Jetty web server packages.
The version of the Jetty web server used for this release is version 7.0.1.v20091125.

This release requires the ROME API packages too. Download latest version of the ROME API from

	http://rome.dev.java.net/

In case you're using Maven, you can add in your pom.xml the following dependencies: 

			<dependencies>
	    		<dependency>
  					<groupId>org.eclipse.jetty</groupId>
  					<artifactId>jetty-server</artifactId>
    				<version>7.0.1.v20091125</version>
				</dependency>  
  				<dependency>
	 				<groupId>org.eclipse.jetty</groupId>
 					<artifactId>jetty-util</artifactId>
 					<version>7.0.1.v20091125</version>
 				</dependency>
 				<dependency>
	  				<groupId>rome</groupId>
  					<artifactId>rome</artifactId>
  					<version>1.0</version>
				</dependency>
  			</dependencies> 
  			

Problems
---------
http://groups.google.com/group/pubsubhubbub-java?pli=1
Our web page at http://code.google.com/p/pubsubhubbub-java/ has a mailing list where 
you can ask your questions

Enjoy!
