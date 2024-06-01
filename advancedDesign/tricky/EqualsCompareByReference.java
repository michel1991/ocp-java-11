package advancedDesign.tricky;

/**
  What will the following program print?
    A. true
    B. false
    C. It will not compile.
    D. It will compile but throw an exception at run time.
    E. None of the above.
    
    ----------------------------
    Object class's equals() method just checks whether the two references are pointing to the same location or not.
    In this case they really are pointing to the same location because of obj2 = obj1; so it returns true.
    Correct(A)

 */
 class TestClass{ // public
    public static void main(String[] args){
        Object obj1 = new Object();
        Object obj2 = obj1;
        if( obj1.equals(obj2) ) System.out.println("true");
        else  System.out.println("false");
    }
}


public class EqualsCompareByReference {
    public static void main(String[] args){
        TestClass.main(args);
    }
}