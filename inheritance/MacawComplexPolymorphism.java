package inheritance;

class Bird { // 1:
    int feathers = 0; //  2:
    Bird(int x) { this.feathers = x; } //  3:
    Bird fly() { //   4:
        return new Bird(1); //  5:
    } } //     6:

class Parrot extends Bird { // 7:
    protected Parrot(int y) { super(y); } //  8:
    protected Parrot fly() { //   9:
        return new Parrot(2); // 10:
    } } // 11:


    /**
    * Which statement about the following program is correct?
        A. One line contains a compiler error.
        B. Two lines contain compiler errors.
        C. Three lines contain compiler errors.
        D. The code compiles but throws a ClassCastException at runtime.
        E. The program compiles and prints 3.
        F. The program compiles and prints 0.

        The compiles and runs without issue, making options A through D incorrect.
        The fly() method is correctly overridden in each subclass since the signature is the same, the access modifier is less restrictive, and the return types are covariant.
        For covariance, Macaw is a subtype of Parrot, which is a subtype of Bird, so overridden return types are valid.
        Likewise, the constructors are all implemented properly, with explicit calls to the parent constructors as needed.
        Line 19 calls the overridden version of fly() defined in the Macaw class, as overriding replaces the method regardless of the reference type.
        This results in feathers being assigned a value of 3.
        The Macaw object is then cast to Parrot, which is allowed because Macaw inherits Parrot.
        The feathers variable is visible since it is defined in the Bird class, and line 19 prints 3, making option E the correct answer.
    */
    public class MacawComplexPolymorphism extends Parrot{ // 2:
        public MacawComplexPolymorphism(int z) { super(z); } // 13:
        public MacawComplexPolymorphism fly() { //  14:
            return new MacawComplexPolymorphism(3); //  15:
        } // 16:

        public static void main(String... sing) { // 17:
            Bird p = new MacawComplexPolymorphism(4); // 18:
            System.out.print(((Parrot)p.fly()).feathers); //   19:
        } //  20:
}