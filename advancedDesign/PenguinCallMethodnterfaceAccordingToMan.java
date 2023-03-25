package advancedDesign;

/**
  Given the following program, what can be inserted into the blank line that would allow it to print Swim! at runtime?
    A. super.perform();
    B. Swim.perform();
    C. super.Swim.perform();
    D. Swim.super.perform();
    E. The code does not compile regardless of what is inserted into the blank.
    F. The code compiles, but due to polymorphism, it is not possible to produce the requested output without creating a new object.

   First off, if a class or interface inherits two interfaces
   containing default methods with the same signature,
   then it must override the method with its own implementation.
   The Penguin class does this correctly, so option E is incorrect.
   The way to access an inherited default method
   is by using the syntax Swim.super.perform(), making option D correct.
   We agree the syntax is bizarre, but you need to learn it.
   Options A, B, and C are incorrect and result in compiler errors.
 */
interface Swim {
    default void perform() { System.out.print("Swim!"); }
}

interface Dance {
    default void perform() { System.out.print("Dance!"); }
}

class Penguin implements Swim, Dance {
    public void perform() { System.out.print("Smile!"); }
    public void doShow() { // access modifier from private to public
        Swim.super.perform();  //____________________
    }

}

public class PenguinCallMethodnterfaceAccordingToMan {
    public static void main(String[] eggs) {
        new Penguin().doShow();
    }
}