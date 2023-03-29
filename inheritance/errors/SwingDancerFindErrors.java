package inheritance.errors;
// package ballroom;

/**
 * Which statement about the following program is correct? (Choose two.)

    A. The code does not compile because of line u1.
    B. The code does not compile because of line u2.
    C. The code does not compile because of line u3.
    D. The code does not compile because of line u4.
    E. At least three of the classes compile without issue.
    F. All of the classes compile without issue.

    Line u2 does not compile because getPartner() is overridden
    with a return type that is not covariant, as Follower is not the same
    type nor a subtype of the Leader class.
    Line u4 also does not compile because SwingDancer
    is marked abstract and cannot be instantiated directly.
    For these reasons, options B and D are the correct answers.
    The rest of the code compiles without issue.
 */


class Leader {}
class Follower {}
abstract class Dancer {
    public Leader getPartner() { return new Leader(); }
    abstract public Leader getPartner(int count);  // u1
}

abstract class SwingDancer extends Dancer {
    public Leader getPartner(int x) { return null; }
    public Follower getPartner() {                 // u2
        return new Follower();                      // u3
    }
    public static void main(String[] args) {
        new SwingDancer().getPartner();             // u4
    }
}

public class SwingDancerFindErrors {

}