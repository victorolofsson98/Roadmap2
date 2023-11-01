### 1. Identifiers in java
Identifiers are the names of local variables, instance and class variables, and labels, 
but also the names for classes, packages, modules and methods. 
All Unicode characters are valid, not just the ASCII subset. 

- i. All identifiers can begin with a letter, a currency symbol or an underscore (_). 
According to the convention, a letter should be lowercase for variables. \
- ii. The first character of identifiers can be followed by any combination of letters, 
digits, currency symbols and the underscore. 
The underscore is not recommended for the names of variables. 
Constants (static final attributes and enums) should be in all Uppercase letters.\
- iii. Most importantly identifiers are case-sensitive

Legal identifiers: MinNumber, total, ak74, hello_world, $amount, _under_value \
Illegal identifiers: 74ak, -amount

### 2. White spaces in Java

A line containing only white spaces, possibly with the comment, 
is known as a blank line, and the Java compiler totally ignores it.

### 3. Access Modifiers

These modifiers control the scope of class and methods.

Access Modifiers: default, public, protected, private.
Non-access Modifiers: final, abstract, static, transient, synchronized, volatile, native.

### 4. Understanding Access Modifiers:

| Access Modifier | Within Class | Within Package | Outside Package by <br/>subclass Only | Outside Package |
|-----------------|--------------|----------------|---------------------------------------|-----------------|
| Private         | Yes          | No             | NO                                    | NO              |
| Default         | Yes          | Yes            | NO                                    | NO              |
| Protected       | Yes          | Yes            | Yes                                   | No              |
| Public          | Yes          | Yes            | Yes                                   | Yes             |

### 5. Java Keywords

<a href="C:\Users\victo\Desktop\code\JavaProjects\Screenshots\JavaKeyWords.png" rel="some text">
    <img src="C:\Users\victo\Desktop\code\JavaProjects\Screenshots\JavaKeyWords.png" alt="" />
</a>


### 6. APIs

Download APIs with their JAR files, and then import the files into your folder and import the jar file to your class.
https://youtu.be/RRubcjpTkks?t=738

### 7. Class

The class is a blueprint (plan) of the instance of a class (object). 
It can be defined as a logical template that share common properties and methods.
- Example1: Blueprint of the house is class.
- Example2: In real world, Alice is an object of the “Human” class.

### 8. Object

The object is an instance of a class. It is an entity that has behavior and state.

* Example: Dog, Cat, Monkey etc. are the object of “Animal” class.
* Behavior: Running on the road.


### 9. Method

The behavior of an object is the method.

* Example: The fuel indicator indicates the amount of fuel left in the car.

