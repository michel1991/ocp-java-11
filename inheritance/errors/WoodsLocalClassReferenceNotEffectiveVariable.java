package inheritance.errors;

/**
 *  What is the output of the following application?
    A. 8
    B. Line p1 contains a compiler error.
    C. Line p2 contains a compiler error.
    D. Another line of code contains a compiler error.
    E. None of the above.

    The main() method defines a local class Oak that correctly extends Tree, a static nested class.
    The method getWater() is not permitted to read the local variable water,
    though, since it is not final or effectively final, making option C correct.
    If the last line of the method was removed, though, then the program would compile and print 8.
 */
class Woods {
    static class Tree {}
    public static void main(String[] leaves) {
        int heat = 2;
        int water = 10-heat;
        final class Oak extends Tree {  // p1
            public int getWater() {
                return water;             // p2
            }
        }
        System.out.print(new Oak().getWater());
        water = 0;
    }
}


public class WoodsLocalClassReferenceNotEffectiveVariable{

}