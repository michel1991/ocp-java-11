package generics;
import java.lang.annotation.*;

/**
    What is the result of the following code?
    A. hi followed by a runtime exception
    B. hi-1hola-true
    C. The first compiler error is on line 1.
    D. The first compiler error is on line 4.
    E. The first compiler error is on line 5.
    F. The first compiler error is on line 9.
    G. The first compiler error is on line 10.

    The class compiles and runs without issue. Line 10 gives a compiler warning for not using generics but not a compiler error.
    Line 4 compiles fine because toString() is defined on the Object class and is therefore always available to call.
    Line 9 creates the Hello class with the generic type String. It also passes an int to the println() method, which gets autoboxed into an Integer.
    While the println() method takes a generic parameter of type T, it is not the same <T> defined for the class on line 1.
    Instead, it is a different T defined as part of the method declaration on line 5.
    Therefore, the String argument on line 9 applies only to the class.
    The method can actually take any object as a parameter including autoboxed primitives.
    Line 7 creates the Hello class with the generic type Object since no type is specified for that instance.
    It passes a boolean to println(), which gets autoboxed into a Boolean.
    The result is that hi-1hola-true is printed, making option B correct.
 */
 class Hello<T> {
    T t; // 2
    public Hello(T t) { this.t = t; } // 3
    public String toString() { return t.toString(); } // 4
    public <T> void println(T message) { // 5
        System.out.print(t + "-" + message); // 6
    } // 7

    public <U> void genericTypeOfMethodIsNotTheSameOfMethod(U message) {
        System.out.print(t + "-" + message);
    }

 }

public class HelloWithGeneric {

    public static void removeUnchecked(){
        new Hello<String>("hola").<Boolean>println(true);
        new Hello<String>("hi").<Integer>println(1);
    }

    @SuppressWarnings("unchecked")
    public static void withUnchecked(){
        new Hello<String>("hi").println(1); // 9
        new Hello("hola").println(true); // 10
    }
    public static void main(String[] args) { // 8
         removeUnchecked();
         withUnchecked();
     }
} // 11