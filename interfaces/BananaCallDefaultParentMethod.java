package interfaces;



/**
  Fill in the blank with the line of code that allows the program to compile and print E at runtime.
    A. Edible.getColor()
    B. Edible.super.getColor()
    C. super.Edible.getColor()
    D. super.getColor()
    E. The code does not compile regardless of what is inserted into the blank.
    F. None of the above.

    The code compiles, even if the blank is replaced with a constant char value,
    making option E incorrect. Note that the class correctly overrides both inherited default methods.
    It is possible to access a default method, even if it is overridden in the class,
    but requires using the super keyword properly.
    Option B demonstrates the correct syntax.
    Note that option D would not be correct even if there was only one inherited default method.
 */
interface Fruit {
    public default char getColor() { return 'F'; }
}
interface Edible  {
    public default char getColor() { return 'E'; }
}
 class Banana implements Fruit, Edible {
    public char getColor() { return  Edible.super.getColor() ; } // _______________
    public static void main(String[] a) {
        var d = new Banana();
        System.out.println(d.getColor());
    }
}

public class BananaCallDefaultParentMethod {
    public static void main(String[] a) {
        Banana.main(a);
    }
}