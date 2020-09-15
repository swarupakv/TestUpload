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



 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */
