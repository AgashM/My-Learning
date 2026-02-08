**INHERITANCE IN JAVA**

Inheritance is the concept in OOP, that allows the class to acquire the properties and behavior from another class. Helps in creating new class from the existing class.

* A subclass can use the fields and methods of the parent class without rewriting the code.
* A subclass can add new fields or methods, or modify the existing one tp extend the functionality.

_Syntax:_
`class Animal{}
class Dog extends Animal{}`

In Java , the inheritance is implemented using `extends` keyword.

**Types of Inheritance in Java**
1. **Single Inheritance** (subclass derived form one parent class)
2. **Multi level Inheritance** (base class is inherited by a derived class, then the derived class itself acts as a base class for another derived class)
3. **Multiple Inheritance - Through Interfaces** (one subclass can have more than one base or parent class, and inherit all features from both the parent)
4. **Hierarchical Inheritance** (one or more subclass inherited from one base class. More than one derived class is created from one base class)
5. **Hybrid Inheritance (Single+Multiple Inheritance)** (mix of one or more of above inheritance. We can achieve Hybrid by using Interfaces)

