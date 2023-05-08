package inheritance.errors.constructor;

/**
 *  Which statements about the following class are correct? (Choose two.)
    A. LackOfInformationException compiles without issue.
    B. The constructor declared at line t1 does not compile.
    C. The constructor declared at line t2 does not compile.
    D. The constructor declared at line t3 does not compile.
    E. The getMessage()method does not compile because of the @Override annotation.
    F. LackOfInformationException is a checked exception.
    
    The LackOfInformationException class does not compile, making option A incorrect.
    The compiler inserts the default no-argument constructor into InformationException,
    since the class does not explicitly define any.
    Since LackOfInformationException extends InformationException,
    the only constructor available in the parent class is the no-argument call to super().
    For this reason, the constructor defined at line t1 does not compile because
    it calls a nonexistent parent constructor that takes a String value,
    and option B is one of the correct answers. The other two constructors
    at lines t2 and t3 compile without issue, making options C and D incorrect.
    Option E is also incorrect. The getMessage() method is inherited,
    so applying the @Override annotation is allowed by the compiler.
    Option F is the other correct answer.
    The LackOfInformationException is a checked exception because it inherits Exception but not RuntimeException.
 */
class InformationException extends Exception {}
class LackOfInformationException
extends InformationException {
    public LackOfInformationException() {             // t1
        super("");
    }
    public LackOfInformationException(String s) {     // t2
        this(new Exception(s));
    }
    public LackOfInformationException(Exception c) {  // t3
        super();
    }
    @Override public String getMessage() {
        return "lackOf";
    }
}


public class LackOfInformationExceptionMissing {
    
}