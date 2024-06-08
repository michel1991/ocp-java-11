package nestedClass.manyWayToCreateInstance;

/**
   Consider the following code:

    class Outsider
    {
        public class Insider{ }
    }
    public class TestClass
    {
        public static void main(String[] args)
        {
            var os = new Outsider();
            // 1 insert line here
        }
    }
    
    Which of the following options can be inserted at //1?
    A.
      Insider in = os.new Insider();
        ---
        You cannot refer to Insider class directly (unless you import the inner
        class using import statement such as import p1.Outsider.*; where p1 is the package name).
        
        In the given code, for all purposes, the name of the class is Outsider.Insider.
        Therefore, it should be referred to as: Outsider.Insider in = os.new Insider();
        
    B.
      os.Insider in = os.new Insider();
        os.Insider implies that Insider class is in package os, which is not the case.
        
    C.
       Outsider.Insider in = os.new Insider();
        ----
        Since Insider is not a static class, it must have an associated outer class instance.

    D.  Insider in = Outsider.new Insider();
        You cannot refer to Insider class directly. You must use Outsider.Insider to declare the type of variable in.  
        Outsider.new Insider() is wrong as well because Insider is not static.
        Further, even if Insider were static, the syntax to instantiate it would be: new Outsider.Insider().
        ----
        Correct(C)
 */
class Outsider
{
    public class Insider{ }
}
class TestClass // public 
{
    public static void main(String[] args)
    {
        var os = new Outsider();
        // 1 insert line here
        Outsider.Insider in = os.new Insider();
    }
}
    
public class OutsiderInsider {
    public static void main(String[] args)
    {
        TestClass.main(args);
    }
}