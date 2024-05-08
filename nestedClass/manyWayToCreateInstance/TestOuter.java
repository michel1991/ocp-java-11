package nestedClass.manyWayToCreateInstance;
/**
 * Consider the following code:
    A. new TestInner(); at //1
     Valid because 'this' instance of TestOuter is associated with TestInner object.
    
    B. new TestInner(); at //2
    There has to be some instance of TestOuter associated with TestInner object. static method does not have 'this'.
    
    C. new to.TestInner(); at //2
    It should be to.new TestInner();
    
    D. new TestOuter.TestInner(); at //2
    This can be used only if TestInner is a static inner class.
    
    E. new TestOuter().new TestInner(); at //1
    Correct(A, E)
 */
public class TestOuter {
    
    public void myOuterMethod()
        {
            // 1
            new TestInner();  //1 response
            new TestOuter().new TestInner(); // at 1
        }
        public class TestInner { }
        public static void main(String[] args)
        {
            var to = new TestOuter();
            // 2
        }
}