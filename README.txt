https://app.pluralsight.com/library/courses/java-fundamentals-language/

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

###########################################
Variables, Data Types, and Math Operators
###########################################

int dataValue;
dataValue = 100;

or in 1 line

int dataValue = 100;

variable = named data storage
	strongly typed language => need to specify the variable type
	can modify the value stored inside the variable
	always start with a letter
	camelCase

primitive data type
1. integer - whole numbers
	byte	8 bits
	short	16 bits
	int	32 bits
	long	64 bits
		need to specify by appending L to value
		ex: long nationalDebt = 18100000000000L;

2. floating point - fractional numbers
	float	32 bit
		ex: float milesInMarathon = 26.2f;
	double	64 bit
		ex: double atomWidthInMeters = 0.0000000001d;

3. character
	stores single unicode character
		ex: char regularU = 'U';
		ex: char unicode = '\u00DA';
	different than strings

4. boolean
	true
	false

primitive types are stored by value
	create a variable = create space in memory
	assign a variable a value = provide value within that space of memory

	ex: 
		int firstValue = 100;
		int otherValue = firstValue;		// store only the value 100 to otherValue, not the location in memory
		firstValue = 50;					// when you reassign firstValue it does NOT change otherValue

#####################
Arithemtic operators
#####################

Division
floating point 
13.0 / 5.0 == 2.6

integer
when dividing integers, the answer will be an integer
13 / 5 == 2

Prefix
int myVal = 5;
System.out.println(++myValue); //6
System.out.println(myValue); //6

Postfix
int myVal = 5;
System.out.println(myVal++); //5
System.out.println(myVal); //6

Operator precedence
Postfix > Prefix > Multipicative > Additive

#################
Type conversion
#################
https://www.javatpoint.com/images/datatype2.JPG
operations involve multiple data types 

1. inplicit = performed automatically by the compiler
widening conversions are automatic
if there are mixed integer sizes > use largest integer in the equation
if there are mixed floating point sizes > use double
if there are mixed integers and floating point types > use largest floating point in the equation

ex: convert 32 bit integer to 64 bit long iteger
int iVal = 50;
long lVal = iVal; 

2. explicit = performed explicitly in code
can perform widening and narrowing
float > integer will drop the fraction
use caution with narrowing conversions
int > floating point = lose precision

ex: take lVal and cast it down to a 32 bit integer
long lVal = 50;
int iVal = (int)lVal;

#########################
Conditional logic
#########################

ex: 
int v1 = 7;
int v2 = 5;
// if v1 > v2 is true return v1 else return v2
int vMax = v1 > v2 ? v1 : v2;
System.out.println(vMax); // 7 

ex:
float students = 30;
float rooms = 4;

// if rooms equals 0 return 0 else divide students by rooms
float studentsPerRoom = rooms == 0.0f ? 0.0f : students/rooms;

####################
If/else
####################

ex:
int v1 = 10;
int v2 = 4;

if (v1 > v2)
	System.out.println("v1 is bigger than v2");
else if (v2 > v1)
	System.out.println("v2 is bigger than v1");
else
	System.out.println("v1 and v2 are equal");

##################
Block statements
##################

ex:
int v1 = 10, v2 = 4, diff;
if (v1 > v2) {
	diff = v1 - v2;
	System.out.println("v1 is bigger");
	System.out.println(diff);
}
else if (v2 > v1) {
	diff = v2 - v1;
	System.out.println("v2 is bigger");
	System.out.println(diff);
}
else
	// do not need to have all block statements
	System.out.println("v1 and v2 are equal")

a variable declared within a block is not visible outside the block
basic scope works just like python

###################
Logic operators
###################

AND &

int a = 20, b = 14, c = 5;

// true and true resolves to true
if (a > b & b > c)
	System.out.println("a is greater than c");

OR | 

false | true 
true | false
true | true
all resolve to true

Exclusive XOR ^

false ^ true
true ^ false
resolves to true
must be opposite on both sides

Negation !

##############################
Conditional logic operators
##############################

only execute the right side of the equation if needed to determine the result
&& only executes right side if left side is true to make sure true && true
|| only executes right side if left side is false because if the left side is true than it is true

https://app.pluralsight.com/library/courses/maven-fundamentals/

