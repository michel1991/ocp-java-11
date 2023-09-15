package inheritance.errors.breakMultipleRule;

/**
  Which statements about the following declarations are correct? (Choose all that apply.)
    A. It compiles without issue.
    B. It does not compile because Airplane is not marked public.
    C. It does not compile because of an access modifier error.
    D. It does not compile because you cannot inherit the same method from both an interface and abstract class.
    E. It does not compile because you cannot inherit the same variable from both an interface and an abstract class.
    F. It does not compile for a reason not listed here.

  The code does not compile for two reasons, making option A incorrect.
  First, while the interface method isFast() declared
  on line 3 is assumed to be abstract, the method on line 7 is not.
  For this reason, line 7 does not compile since
  it is missing the abstract modifier, making option F correct.
  Next, the Airplane class inherits two versions of isFast(),
  one that is assumed to be public from the HasEngine interface,
  and one that (if corrected) is package-private.
  A class can inherit multiple versions of the same method,
  provided they are compatible, which they are in this case, making option D incorrect.
  That said, the concrete method on line 10 must use the least
  restrictive access modifier, in this case public.
  Since the default (package-private) modifier is used,
  line 10 does not compile, making option C correct.
  Option B is incorrect because any of the three top-level types can be public,
  provided only one of them is marked as such and the filename matches that type.
  Finally, option E is incorrect, as a class can inherit variables with the same name.
  Remember, variables are not overridden, just hidden, in subclasses.
 */
interface HasEngine { // 1:
    int speed = 10; //   2:
    boolean isFast(); //  3:
} //  4:
abstract class Vehicle { // 5:
    int speed = 15; //   6:
    boolean isFast(); //   7:
} //    8:
class Airplane extends Vehicle implements HasEngine { // 9:
    boolean isFast() { return true; } //  10:
} //   11:

public interface AirPlaneAccessModifier {

}