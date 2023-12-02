### Which of these statements about interfaces are true?

* A. Interfaces are always abstract.
* B. An interface can have static methods.
    Java 8 allows interfaces to have static methods as well as default methods.
    Java 9 allows interfaces to have private methods also.
* C. All methods in an interface are abstract although you need not declare them to be so.
    An interface may have default methods. A method marked default
    is considered a non-abstract instance method. A non-abstract class
    that implements this interface doesn't necessarily have to implement a default method.
* D. Fields of an interface may be declared as transient or volatile but not synchronized.
    All fields of an interface are public, static, and final. Therefore,
    volatile, transient, and synchronized do not make sense for such fields.
* E. Interfaces cannot be final.
* F. Interfaces allow multiple implementation inheritance through default methods.

Multiple inheritance of implementation is the ability to inherit
method definitions from multiple classes. Java does not allow a class
to extend from multiple classes but does allow
a class to implement multiple interfaces.
Prior to Java 8, interfaces were not allowed to contain
any method implementation but with Java 8,
interfaces can have method implementations
in the form of "default" methods.
This effectively allows a class inherit implementations from multiple sources.
In other words, default methods introduce one form of multiple inheritance of implementation.

However, you still cannot have a class that implements
two unrelated interfaces where both the interfaces contain
a default method with the same signature unless
the class provides an implementation for that method itself.
For example, in the following code, class C will not compile:
```java
    interface I1{
        public default void m1(){
            System.out.println("in I1.m1");
        }
    }
    interface I2{
        public default void m1(){
            System.out.println("in I2.m1");
        }
    }
    
    
    //This class will not compile
    class CI implements I1, I2{
    }
    
    //This class will compile because it provides its own implementation of m1
    class C2 implements I1, I2 {
        public void m1(){
            System.out.println("in C2.m1");
        }
    }
``` 


You can have a class inherit a method with the same signature from an interface and a superclass though.
This is allowed because the superclass's version always overrides the interface's version.
The class doesn't get two implementations. It gets only the version from super class.
(Correct A, B, E, F)