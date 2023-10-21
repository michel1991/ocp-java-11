package classInitialization.inheritance;

/**
* What is the result of the following?
    A. qu qu qumrcrc
    B. u u ucrcrm
    C. uq uq uqmcrcr
    D. uq uq uqcrcrm
    E. qu qu qumcrcr
    F. qu qu qucrcrm
    G. The code does not compile.

    The code compiles, so option G is incorrect.
    Based on order of initialization, the static components are initialized first,
    starting with the Arachnid class,
    since it is the parent of the Scorpion class, which initializes sb to u.
    The static initializer in Scorpion then updates sb to contain uq,
    which is printed twice by lines 13 and 14 along with spaces separating the values.
    Next, an instance of Arachnid is initialized on line 15.
    There are two instance initializers in Arachnid,
    and they run in order, appending cr to sb, resulting in a value of uqcr.
    An instance of Scorpion is then initialized on line 16.
    The instance initializers in the superclass Arachnid run first,
    appending cr again and updating the value of sb to uqcrcr.
    Finally, the instance initializer in Scorpion runs and appends m.
    The program completes with the final value printed being uq uq uqcrcrm, making option D the correct answer.

 */
class Arachnid { // 1:
    static StringBuilder sb = new StringBuilder(); //  2:
    { sb.append("c"); } //   3:
    static //   4:
    { sb.append("u"); } // 5:
    { sb.append("r"); } //  6:
} //    7:
public class Scorpion extends Arachnid { // 8:
    static //  9:
    { sb.append("q"); } //  10:
    { sb.append("m"); } //    11:
    public static void main(String[] args) { //    12:
        System.out.print(Scorpion.sb + " "); // 13:
        System.out.print(Scorpion.sb + " "); //    14:
        new Arachnid(); //  15:
        new Scorpion(); // 16:
        System.out.print(Scorpion.sb); // 17:
    }
} // 18:

