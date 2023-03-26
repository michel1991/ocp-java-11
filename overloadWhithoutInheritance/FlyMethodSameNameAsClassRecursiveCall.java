package overloadWhithoutInheritance;

/**
    How many lines of the following class contain compilation errors?
    A. None.
    B. One.
    C. Two.
    D. Three.
    E. Four.
    F. The answer cannot be determined with the information given.

  As ugly as the class looks, it does compile, making option A correct.
  Lines 2–4 each define an instance method since they each have a name and return type.
  There is no rule saying you cannot define a method with the same name as the class,
  although it is considered bad style.
  The main() method calls the default no-argument constructor on line 6,
  inserted by the compiler.
  Finally, line 7 calls the method declared on line 2.
 */
class Fly { // 1:
    public Fly Fly() { return Fly(); } //    2:
    public void Fly(int kite) {} //   3:
    public int Fly(long kite) { return 1; } //  4:
    public static void main(String[] a) { //     5:
        var f = new Fly(); //   6:
        f.Fly(); //  7:
    } //   8:
} // 9:

public class FlyMethodSameNameAsClassRecursiveCall {
    public static void main(String[] a) {
        // Fly.main(a); infinite call
    }
}