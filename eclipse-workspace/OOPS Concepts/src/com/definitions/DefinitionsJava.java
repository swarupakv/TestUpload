package com.definitions;

public class DefinitionsJava {

/*
	
1. Class:

	The class is a group of similar entities.Class in Java determines how an object will behave and what the object will contain.
	class <class_name>{  
    field;  
    method;  
  }
=============================================================================================

	
2. Object:

An object can be defined as an instance of a class, and there can be multiple instances of a class in a program. 
An Object contains both the data and the function, which operates on the data.
An object is nothing but a self-contained component which consists of methods and properties to make a particular type of data useful. 
From a programming point of view, an object can include a data structure, a variable, or a function. 
It has a memory location allocated. The object is designed as class hierarchies.

ClassName ReferenceVariable = new ClassName();

===============================================================================================

3. Inheritance:

Inheritance is an OOPS concept in which one object acquires the properties and behaviors of the parent object. 
It’s creating a parent-child relationship between two classes.
JAVA INHERITANCE is a mechanism in which one class acquires the property of another class. 
In Java, when an "Is-A" relationship exists between two classes, we use Inheritance. 
The parent class is called a super class and the inherited class is called a subclass. 
The keyword extends is used by the sub class to inherit the features of super class.
Inheritance is important since it leads to the reusability of code.	

class subClass extends superClass  
{  
   //methods and fields  
} 

Surgeon IS-A Doctor



Single Inheritance:
In Single Inheritance one class extends another class (one class only).

Class B extends A

Multiple Inheritance:
In Multiple Inheritance, one class extending more than one class. Java does not support multiple inheritance.

Class C extends A,B
	
Multilevel Inheritance:
In Multilevel Inheritance, one class can inherit from a derived class. Hence, the derived class becomes the base class for the new class.	
	
Class B extends A
Class C extends B

Hierarchical Inheritance:
In Hierarchical Inheritance, one class is inherited by many sub classes.

Class B extends A
Class C extends A
Class D extends A

Hybrid Inheritance:
Hybrid inheritance is a combination of Single and Multiple inheritance. Java does not support Hybrid Inheritance.

=====================================================================================================================
	
Constructor:

In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. 
At the time of calling constructor, memory for the object is allocated in the memory.
It is a special type of method which is used to initialize the object.

Every time an object is created using the new() keyword, at least one constructor is called.
It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.

There are two types of constructors in Java: 
no-arg constructor
parameterized constructor.

Note: It is called constructor because it constructs the values at the time of object creation. It is not necessary to write a constructor for a class. 
It is because java compiler creates a default constructor if your class doesn't have any.

Rules for creating Java constructor
There are two rules defined for the constructor.

Constructor name must be the same as its class name
A Constructor must have no explicit return type


A Java constructor cannot be abstract, static, final, and synchronized
A constructor is used to initialize the state of an object.

The purpose of constructor is to initialize the object of a class while the purpose of a method is to perform a task by executing java code. 
Constructors cannot be abstract, final, static and synchronised while methods can be.
Constructor(s) of a class must has same name as the class name in which it resides.
A constructor in Java can not be abstract, final, static and Synchronized.
Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.	
A constructor is a special type of function with no return type. ... 
We define a method inside the class and constructor is also defined inside a class. 
A constructor is called automatically when we create an object of a class. We can't call a constructor explicitly. 	
The main advantage of a constructor is that it can provide a fully initialised usable object upon object creation. 
When we pass the values of the instance variables inside a constructor, during object creation itself the variables gets initialised and hence we get a usable object immediately.	
No, you cannot call a constructor from a method. 
The only place from which you can invoke constructors using “this()” or, “super()” is the first line of another constructor. 
If you try to invoke constructors explicitly elsewhere, a compile time error will be generated.	
If there is no constructor in a class, compiler automatically creates a default constructor.
The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.
	
Types of Java constructors
There are two types of constructors in Java:

Default constructor (no-arg constructor)
Parameterized constructor

Java Default Constructor
A constructor is called "Default Constructor" when it doesn't have any parameter.

Syntax of default constructor:
<class_name>(){}  
	
Java Parameterized Constructor
A constructor which has a specific number of parameters is called a parameterized constructor.

Why use the parameterized constructor?
The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.	
	
	
===============================

Data Abstraction:

Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).
The abstract keyword is a non-access modifier, used for classes and methods:
Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
An abstract class can have both abstract and regular methods:

Why And When To Use Abstract Classes and Methods?
To achieve security - hide certain details and only show the important details of an object.

A class which is declared with the abstract keyword is known as an abstract class in Java. It can have abstract and non-abstract methods (method with the body).
There are two ways to achieve abstraction in java

Abstract class (0 to 100%)
Interface (100%)

A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its method implemented. It cannot be instantiated.

Points to Remember
An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.

Example of abstract class

abstract class A{}  

Example of abstract method

abstract void printStatus();//no method body and abstract  

=============================================================

Data Encapsulation:

Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.
We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.

Advantage of Encapsulation in Java
By providing only a setter or getter method, you can make the class read-only or write-only. In other words, you can skip the getter or setter methods.

It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only, you can write the logic inside the setter method. You can write the logic not to store the negative numbers in the setter methods.

It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.

The encapsulate class is easy to test. So, it is better for unit testing.

The standard IDE's are providing the facility to generate the getters and setters. So, it is easy and fast to create an encapsulated class in Java.

Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates.Other way to think about encapsulation is, it is a protective shield that prevents the data from being accessed by the code outside this shield.

Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of own class in which they are declared.
As in encapsulation, the data in a class is hidden from other classes using the data hiding concept which is achieved by making the members or methods of class as private and the class is exposed to the end user or the world without providing any details behind implementation using the abstraction concept, so it is also known as combination of data-hiding and abstraction..
Encapsulation can be achieved by: Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.


=====================================

this:

this is a reference variable that refers to the current object.

Here is given the 6 usage of java this keyword.

this can be used to refer current class instance variable.
this can be used to invoke current class method (implicitly)
this() can be used to invoke current class constructor.
this can be passed as an argument in the method call.
this can be passed as argument in the constructor call.
this can be used to return the current class instance from the method.

this refers to current class object
===========================================

super:

super refers to parent class object 

Usage of Java super Keyword
super can be used to refer immediate parent class instance variable.
super can be used to invoke immediate parent class method.
super() can be used to invoke immediate parent class constructor.

inheritance

==============================================

Polymorphism
Interfaces



static
final

Association
Aggregation
Composition

=============================================



















	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	*/
}




























