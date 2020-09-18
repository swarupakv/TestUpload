/*

Strings:

In Java, string is basically an object that represents sequence of char values. An array of characters works same as Java string. For example:

char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
String s=new String(ch);

CharSequence Interface:

The CharSequence interface is used to represent the sequence of characters. String, StringBuffer and StringBuilder classes implement it. 
It means, we can create strings in java by using these three classes.
The Java String is immutable which means it cannot be changed. 
Whenever we change any string, a new instance is created. For mutable strings, you can use StringBuffer and StringBuilder classes.

There are two ways to create String object:
By string literal
By new keyword

Java String literal is created by using double quotes. For Example:

String s="welcome";  
Each time you create a string literal, the JVM checks the "string constant pool" first. 
If the string already exists in the pool, a reference to the pooled instance is returned. 
If the string doesn't exist in the pool, a new string instance is created and placed in the pool. For example:

String s1="Welcome";  
String s2="Welcome";//It doesn't create a new instance  

In the above example, only one object will be created. Firstly, JVM will not find any string object with the value "Welcome" in string constant pool, that is why it will create a new object. 
After that it will find the string with the value "Welcome" in the pool, it will not create a new object but will return the reference to the same instance.

New Keyword:
String s=new String("Welcome");

Immutable String in Java:
In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.
Once string object is created its data or state can't be changed but a new string object is created.

Java String Compare:

1. equals(): compares values
The String equals() method compares the original content of the string. It compares values of string for equality. String class provides two methods:
public boolean equals(Object another) compares this string to the specified object.
public boolean equalsIgnoreCase(String another) compares this String to another string, ignoring case.


2. == operator: compares reference

3. CompateTo()
The String compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.
Suppose s1 and s2 are two string variables. If:
s1 == s2  : 0
s1 > s2   :positive value   1
s1 < s2   :negative value  -1















































































*/