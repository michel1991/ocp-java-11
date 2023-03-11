package inheritance.errors;

/**
 *  Which is the first line to fail to compile?
    A. r1
    B. r2
    C. r3
    D. r4
    E. r5
    F. None of the above

   The Hammer class is a subclass of the Tool class.
   The repair() method can be declared in the Hammer subclass with a different return type because the parent method is not inherited.
   For these reasons, options A and C are incorrect.
   On the other hand, the use() method is package-private in Tool,
   with the overridden version in Hammer reducing the visibility to private.
   This is an invalid override, making option D correct. The rest of the lines compile without issue.

 */
class Tool {
    private void repair() {}            // r1
    void use() {}                       // r2
}

class Hammer extends Tool {
    private int repair() { return 0; } // r3
    private void use() {}              // r4
    public void bang() {}              // r5
}

public class HammerReduceModifier {

}