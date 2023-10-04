package enums.errors;

/**
  What is the result of the following program?
    A. v
    B. vc
    C. s
    D. missing flavor
    E. Exactly one line of code does not compile.
    F. More than one line of code does not compile.
    G. The code compiles but produces an exception at runtime.

   When using an enum in a switch statement,
   the case statement must be made up of the enum values only.
   
   If the enum name is used in the case statement value,
   then the code does not compile.
   
   For example, VANILLA is acceptable but Flavors.VANILLA is not.
   For this reason, the three case statements do not compile,
   making option F the correct answer.
   
   If these three lines were corrected,
   then the code would compile and produce a NullPointerException at runtime.

 */
public class IceCream {
    enum Flavors {
        CHOCOLATE, STRAWBERRY, VANILLA
    }

    public static void main(String[] args) {
        Flavors STRAWBERRY = null;
        switch (STRAWBERRY) {
            case Flavors.VANILLA: System.out.print("v");
            case Flavors.CHOCOLATE: System.out.print("c");
            case Flavors.STRAWBERRY: System.out.print("s");
            break;
            default: System.out.println("missing flavor"); }
    }
}