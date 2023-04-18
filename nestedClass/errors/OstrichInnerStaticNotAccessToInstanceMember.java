package nestedClass.errors;

/**
* The following code appears in a file named Ostrich.java. What is the result of compiling the source file?
    A. The code compiles successfully, and one bytecode file is generated: Ostrich.class.
    B. The code compiles successfully, and two bytecode files are generated: Ostrich.class and OstrichWrangler.class.
    C. The code compiles successfully, and two bytecode files are generated: Ostrich.class and Ostrich$OstrichWrangler.class.
    D. A compiler error occurs on line 4.
    E. A compiler error occurs on line 6.

   The code OstrichWrangler class is a static nested class;
   therefore, it cannot access the instance member count.
   For this reason, line 6 does not compile, and option E is correct.
   If the static modifier on line 4 was removed,
   then the class would compile and produce
   two files:Ostrich.class and Ostrich$OstrichWrangler.class.
   You don’t need to know that $ is the syntax,
   but you do need to know the number of classes
   and that OstrichWrangler is not a top-level class.
 */
class Ostrich { // 1:
    private int count; //  2:
    private interface Wild {} //  3:
    static class OstrichWrangler implements Wild { //   4:
        public int stampede() { //    5:
            return count; //  6:
        } } } //   7:

public class OstrichInnerStaticNotAccessToInstanceMember {

}