/*
 
Java array is an object which contains elements of a similar data type. Additionally, The elements of an array are stored in a contiguous memory location. 
It is a data structure where we store similar elements. We can store only a fixed set of elements in a Java array.
Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on. 
We can store primitive values or objects in an array in Java
 
Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
Random access: We can get any data located at an index position.
Size Limit: We can store only the fixed size of elements in the array. It doesn't grow its size at runtime. To solve this problem, collection framework is used in Java which grows automatically.
 
Types of Array in java:

There are two types of array.
Single Dimensional Array
Multidimensional Array

Single Dimensional Array in Java:

Syntax to Declare an Array in Java

dataType[] arr; (or)  
dataType []arr; (or)  
dataType arr[];
  
Instantiation of an Array in Java
arrayRefVar=new datatype[size]; 
 
We can declare, instantiate and initialize the java array together by:
int a[]={33,3,4,5};//declaration, instantiation and initialization  
We can also print the Java array using for-each loop. The Java for-each loop prints the array elements one by one. It holds an array element in a variable, then executes the body of the loop.
We can pass the java array to method so that we can reuse the same logic on any array.
Java supports the feature of an anonymous array, so you don't need to declare the array while passing an array to the method.
We can also return an array from the method in Java.
The Java Virtual Machine (JVM) throws an ArrayIndexOutOfBoundsException if length of the array in negative, equal to the array size or greater than the array size while traversing the array.
 
Syntax to Declare Multidimensional Array in Java"

dataType[][] arrayRefVar; (or)  
dataType [][]arrayRefVar; (or)  
dataType arrayRefVar[][]; (or)  
dataType []arrayRefVar[]; 
  
Example to instantiate Multidimensional Array in Java
int[][] arr=new int[3][3];//3 row and 3 column   
arr[0][0]=1;

Declare, instantiate, initialize and print the 2Dimensional array
If we are creating odd number of columns in a 2D array, it is known as a jagged array. In other words, it is an array of arrays with different number of columns.

Copying an Array in Java

Cloning an Array in Java
Since, Java array implements the Cloneable interface, we can create the clone of the Java array. If we create the clone of a single-dimensional array, it creates the deep copy of the Java array. It means, it will copy the actual value. But, if we create the clone of a multidimensional array, it creates the shallow copy of the Java array which means it copies the references.

Addition of 2 Matrices in Java

Multiplication of 2 Matrices in Java
In the case of matrix multiplication, a one-row element of the first matrix is multiplied by all the columns of the second matrix which can be understood by the image given below.
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */
