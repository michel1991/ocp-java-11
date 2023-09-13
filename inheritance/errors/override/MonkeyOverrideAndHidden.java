package inheritance.errors.override;

/**
* Which statements about the following classes are correct? (Choose all that apply.)
*   A. The eat() method in Mammal is correctly overridden on line 7.
    B. The eat() method in Mammal is correctly overloaded on line 7.
    C. The drink() method in Mammal is correctly hidden on line 10.
    D. The drink() method in Mammal is correctly overridden on line 10.
    E. The dance() method in Mammal is correctly overridden on line 11.
    F. The dance() method in Mammal is correctly overloaded on line 11.
    G. The eat() method in Primate is correctly hidden on line 12.
    H. The eat() method in Primate is correctly overloaded on line 12.

  The eat() method is private in the Mammal class.
  Since it is not inherited in the Primate class, it is neither overridden nor overloaded,
  making options A and B incorrect.
  The drink() method in Mammal is correctly hidden in the Monkey class,
  as the signature is the same, making option C correct and option D incorrect.
  The version in the Monkey class throws a new exception, but it is unchecked;
  therefore, it is allowed.
  The dance() method in Mammal is correctly overridden in the Monkey class because the signatures are not the same,
  making option E incorrect and option F correct.
  For methods to be overridden, the signatures must match exactly.
  Finally, line 12 is an invalid override and does not compile,
  as int is not covariant with void, making options G and H both incorrect.

 */
class Mammal { // 1:
    private void eat() {} //  2:
    protected static void drink() {} //  3:
    public Integer dance(String p) { return null; } //  4:
} //   5:
class Primate extends Mammal { // 6:
    public void eat(String p) {} //   7:
} //   8:
class Monkey extends Primate { // 9:
    public static void drink() throws RuntimeException {} //  10:
    public Number dance(CharSequence p) { return null; } //  11:
    public int eat(String p) {} //  12:
} //  13:

public class MonkeyOverrideAndHidden {

}