package interfaces.errors;

/**
 * Which statements about the following program are correct? (Choose all that apply.)

    A. It compiles and runs without issue.
    B. The code will not compile because of line 1.
    C. The code will not compile because of line 2.
    D. The code will not compile because of line 4.
    E. The code will not compile because of line 7.
    F. The code will not compile because line 8 contains an invalid method override.

    Lines 1 and 2 are declared correctly, with the implicit modifier abstract
    being applied to the interface and the implicit modifiers public,
    static, and final being applied to the interface variable, making options B and C incorrect.
    Option D is incorrect, as an abstract method cannot include a body.
    Option E is also correct because the wrong keyword is used.
    A class implements an interface, it does not extend it.
    Option F is incorrect as the implementation of eatGrass() in IsAPlant does not have the same signature;
    therefore, it is an overload, not an override.
 */
public abstract interface Herbivore { // 1:
    int amount = 10; //   2:
    public void eatGrass(); //    3:
    public abstract int chew() { return 13; } // 4:
} //   5:
// 6:
abstract class IsAPlant extends Herbivore { // 7:
    Object eatGrass(int season) { return null; } //   8:
} //  9: