/*

Understanding Java Programs

In Java programs, we have to enclose everything inside a Class.
Syntax: public class ClassName {	}
This class term is used as syntax to create/define a Class in Java In Java programs, execution starts from the main method
Syntax of main() method - public static void main(String args[]){ } All the Java statements in Java should end with ';' symbol
Example for a Java Statement is nothing but print statement - System.out.println("Hello World"); All the Java statements should be written inside the methods
We generally write code which is nothing but a set of statements inside the methods Keywords like public, static, void and String args[] will be explained later


Print Statements:
Print
Println

Comments:
Single line      // 
Multiple line    /*         */

/*
Variables:
Local Variable
Instance Variables or Class Variables

Local Variables
A variable which is declared inside the method is called local variable

Instance Variables
A variable which is declared inside the class but outside the method is called Instance variable 
We have to specify the static text before the instance variable as the method which is going to use this variable is a static method


Data Types:

byte
short 
int
long
float
double
char
String
boolean

Primitive Data Types:
byte, short , int, long, float, double, char, boolean

Non-Primitive Data Types: 
Strings, Arrays, Classes, Interfaces
Object oriented
can create objects using new keyword

Operators:

Logical: &&, ||, !
Arithmetic: +, _, *, /, %, ++, --
Relational: ==, !=, >, <, >=, <=
Assignment: =, +=, -+, *=, /+, %=
Other : Conditional or Ternary
(a<b)?a:b; 

a<b = true //a
a<b = false //b

Flow Control:
Flow Control describes the order in which statements will be executed at run time.

Selection: if, if...else, if...else..if...else, switch
Iterative: while, do...while, for, foreach
Transfer: break, continue, return, try,catch,finally

Selection Statements:

Selection Statements have one or more conditions which return either true or false when evaluated.
Based on the returned value, the set of code will be executed.
When condition is true, the set of code will be executed.
When condition is false, the set of code wont be executed.

 
if statements:

Code inside the if decision making statement executed only when the condition provided inside if decision making statement returns true. 
Demonstrate the execution of the statements inside if block when the if condition is true. 
Demonstrate that statements inside if block are skipped from execution when the if condition is false. 

if ... else statements

While using if ... else decision making statement, code inside if block gets executed when the if condition is true and code inside else block gets executed when the if condition is false. 
Demonstrate the execution of statements inside if block when the if condition is true 
Demonstrate the execution of statements inside else block when the if condition is false 

if ... else if ... else statements

if .. else if .. else statements contains more than one conditions. If the first if condition returns false, the code inside the if block will be skipped and control will be taken to the next conditions i.e. else if conditions. If all the else if conditions return false, the code inside else if blocks will be skipped and the code inside the else block without condition will be executed. (View screenshot here) Syntax (View screenshot here)
Demonstrate the program when all the if and else if conditions have returned false and code inside the else block is executed 
Demonstrate the program when the if condition has returned true and code inside the if block got executed skipping all the remaining else if and else blocks 
Demonstrate the program when one of the else if condition has returned true and code inside that else if block got executed skipping all the remaining if, else if and else blocks

switch statements

Based on result of a condition expression, switch case chooses one of many possibilities. 
The result of a condition expression needs to result a int or character or a string value.

 
Iterative Statements

Iterative Statements helps us in executing the same block of code multiple times.
Iterative Statements executes the same set of code until the loop condition is satisfied. 

while loop:

while loop executes the same block of code multiple times i.e. until the boolean condition turns false. while loop tests the condition before executing the code in loop body.
Demonstrate the while loop when the condition is always true 
Loop will be iterated infinite times as the condition is always true
Demonstrate the while loop when the condition is false 
Loop wont be executed at-least once as the condition is false.
Demonstrate the while loop where the condition is initially true and after few iterations is turned false 
Loop will be executed until the condition turns false.

do while loop:

do-while loop works similar to while loop, but the block of code will be executed at-least once even after the condition is false
Unlike while loop, do-while loop tests the condition after executing the code in loop body. 
Demonstrate the do-while loop where the condition is initially true and after few iterations has turned false 
Loop will be iterated multiple times until the condition becomes false


for loop:

for loop is the most commonly used loop in Java and is used when we know the number of iterations in advance.
for loop executes the same block of code multiple times, until the boolean condition turns false.
Though while loop and for loop work in the similar manner, while loop is preferred over for loop when we dont know the number of iterations in advance.
Demonstrate the for loop when the condition is initially true and after few iteration has turned false 
Loop will be iterated multiple times until the condition becomes false 

 for(int i=0; i<=n; i++)
 {
 
 }
 
 foreach loop: Arrays and Collections
 
 for(declaration : expression) {
// Statements
}

Break:

When a break statement is encountered inside a loop, the loop is immediately terminated and the program control resumes at the next statement following the loop.
The Java break statement is used to break loop or switch statement. 
It breaks the current flow of the program at specified condition. In case of inner loop, it breaks only inner loop.


Continue:

The continue statement is used in loop control structure when you need to jump to the next iteration of the loop immediately. 
It can be used with for loop or while loop.
The Java continue statement is used to continue the loop. 
It continues the current flow of the program and skips the remaining code at the specified condition. 
In case of an inner loop, it continues the inner loop only.
 

Return:

Java return keyword is used to complete the execution of a method. The return followed by the appropriate value that is returned to the caller. This value depends on the method return type like int method always return an integer value.
It is used to exit from the method.
It is not allowed to use return keyword in void method.
The value passed with return keyword must match with return type of the method.
 
 
==============================================================================================

List of Java Keywords
A list of Java keywords or reserved words are given below:

abstract: Java abstract keyword is used to declare abstract class. Abstract class can provide the implementation of interface. It can have abstract and non-abstract methods.
boolean: Java boolean keyword is used to declare a variable as a boolean type. It can hold True and False values only.
break: Java break keyword is used to break loop or switch statement. It breaks the current flow of the program at specified condition.
byte: Java byte keyword is used to declare a variable that can hold an 8-bit data values.
case: Java case keyword is used to with the switch statements to mark blocks of text.
catch: Java catch keyword is used to catch the exceptions generated by try statements. It must be used after the try block only.
char: Java char keyword is used to declare a variable that can hold unsigned 16-bit Unicode characters
class: Java class keyword is used to declare a class.
continue: Java continue keyword is used to continue the loop. It continues the current flow of the program and skips the remaining code at the specified condition.
default: Java default keyword is used to specify the default block of code in a switch statement.
do: Java do keyword is used in control statement to declare a loop. It can iterate a part of the program several times.
double: Java double keyword is used to declare a variable that can hold a 64-bit floating-point numbers.
else: Java else keyword is used to indicate the alternative branches in an if statement.
enum: Java enum keyword is used to define a fixed set of constants. Enum constructors are always private or default.
extends: Java extends keyword is used to indicate that a class is derived from another class or interface.
final: Java final keyword is used to indicate that a variable holds a constant value. It is applied with a variable. It is used to restrict the user.
finally: Java finally keyword indicates a block of code in a try-catch structure. This block is always executed whether exception is handled or not.
float: Java float keyword is used to declare a variable that can hold a 32-bit floating-point number.
for: Java for keyword is used to start a for loop. It is used to execute a set of instructions/functions repeatedly when some conditions become true. If the number of iteration is fixed, it is recommended to use for loop.
if: Java if keyword tests the condition. It executes the if block if condition is true.
implements: Java implements keyword is used to implement an interface.
import: Java import keyword makes classes and interfaces available and accessible to the current source code.
instanceof: Java instanceof keyword is used to test whether the object is an instance of the specified class or implements an interface.
int: Java int keyword is used to declare a variable that can hold a 32-bit signed integer.
interface: Java interface keyword is used to declare an interface. It can have only abstract methods.
long: Java long keyword is used to declare a variable that can hold a 64-bit integer.
native: Java native keyword is used to specify that a method is implemented in native code using JNI (Java Native Interface).
new: Java new keyword is used to create new objects.
null: Java null keyword is used to indicate that a reference does not refer to anything. It removes the garbage value.
package: Java package keyword is used to declare a Java package that includes the classes.
private: Java private keyword is an access modifier. It is used to indicate that a method or variable may be accessed only in the class in which it is declared.
protected: Java protected keyword is an access modifier. It can be accessible within package and outside the package but through inheritance only. It can't be applied on the class.
public: Java public keyword is an access modifier. It is used to indicate that an item is accessible anywhere. It has the widest scope among all other modifiers.
return: Java return keyword is used to return from a method when its execution is complete.
short: Java short keyword is used to declare a variable that can hold a 16-bit integer.
static: Java static keyword is used to indicate that a variable or method is a class method. The static keyword in Java is used for memory management mainly.
strictfp: Java strictfp is used to restrict the floating-point calculations to ensure portability.
super: Java super keyword is a reference variable that is used to refer parent class object. It can be used to invoke immediate parent class method.
switch: The Java switch keyword contains a switch statement that executes code based on test value. The switch statement tests the equality of a variable against multiple values.
synchronized: Java synchronized keyword is used to specify the critical sections or methods in multithreaded code.
this: Java this keyword can be used to refer the current object in a method or constructor.
throw: The Java throw keyword is used to explicitly throw an exception. The throw keyword is mainly used to throw custom exception. It is followed by an instance.
throws: The Java throws keyword is used to declare an exception. Checked exception can be propagated with throws.
transient: Java transient keyword is used in serialization. If you define any data member as transient, it will not be serialized.
try: Java try keyword is used to start a block of code that will be tested for exceptions. The try block must be followed by either catch or finally block.
void: Java void keyword is used to specify that a method does not have a return value.
volatile: Java volatile keyword is used to indicate that a variable may change asynchronously.
while: Java while keyword is used to start a while loop. This loop iterates a part of the program several times. If the number of iteration is not fixed, it is recommended to use while loop.

====================================================================================================================================================================================================================================
 
 Advantage of naming conventions in java
By using standard Java naming conventions, you make your code easier to read for yourself and other programmers. Readability of Java program is very important. It indicates that less time is spent to figure out what the code does.

The following are the key rules that must be followed by every identifier:

The name must not contain any white spaces.
The name should not start with special characters like & (ampersand), $ (dollar), _ (underscore).
Let's see some other rules that should be followed by identifiers.

Class:

It should start with the uppercase letter.
It should be a noun such as Color, Button, System, Thread, etc.
Use appropriate words, instead of acronyms.
Example: -
public class Employee  
{  
//code snippet  
}  


Interface:

It should start with the uppercase letter.
It should be an adjective such as Runnable, Remote, ActionListener.
Use appropriate words, instead of acronyms.
Example: -
interface Printable  
{  
//code snippet  
} 

 
Method:

It should start with lowercase letter.
It should be a verb such as main(), print(), println().
If the name contains multiple words, start it with a lowercase letter followed by an uppercase letter such as actionPerformed().
Example:-
 class Employee  
{  
//method  
void draw()  
{  
//code snippet  
}  
}  


Variable:

It should start with a lowercase letter such as id, name.
It should not start with the special characters like & (ampersand), $ (dollar), _ (underscore).
If the name contains multiple words, start it with the lowercase letter followed by an uppercase letter such as firstName, lastName.
Avoid using one-character variables such as x, y, z.
Example :-
  class Employee  
{  
//variable  
int id;  
//code snippet  
}  


Package:

It should be a lowercase letter such as java, lang.
If the name contains multiple words, it should be separated by dots (.) such as java.util, java.lang.
Example :-
package com.javatpoint; //package  
class Employee  
{  
//code snippet  
}  


Constant:

It should be in uppercase letters such as RED, YELLOW.
If the name contains multiple words, it should be separated by an underscore(_) such as MAX_PRIORITY.
It may contain digits but not as the first letter.
Example :-
class Employee  
{  
//constant  
 static final int MIN_AGE = 18;  
//code snippet  
}  


CamelCase in java naming conventions:

Java follows camel-case syntax for naming the class, interface, method, and variable.
If the name is combined with two words, the second word will start with uppercase letter always such as actionPerformed(), firstName, ActionEvent, ActionListener, etc.

=======================================================================================================================================




 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */
