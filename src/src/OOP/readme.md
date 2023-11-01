# OOP, Interfaces, Classes

- Object = State, behaviour and identity(hashcode).
- An object is an instance of a class. 
- A class is a template or blueprint from which objects are created. 
So, an object is the instance(result) of a class.
- Class = Fields, Methods, Constructors, Blocks. A class is a group of objects which have common properties. 
- It is a template or blueprint from which objects are created. It is a logical entity. It can't be physical.

new = The new keyword is used to allocate memory at runtime. All objects get memory in Heap memory area.

Anonymous simply means nameless. An object which has no reference is known as an anonymous object. 
It can be used at the time of object creation only.

Difference between abstract classes and interfaces:
- abstract classes and interfaces works as a template for classes that inherit them.
- interfaces doesn't have fields like abstract classes do because
that would mean every class that extends the interface would have the same
static value because fields can not be changes in an interface, because they are
static and final. So we only use the methods in interfaces which are all abstract ofcouse. 
Therefore, we have abstract classes because you dont have to instaniate the fields so all classes
that extends an abstract class can have their own value.
- So difference is:
  - Abstract:
    - dont have to initialize the fields
    - dont have to make all functions abstracts or implement them
  - Interface
    - all fields are static and final, cannot be changed.
    - all methods need to be imported to the class that implements the interface.
    - all methods are abstract

Use abstract class if you have alot of closely related classes 
that you want to have the same functionality and the same types of fields
avaiable but you might wanna use an interface instead if you have
alot of unrelated classes that you all want to be able to do a certain thing.
like you might want classes that arent animals to be able to bark().

Polymorphism = many forms:
- it means your class can do the same thing in different ways.
- it's when you have a method in a child class, overrides a method in a parent class.(overriding)
- You have 3 classes, the parent class Animal, and dog and cat.
- Animal has an eat method that prints out "much", and in the dog class
we override it to say "nom-nom". Polymorphism, boom.

method overloading: writing two or more of the same method but with 
different parameters.





