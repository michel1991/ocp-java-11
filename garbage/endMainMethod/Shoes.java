
/**
   How many objects are eligible for garbage
   collection at the end of the main() method?
   
    A. None.
    B. One.
    C. Two.
    D. Three.
    E. The code does not compile.
    F. None of the above.
    
    While shoe3 goes out of scope after the shopping() method,
    the "croc" object is referenced by shoe1,
    and therefore cannot be garbage collected.
    Similarly, the "sandal" object is now referenced by shoe2.
    No variables reference the "flip flop" object,
    so it is eligible to be garbage collected.
    Finally, the Shoes object created in the main() method
    is also eligible for garbage collection,
    since there are no saved references to it.
    For these reasons, option C is correct.
 */
public class Shoes {
    static String shoe1 = new String("sandal");
    static String shoe2 = new String("flip flop");

    public void shopping() {
        String shoe3 = new String("croc");
        shoe2 = shoe1;
        shoe1 = shoe3;
    }

    public static void main(String... args) {
        new Shoes().shopping();
    }
}