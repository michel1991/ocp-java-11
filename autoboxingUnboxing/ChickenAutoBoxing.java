package autoboxingUnboxing;
/**
* What is the result of this code?
     A. many 1 one 3 one 2
    B. many 2 one 3 one 2
    C. many 1 many 3 one 2
    D. many 2 one 3 many 2
    E. The code does not compile.
    F. An exception is thrown.

  Java tries to use more specific method signatures first.
  The first call to layEggs() cannot use the int signature since it has two parameters.
  Java uses zero-based indexes, so it outputs many 1.
  The other two calls can use the int signature.
  The last one uses autoboxing to convert the Integer to an int.
 */
class Chicken {
    private void layEggs(int... eggs) {
        System.out.print("many " + eggs[0] + " ");
    }
    private void layEggs(int eggs) {
        System.out.print("one " + eggs + " ");
    }
    public static void main() {
        Chicken c = new Chicken();
        c.layEggs(1, 2);
        c.layEggs(3);
        c.layEggs(new Integer(2));
    }
}


public class ChickenAutoBoxing {
    public static void main(String[] args) {
        Chicken.main();
    }
}