package inheritance.hide;
/**
 * What is the output of the Light program?
    A. 5,5,5
    B. 5,5,7
    C. 5,7,7
    D. 7,7,7
    E. The code does not compile.
    F. None of the above.
    
    When replacing a variable in a subclass, Java uses the reference
    type to determine the variable to use.
    Option A would be correct if the size variables were treated like method overriding,
    since all of the objects in the main() method are instances of Light.
    Instead, the reference type is used. The variables v1 and v2
    are of reference type Light, so 5 is selected. Likewise,
   the variable v3 is of type Wave, so 7 is used.
   The output is 5,5,7, making option B correct.

 */
class Wave {
    public int size = 7;
}
public class Light extends Wave {
    public int size = 5;
    public static void main(String... emc2) {
        Light v1 = new Light();
        var v2 = new Light();
        Wave v3 = new Light();
        System.out.println(v1.size +","+ v2.size +","+ v3.size);
    }
}

