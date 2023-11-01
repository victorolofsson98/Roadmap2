# Exception Handling

6 Reasons why we use exception handling:
- Invalid user input
- Device failure
- loss of network connection
- Physical limitations (out of disk memory)
- code errors
- opening an unavailable file
--------------------------------------------
- Error: An Error indicates a serious problem that a reasonable application should not try to catch.
- Exception: Exception indicates conditions that a reasonable application might try to catch.
--------------------------------------------
- checked and unchecked exceptions. are built in exceptions by Java\
checked exceptions are called compile time exceptions because 
they are exceptions that are checked 
at compile-time by the compiler.
whiles unchecked are not.

Sometimes, the built-in exceptions in Java are not able to describe a certain situation. In such cases, 
users can also create exceptions, which are called ‘user-defined Exceptions’. 

````java

//program to print the exception information using printStackTrace() method
 
import java.io.*;
 
class GFG {
    public static void main (String[] args) {
        int a=5;
        int b=0;
        try {
          System.out.println(a/b);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
}

````