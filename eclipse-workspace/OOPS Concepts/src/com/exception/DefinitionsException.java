/*

Types of Java Exceptions:

There are mainly two types of exceptions: checked and unchecked. 
Here, an error is considered as the unchecked exception. 
According to Oracle, there are three types of exceptions:
Checked Exception
Unchecked Exception
Error


Difference between Checked and Unchecked Exceptions:

1) Checked Exception
The classes which directly inherit Throwable class except RuntimeException and Error are known as checked exceptions e.g. IOException, SQLException etc. 
Checked exceptions are checked at compile-time.
2) Unchecked Exception
The classes which inherit RuntimeException are known as unchecked exceptions e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc. 
Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
3) Error
Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.

1. try:
The "try" keyword is used to specify a block where we should place exception code. The try block must be followed by either catch or finally. It means, we can't use try block alone.

2. catch:
The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.

3. finally:
The "finally" block is used to execute the important code of the program. It is executed whether an exception is handled or not.

4. throw:
The "throw" keyword is used to throw an exception.

5. throws:
The "throws" keyword is used to declare exceptions. It doesn't throw an exception. It specifies that there may occur an exception in the method. It is always used with method signature.























































*/