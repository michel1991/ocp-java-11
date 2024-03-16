package inheritance.hide;
/**
 * What will the following code print when compiled and run?
   A. 10, 40
   B. 30, 20
   C. 10, 20
   D.  30, 40
   E. 20, 30
   F.  Compilation error.
  
   Access to static and instance fields and static methods depends on the class of reference variable and not
   the actual object to which the variable points to. Observe that this is opposite of what happens in the case of instance methods.
   In case of instance methods the method of the actual class of the object is called.

    Therefore, in case of System.out.println(new MNOP().x); the reference is of type MNOP and so MNOP's x will be accessed.
    
    Had it been like this:
       ABCD a = new MNOP();
       System.out.println(a.x);
       System.out.println(a.y);
    ABCD's x and y would have been accessed because a is of type ABCD even though the actual object is of type MNOP.
    
  Correct(D)

 */
class ABCD{
    int x = 10;
    static int y = 20;
}
class MNOP extends ABCD{
    int x = 30;
    static int y = 40;
}

 class TestClass {
    public static void main(String[] args) {
        System.out.println(new MNOP().x+", "+new MNOP().y);
    }
}

public class Print3040 {
    public static void main(String[] args) {
        TestClass.main(args);
    }
}