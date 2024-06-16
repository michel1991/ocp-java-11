 /**
  What will be the result when you try to compile and run the following code?

    public class TestClass
    {
       public static void main(String args[] )
       {
          var out = new Outer();
          System.out.println(out.getInner().getOi());
       }
    }
    class Outer
    {
       private int oi = 20;
       class Inner
       {
          int getOi() { return oi; }
       }
       Inner getInner() { return new Inner() ; }
    }
    
    A. The code will fail to compile as the inner class Inner is not defined properly.
    B. The code will fail to compile because the reference of an inner class cannot be passed outside the outer class.
    C. The code will fail to compile, since the method getOi( ) is not visible from the main( ) method in the TestClass.
    D. The code will compile without error and will print 20 when run.
    E. None of the above.
    
    -----
    A call to getInner( ) will return a reference to a newly created Inner class instance.
    This object is an instance of a non-static inner class and is associated with the outer instance.
    This means that an object of an inner class has access to the members within the outer instance.
    Since the inner class is within the class containing the member oi, the member will be accessible to the inner instance,
    even though oi is declared private.
    Correct(D)

  */
class TestClass // public
    {
       public static void main(String args[] )
       {
          var out = new Outer();
          System.out.println(out.getInner().getOi());
       }
}
class Outer
{
   private int oi = 20;
   class Inner
   {
      int getOi() { return oi; }
   }
   Inner getInner() { return new Inner() ; }
    }

public class OuterTestClass {
    public static void main(String args[] )
    {
      TestClass.main(args);
    }
}