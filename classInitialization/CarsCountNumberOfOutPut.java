
package classInitialization;
/**
   How many lines does the following code output?
    A. One.
    B. Two.
    C. Three.
    D. Four.
    E. Five.
    F. None of the above. The code does not compile.

     You Answered Correctly!
    The static initializer is run only once.
   The static method is run twice since it is called twice.
   Therefore, three lines are printed, and option C is correct.
   The instance initializer block is never run because the Cars class is never constructed.



 */
class Cars {
    static {
        System.out.println("static");
    }
    private static void drive() {
        System.out.println("fast");
    }
    { System.out.println("faster"); }
    public static void main(String[] args) {
        drive();
        drive();
    }
}

public class CarsCountNumberOfOutPut {

}