package nestedClass.errors.cannotExtend;

/**
 *  What is the output of the following application?
   A. Starting...Insulation:20
    B. Starting...Insulation:40
    C. The code does not compile because of line v1.
    D. The code does not compile because of line v2.
    E. The code does not compile for a different reason.
    
    The code does not compile because the Jacket is marked final
    and cannot be extended by the anonymous class declared on line v2.
    Since this line doesn’t compile, option D is correct.
    If the final modifier were removed from line v1,
    then the code would compile and print Starting...Insulation:20 at runtime.
 */
abstract class TShirt {
    abstract int insulate();
    public TShirt() {
        System.out.print("Starting...");
    }
}
public class Wardrobe {
    abstract class Sweater extends TShirt {
        int insulate() {return 5;}
    }
    private void dress() {
        final class Jacket extends Sweater {  // v1
            int insulate() {return 10;}
        };
        final TShirt outfit = new Jacket() {  // v2
            int insulate() {return 20;}
        };
        System.out.println("Insulation:"+outfit.insulate());
    }

    public static void main(String... snow) {
        new Wardrobe().dress();
    }
}
