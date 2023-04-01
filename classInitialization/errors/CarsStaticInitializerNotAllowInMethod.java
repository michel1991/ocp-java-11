package classInitialization.errors;

/**
 *  How many lines does the following code output?
        A. One.
        B. Two.
        C. Three.
        D. Four.
        E. None of the above. The code does not compile.
        
       A static initializer is not allowed inside a method.
       It should go on the class level rather than the method level.
       Therefore, the code does not compile, and option E is correct.

 */
class Cars {
    private static void drive() {
        static {
            System.out.println("static");
        }
        System.out.println("fast");
        { System.out.println("faster"); }

    }
    public static void main(String[] args) {
        drive();
        drive();
    }
}

public class CarsStaticInitializerNotAllowInMethod {
  
}