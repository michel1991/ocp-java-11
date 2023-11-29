#### Which of the following statements regarding inner classes are true ?
* A. A non static inner class may have static members.
The modifier 'static' is only allowed in constant variable declarations for an inner class.
It is a compile-time error if an inner class declares a member that is explicitly or implicitly static ,
unless the member is a constant variable (As per JLS 11 : 4.12.4).
```java
        class OuterClass {
            public class InnerClass {
                static final int VAL = 10; //COMPILES FINE
                static final String STR = "1234"; //COMPILES FINE
        
        
                static final Object obj = new Object(); //DOES NOT COMPILE, not sure why though!
        
                static int val2 = 10; //DOES NOT COMPILE because it is not final
                static final void method() {} //DOES NOT COMPILE because it is a method
            }
        }
```

* B. Anonymous inner classes cannot have any 'extends' or 'implements' clause.
* C. Anonymous inner classes can only be created for interfaces.
    It can also be created for classes.
* D. Anonymous inner classes can never have initialization parameters.
They can if they are for classes.
* E. Anonymous inner classes cannot be static.


If anonymous class is created for interface, it extends Object class and implement that interface,
if it is created for a class then it extends that class. Inner classes are allowed to declare
static final fields that are compile time constants as members.
Inner classes can't have static methods though. Example:

```java
    public class Outer
    {
        class Inner
        {
            static final  int k = 10;
        }
    }
```


Consider the anonymous inner class for catching action events:

```java
    ActionListener al = new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
        }
    };
```

Here, the anonymous class implicitly extends Object and implements the interface ActionListener.
Explicit extends or implements clauses are not allowed for such classes. Other inner class (i.e. non anonymous)
can have them. Consider the following (although of no use) class:

```java
    public class TestClass
    {
        public TestClass(int i)  {    }
        public void m1()
        {
            TestClass al = new TestClass(10)
            {
                public void actionPerformed(ActionEvent e)
                {
                }
            };
        }
    }
```

This illustrates :
    1. Inner class can extend the outer class.
    2. Anonymous inner class can be created for classes. (Not just for interfaces). They implicitly extend the class.(Here, TestClass)
    3. Anonymous inner class can have initialization parameter. (If the class they extend has a corresponding constructor).
(Correct A, B, E)

#### Which of the following statements are true?

* A. A nested class may be declared static.
    FYI, JLS defines the following terminology in chapter 8:
    A top level class is a class that is not a nested class.
    A nested class is any class whose declaration occurs within the body of another class or interface.
    An inner class is a nested class that is not explicitly or implicitly declared static.
* B. Anonymous inner class may be declared public.
* C. Anonymous inner class may be declared private.
* D. Anonymous inner class may be declared protected.
* E. Anonymous inner class may extend an abstract class.

```java
abstract class SomeClass {   public abstract void m1(); }
public class TestClass
{
    public static class StaticInnerClass { }  //option 1

    public SomeClass getSomeClass()
    {
        return new SomeClass()
        {
            public void m1() { }
        };
    }
}
``` 
Note that the anonymous class created inside the getSomeClass() method above extends the abstract class SomeClass.
(correct A, E)

### Which of these statements are true?

* A. Non-static inner class cannot have static members.
    They can have final fields but the static fields have to be final constants.
* B. Objects of static nested classes can be created without creating instances of their Outer classes.
* C. Member variables in any nested class cannot be declared final.
    Nested classes can have final members (i.e. methods and fields)
* D. Anonymous classes cannot define constructors explicitly in Java code.
* E Anonymous classes cannot be static.

Non-static nested classes (aka inner classes) can contain final static fields (but not static methods).
Anonymous classes cannot have explicitly defined constructors, since they have no explicitly defined names.

Remember: A nested class is any class whose declaration
occurs within the body of another class or interface.
A top level class is a class that is not a nested class.
An inner class is a nested class that is not explicitly or implicitly declared static.
A class defined inside an interface is implicitly static.

Consider the following nested class B which is static:
```java
public class A  //This is a standard Top Level class.
{
    class X
    {
        static final int j = 10;  //compiles fine!
    }
    public static class B //This is a static nested class
    {
    }
}
```


You can create objects of B without having objects of A. For example: A.B b = new A.B();
Members in outer instances are directly accessible using simple names.
There is no restriction that member variables in inner classes must be final.
Nested classes define distinct types from the enclosing class,
and the instanceof operator does not take of the outer instance into consideration.

(Correct is B, D, E)

### Anonymous inner classes always extend directly from the Object class.

* A. True
* B. False

When you create an anonymous class for an interface, it extends from Object. For example,

```txt
button.addActionListener( new ActionListener() {
    public void actionPerformed(ActionEvent ae) { } }  );

But if you make an anonymous class from another class then it extends from that class. For example, consider the following class:
class MyListener implements ActionListener
{
    public void actionPerformed(ActionEvent ae) {
        System.out.println("MyListener class"); }
}

button.addActionListener( new MyListener() {
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Anonymous Listener class"); }
    } );
            
```


Here the anonymous class actually extends from MyListener
class and successfully overrides the actionPerformed() method.
Correct(B)


