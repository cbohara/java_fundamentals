##########
JRE vs JDK
##########

JRE = Java Runtime Environment
- required to run Java apps
- end users only need to install the JRE

JDK = Java Development Kit
- provides tools required to create Java apps
- developers normally require the JDK
- JDK installation includes the JRE

feed Java source code into JDK to produce Java application (platform independent byte codes)

Java is NOT a low level programming language like C
when you compile a C program it creates a program that can run directly on the host computer
Java uses an abstraction called byte codes which allows you to run the program in multiple environments
we need to JRE to run our byte codes in any host environment
this why end users just need JRE to run the code

java.exe is what runs our program

compiled code for intelliJ is placed in
out/production/pluralsight_java/

######
Intro
######

must end statements with ;

comments
	line comments //
	block comments /* */ 
	javadoc (equivalent to python docstrings) /** /

at the top of the source code you will see the specification of packages 
like import in python

package names follow standard naming convention
	all lowercase
	assure package name uniqueness at a global scale by associating package with domain name
	final group specifies a specific project
	ex: package com.pluralsight.example;
		Main class with this package on top will now be identified as com.pluralsight.example.Main
	most IDE require folder paths to match package name

compile in IDE
$ cd GetOrganized/out/production/GetOrganized
$ java com.pluralsight.getorganized.Main
$ Hello Get Organized
