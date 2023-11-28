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
