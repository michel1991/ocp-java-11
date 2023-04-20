package interfaces.errors;

/**
 * Which statement about the following interface is correct?
   A. The code compiles without issue.
    B. The code does not compile because of line k1.
    C. The code does not compile because of line k2.
    D. The code does not compile because of line k3.
    E. The code does not compile because of line k4.
    F. None of the above.

   The stroke() method is static, which means
   it cannot access the instance method breath() on line k2, making option C correct.
 */

 interface Swimming {
    String DEFAULT = "Diving!";      // k1
    abstract int breath();
    private static void stroke() {
        if(breath()==1) {             // k2
            System.out.print("Go!");
        } else {
            System.out.print(dive());  // k3
        }
    }
    static String dive() {
        return DEFAULT;               // k4
    }
}


public class SwimmingStaticMethodCallInstance {
  
}