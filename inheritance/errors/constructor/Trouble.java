package inheritance.errors.constructor;

/**
   Given the following two classes in the same package,
   which constructors contain compiler errors? (Choose three.)
   
    A. public Big(boolean stillIn)
    B. public Trouble()
    C. public Trouble(int deep)
    D. public Trouble(String now, int... deep)
    E. public Trouble(long deep)
    F. public Trouble(double test)
    
    The constructors declared by options A, D, and F compile without issue.
    Option B does not compile. Since there is no call to a parent constructor
    or constructor in the same class, the compiler inserts a no-argument
    super() call as the first line of the constructor.
    Because Big does not have a no-argument constructor,
    the no-argument constructor Trouble() does not compile.
    Option C also does not compile because super() and this() cannot be called in the same constructor.
    Finally, option E does not compile.
    There is no matching constructor that can take a String followed by a long value.
 */
class Big { // i remove public 
    public Big(boolean stillIn) {
        super();
    }
}

public class Trouble extends Big {
    public Trouble()  {}
    public Trouble(int deep) {
        super(false);
        this();
    }
    public Trouble(String now, int... deep) {
        this(3);
    }
    public Trouble(long deep) {
        this("check",deep);
    }
    public Trouble(double test) {
        super(test >5 ? true : false);
    }
}