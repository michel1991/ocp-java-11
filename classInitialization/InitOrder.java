package classInitialization;

/**
 * What is the output of the following?
    A. 1223445
    B. 2445
    C. 22445
    D. 223445
    E. 2233445
    F. None of the above

   This class is never instantiated, so the instance initializer never outputs 1,
   and the constructor never outputs 3. This rules out options A, D, and E.
   A static initializer runs only once for the class, which rules out option C.
   Option B is correct because the static initializer runs once printing 2,
   followed by the static method callMe() printing 4 twice,
   and ending with the main() method printing 5.

 */
public class InitOrder {
    { System.out.print("1"); }
    static { System.out.print("2"); }

    public InitOrder() {
        System.out.print("3");
    }
    public static void callMe() {
        System.out.print("4");
    }
    public static void main(String[] args) {
        callMe();
        callMe();
        System.out.print("5");
    }
}