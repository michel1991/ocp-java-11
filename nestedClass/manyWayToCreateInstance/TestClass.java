package nestedClass.manyWayToCreateInstance;
/**
  Which of the given options if put at //1 will compile without any error?

    public class TestClass
    {
        public class A
        {
        }
        public static class B
        {
        }
        public void useClasses()
        {
            //1
        }
    }
    
    A. new TestClass().new A();
    B. new TestClass.B();
    C. new A();
    D. new TestClass.A();
    E.All of these are valid.
    
   ---------------------------------------
   class A is not static inner class of TestClass. So it cannot exist without an outer instance of TestClass.
    class B is static inner class and can be instantiated without an outer instance of TestClass.
    Now, the method useClasses() is an instance method. So, it already has instance of outer class associated with it.
    So, new A(); is also valid. new TestClass.A(); is same as new A().
    
    Although not related to this question, FYI, an anonymous class can never be static.
    Even if created in a static method.
    
    Correct(E)

 */
public class TestClass {
    public class A
    { 
    }
    public static class B
    {
    }
    public void useClasses()
    {
        new TestClass().new A();
        new TestClass.B();
        new A();
        new TestClass.A();
        
    }
}