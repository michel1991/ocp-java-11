package inheritance.errors.constructor;

/**
   What is the output of the following code?

    A. AALizard
    B. BALizard
    C. BLizardA
    D. ALizard
    E. The code will not compile because of line 10.
    F. None of the above

    The Reptile class defines a constructor, but it is not a no-argument constructor.
    Therefore, the Lizard constructor must explicitly call super(),
    passing in an int value. For this reason, line 9 does not compile,
    and option F is the correct answer.
    If the Lizard class were corrected to call the appropriate super() constructor,
    then the program would print BALizard at runtime, with the static initializer running first,
    followed by the instance initializer, and finally the method call using the overridden method.
 */
class Reptile { // 1:
    {System.out.print("A");} // 2:
    public Reptile(int hatch) {} //  3:
    void layEggs() { //    4:
        System.out.print("Reptile"); //    5:
    } } //   6:
 class Lizard extends Reptile { // 7:
    static {System.out.print("B");} // 8:
    public Lizard(int hatch) {} //  9:
    public final void layEggs() { //   10:
        System.out.print("Lizard"); //   11:
    } //   12:
    public static void main(String[] args) { //   13:
        Reptile reptile = new Lizard(1); //   14:
        reptile.layEggs(); //  15:
    } } //  16:
public class LizardNoExplicitParentConstructor {

}