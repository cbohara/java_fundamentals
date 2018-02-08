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