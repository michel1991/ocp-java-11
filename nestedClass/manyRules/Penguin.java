package nestedClass.manyRules;

/**
 * What is true of the following code? (Choose three.)
    A. It compiles as is.
    B. It does not compile as is.
    C. Removing line 2 would create an additional compiler error.
    D. Removing line 2 would not create an additional compiler error.
    E. Removing the static modifier on line 3 would create an additional compiler error.
    F. Removing the static modifier on line 3 would not create an additional compiler error.

    The code does compile as is, making option A correct.
    Removing line 2 would cause a compiler error in the main()
    method since the enum inside Chick is not referenced.

    This makes option C the next answer.
    Finally, option E is the final answer because an enum cannot
    be defined in a non-static inner class.
    Only top-level types and static nested classes can define static members
    other than static constants, and enums are implicitly static.
 */
  class Penguin { // 1:
  enum Baby { EGG } //   2:
  static class Chick { //  3:
    enum Baby { EGG } // 4:
  } //  5:
  public static void main(String[] args) { //  6:
    boolean match = false; //   7:
    Baby egg = Baby.EGG; // 8:
    switch (egg) { //   9:
      case EGG: //   10:
      match = true; //  11:
    } //  12:
  } // 13:
} // 14:
