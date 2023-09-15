package inheritance.errors.breakMultipleRule;

/**
   What is the result of compiling the following code? (Choose all that apply.)
    A. The code compiles without issue.
    B. The code will not compile because of line 2.
    C. The code will not compile because of line 5.
    D. The code will not compile because of lines 8–9.
    E. The code will not compile because of line 10.
    F. The code compiles but throws an exception at runtime.

    The code does not compile properly, so options A and F are incorrect.
    The declaration of the abstract method on line 2 compiles without issue, so option B is not correct.
    The method getAge() is not marked abstract, so it must provide a method body.
    Since it does not provide a method body, it does not compile, and option C is correct.
    Line 8 will throw a compiler error, since HoneyBadger cannot extend two classes.
    A class may extend only one other class, although it can implement multiple interfaces;
    therefore, option D is correct.
    Finally, line 9 will also throw a compiler error as the default access modifier
    is more restrictive than the public access modifier declared in either parent class.
 */
abstract class Mammal { // 1:
    public abstract int getAge(); //    2:
} //  3:
abstract class Animal { // 4:
    public int getAge(); //   5:
} //   6:
abstract interface Herbivore {} // 7:
class HoneyBadger extends Mammal, Animal // 8:
            implements Herbivore { //  9:
    int getAge() { return 5; } //  10:
} // 11:
public class HoneyBadgerFindErrors {

}