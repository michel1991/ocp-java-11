
/**
 * Which lines can fill in the blank that would allow the code to compile? (Choose two.)
    A. boolean passed() { return part1.pass && part2.pass; }
    B. boolean passed() { return part1.passed() && part2.passed(); }
    C. private boolean passed() { return super.passed(); }
    D. public boolean passed() { return part1.passed() && part2.passed(); }
    E. public boolean passed() { return part1.pass && part2.pass; }
    F. public boolean passed() { return super.passed(); }
    
    Each option presents a potential override of the passed() method,
    since the method signature is the same.
    Options A, B, and C are incorrect because the method reduces the visibility
    of the protected method version declared in the parent class.
    Option F is incorrect, as the parent version of passed()
    is abstract and cannot be invoked.
    That leaves options D and E as valid overrides of this method.
 */
abstract   class Exam {
    boolean pass;
    protected abstract boolean passed();
    class JavaProgrammerCert extends Exam {
        private Exam part1;
        private Exam part2;
        // ______________________________________
      public boolean passed() { return part1.passed() && part2.passed(); } // response
      // public boolean passed() { return part1.pass && part2.pass; } // responses
    }
}


public class ExamCannotOverrideWithCallOfSuperOnAbstractMethod {
    
}