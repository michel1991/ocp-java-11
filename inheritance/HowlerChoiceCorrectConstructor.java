package inheritance;
/**
* Which of the following pairs, when inserted into the blanks, allow the code to compile? (Choose all that apply.)
*   A. this(3) at line 3, this("") at line 14
    B. this() at line 3, super(1) at line 14
    C. this((short)1) at line 3, this(null) at line 14
    D. super() at line 3, super() at line 14
    E. this(2L) at line 3, super((short)2) at line 14
    F. this(5) at line 3, super(null) at line 14
    G. Remove lines 3 and 14.

  Option A is correct, as this(3) calls the constructor declared on line 5, while this("") calls the constructor declared on line 10.
  Option B does not compile, as inserting this() at line 3 results in a compiler error, since there is no matching constructor.
  Option C is correct, as short can be implicitly cast to int, resulting in this((short)1) calling the constructor declared on line 5.
  In addition, this(null) calls the String constructor declared on line 10.
  Option D does not compile because inserting super() on line 14 results in an invalid access call.
  The constructor exists in the parent Howler class but is marked private and therefore not accessible.
  Option E is also incorrect.
  Inserting this(2L) at line 3 results in a recursive constructor definition.
  The compiler detects this as reports an error.
  Option F is incorrect, as using super(null) on line 14 does not match any parent constructors.
  If an explicit cast was used, such as super((Integer)null), then the code would have compiled but would throw an exception at runtime during unboxing.
  Finally, option G is incorrect because the superclass Howler does not contain a no-argument constructor.
  Therefore, the constructor declared on line 13 will not compile without an explicit call to an overloaded or parent constructor.
 */
class Howler { // 1:
    public Howler(long shadow) { //   2:
        this(3); // 3:  ________________
    } //  4:
    private Howler(int moon) { //   5:
        super();  //  6:
    } //   7:
}  //  8:
class Wolf extends Howler { // 9:
    protected Wolf(String stars) { //    10:
        super(2L); //  11:
    }  //  12:
    public Wolf() { //  13:
        this(""); //  14:   ________________
    } //  15:
}  // 16:

class HowlerChoiceCorrectConstructor {

}