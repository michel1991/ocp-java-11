package nestedClass.errors;

/**
  What is the output of the following application?
    A. TALL
    B. The code does not compile because of line w1.
    C. The code does not compile because of line w2.
    D. The code does not compile for another reason.
    E. The code compiles, but the application does not produce any output at runtime.
    F. None of the above.
    
    The Bottle class includes a static nested class Ship that must be instantiated in a static manner.
    Line w2 uses an instance of Bottle to instantiate the Ship.
    Therefore, line w2 does not compile, and option C is the correct answer.
     Note that if Ship were changed to be a member inner class,
     the code would still not compile since a member inner class cannot include static members and enums are inherently static.
 */
class Bottle {
    public static class Ship {
        private enum Sail {          // w1
            TALL {protected int getHeight() {return 100;}},
        SHORT {protected int getHeight() {return 2;}};
            protected abstract int getHeight();
        }
    public Sail getSail() {
            return Sail.TALL;
        }
    }
    public static void main(String[] stars) {
        var bottle = new Bottle();
        Ship q = bottle.new Ship();  // w2
        System.out.print(q.getSail());
    }
}

public class BottleBadCreationOfStaticClass {
  
}