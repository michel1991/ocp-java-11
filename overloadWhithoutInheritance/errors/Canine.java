package overloadWhithoutInheritance.errors;

/**
 What is the result of executing the following program?
    A. 15
    B. 25
    C. 35
    D. One line does not compile.
    E. Two lines do not compile.
    F. The program compiles but throws an exception at runtime.
    
    The first woof() method does not compile because bark is a primitive,
    not an object, and does not have a toString() method.
    The main() method also does not compile because it is static and all
    of the woof() methods require an instance of Canine. Since these two lines do not compile,
    option E is the correct answer. If the toString() was removed from
    the first method and all of the methods were marked static,
    then the program would print 15 at runtime.
 */
public class Canine {
    public String woof(int bark) {
        return "1"+bark.toString();
    }

    public String woof(Integer bark) {
        return "2"+bark.toString();
    }

    public String woof(Object bark) {
        return "3"+bark.toString();
    }

    public static void main(String[] a) {
        System.out.println(woof((short)5));
    }
}