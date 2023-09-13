package inheritance.errors.polymorphism;

/**
   What is the output of the following code?

    A. Orca diving
    B. Orca diving deeper 3
    C. The code will not compile because of line 2.
    D. The code will not compile because of line 4.
    E. The code will not compile because of line 11.
    F. The code will not compile because of line 16.
    G. None of the above

    The interface and classes are structured correctly, but the body of the main()
    method contains a compiler error.
    The Orca object is implicitly cast to a Whale reference on line 7.
    This is permitted because Orca is a subclass of Whale.
    By performing the cast, the whale reference on line 8
    does not have access to the dive(int... depth) method.
    For this reason, line 8 does not compile.
    Since this is the only compilation error,
    option G is the correct answer.
    If the reference type of whale was changed to Orca,
    then the main() would compile and print Orca diving deeper 3 at runtime,
    making option B the correct answer.
    Note that line 16 compiles because the interface variable
    MAX is inherited as part of the class structure.
 */
interface Jump { // 1:
    static public int MAX = 3; //   2:
} //  3:
abstract class Whale implements Jump { // 4:
    public abstract void dive(); //   5:
    public static void main(String[] args) { //  6:
        Whale whale = new Orca(); //   7:
        whale.dive(3); //     8:
    } //  9:
} //    10:
 class Orca extends Whale { // 11:
    public void dive() { // 12:
        System.out.println("Orca diving"); //    13:
    } // 14:
    public void dive(int... depth) { //    15:
        System.out.println("Orca diving deeper "+MAX); //    16:
    } } //    17:
public class WhaleCallInvalidMethod {

}