package nestedClass.errors.requireFinal;

/**
 * What is the output of the following application?
    A. Honk(1)!
    B. Honk(3)!
    C. The code does not compile.
    D. The code compiles, but the output cannot be determined until runtime.
    E. None of the above.

    The Penguin class includes a member inner class Chick.
    Member inner classes can only include static variables if they are marked final.
    Since the variable volume is not marked final,
    the Chick does not compile, making option C correct.
     Note that the variable volume referenced in the chick()
     method is one defined in the Penguin outer class.
     If the final modifier was added to the volume variable in the Chick class,
     then the rest of the code would compile, printing Honk(1)! at runtime.
 */
public class Penguin {
    private int volume = 1;
    private class Chick {
        private static int volume = 3;
        void chick() {
            System.out.print("Honk("+Penguin.this.volume+")!");
        }
    }
    public static void main(String... eggs) {
        Penguin pen = new Penguin();
        final Penguin.Chick littleOne = pen.new Chick();
        littleOne.chick();
    }
}
