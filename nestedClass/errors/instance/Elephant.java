package nestedClass.errors.instance;

/**
 * Which statement about the Elephant program is correct?
    A. It compiles and prints 6.
    B. The code does not compile because of line k1.
    C. The code does not compile because of line k2.
    D. The code does not compile because of line k3.
    E. The code does not compile because of line k4.
    F. None of the above.
    
    The question may appear to be about method overriding,
    but it is in fact about member inner classes. In fact,
    all of the method overrides are valid in this class.
    The code does not compile because
    the charge() method is static (even though it is called on an instance),
    which means it requires an instance to instantiate
    a member of the member inner class MyTrunk.
    For this reason,
    the call to new MyTrunk() does not compile,
    and option F is correct.
 */
interface Long {
    Number length();
}


public class Elephant {
    public class Trunk implements Long {
        public Number length() { return 6; }   // k1
    }
    public class MyTrunk extends Trunk {      // k2
        public Integer length() { return 9; }  // k3
    }
    public static void charge() {
        System.out.print(new MyTrunk().length());
    }
    public static void main(String[] cute) {
        new Elephant().charge();               // k4
    }
}