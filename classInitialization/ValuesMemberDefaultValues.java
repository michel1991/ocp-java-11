package classInitialization;


/**
 * Which of the following are true about the following code? (Choose two.)
 
    A. When you fill in both blanks with double, it prints 8.00.0
    B. When you fill in both blanks with double, it prints 8.0
    C. When you fill in both blanks with int, it prints 8
    D. When you fill in both blanks with int, it prints 80
    E. When you fill in both blanks with var, it prints 8
    F. When you fill in both blanks with var, it prints 80
    
    The static class variables cannot be used with var since they are not local variables.
    Therefore, options E and F are incorrect.
    Options B and C are correct because numeric addition is used here instead of concatenation.
 */
class Values {
    static double defaultValue = 8; //  static ____
    static double DEFAULT_VALUE; // static ____ 

    public static void main(String[] args) {
        System.out.println(defaultValue + DEFAULT_VALUE);
    }
}


public class ValuesMemberDefaultValues {

    public static void main(String[] args) {
        Values.main(args);
    }
    
}