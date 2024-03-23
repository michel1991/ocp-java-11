package classInitialization.inheritance;

/**
 * What will the following code print when compiled and run?
   A.
       It will not compile.
       
   B.  In X
        In Y
        In Z
   
   C.
       In Z
        In Y
        In X
        
   D.  In Y
        In X
        In Z
        
    E.
        In Z
        In X
        In Y
        
    There is no problem with the code.

    Remember that before the fields of a subclass can be initialized by a constructor, the fields of superclass have to be initialized.
    Therefore, a super class constructor must first execute before a subclass constructor can execute.
    This order of invocation of constructors goes up the chain from the subclass that is being created to the top most super class,
    which is java.lang.Object.

    The explicit call to super(); in class Y is not required because the compiler puts a call to super();
    anyway if you don't explicitly call either any super class constructor using super(...) or another constructor
    of the same class using this(...) first ( "..." refers to appropriate arguments as required for a given constructor).

    The declared type of a variable is immaterial here. Only the actual class of object that is being instantiated is important.
    Therefore, if you instantiate class Z, Z's constructor will be invoked, but internally, that constructor
    will first invoke Y's constructor before executing the rest of Z's constructor.
    Similarly, Y's constructor will first invoke X's constructor before executing the rest of Y's constructor.
    Finally, X's constructor will first invoke Objects's constructor before executing the rest of X's constructor.
    Object class's constructor doesn't print anything so no output is generated because of that.
    But once that is finished, the remaining code of X constructor's is executed, which prints "In X",
    then the control goes back to Y's constructor, which prints, "In Y".
    Finally, the control goes back to Z's constructor, which prints, "In Z".

 */
class X{
    public X(){
        System.out.println("In X");
    }
}

class Y extends X{
    public Y(){
        super();
        System.out.println("In Y");
    }
}

class Z extends Y{
    public Z(){
        System.out.println("In Z");
    }
}

public class Test {

    public static void main(String[] args) {
        Y y = new Z();
    }
}