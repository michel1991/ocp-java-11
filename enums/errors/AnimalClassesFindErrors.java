package enums.errors;

/**
  Which statements about the following enum are true? (Choose all that apply.)
    A. Compiler error on line 2
    B. Compiler error on line 3
    C. Compiler error on line 7
    D. Compiler error on line 8
    E. Compiler error on line 10
    F. Compiler error on another line
    G. The code compiles successfully.

  Enums are required to have a semicolon (;)
  after the list of values if there is anything else in the enum.
  Don’t worry, you won’t be expected
  to track down missing semicolons on the whole exam—only on enum questions.
  For this reason, line 5 shouldhave a semicolon
  after it since it is the end of the list of enums, making option F correct.
  Enum constructors are implicitly private,
  making option C correct as well. The rest of the enum compiles without issue.

 */
enum AnimalClasses { // 1:
    MAMMAL(true), INVERTIBRATE(Boolean.FALSE), BIRD(false), //   2:
    REPTILE(false), AMPHIBIAN(false), FISH(false) { //    3:
        public int swim() { return 4; } //   4:
    } //  5:
    final boolean hasHair; //  6:
    public AnimalClasses(boolean hasHair) { //  7:
        this.hasHair = hasHair; //     8:
    } //  9:
    public boolean hasHair() { return hasHair; } //    10:
    public int swim() { return 0; } //   11:
} //   12:


public class AnimalClassesFindErrors {

}