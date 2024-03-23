package overloadWhithoutInheritance.tricky;
/**
 * Consider the following code:
   What would be the output when the above program is compiled and run? (Assume that FileNotFoundException
   is a subclass of IOException, which in turn is a subclass of Exception
   )
    A. It will print Object Version
    B. It will print java.io.IOException Version
    C. It will print java.io.FileNotFoundException Version
    D. It will not compile.
    E. It will throw an exception at runtime.
    
    (Correct C)
    
    The reason is quite simple, the most specific method depending upon the argument is called.
    Here, null can be passed to all the 3 methods but FileNotFoundException class is the subclass
    of IOException which in turn is the subclass of Object. So, FileNotFoundException class is the most specific class.
    So, this method is called.
    Had there been two most specific methods, it would not even compile as the compiler will not be able to determine which method to call.
    For example:
    
    public class TestClass{
       public void method(Object o){
          System.out.println("Object Version");
       }
       public void method(String s){
          System.out.println("String Version");
       }
       public void method(StringBuffer s){
          System.out.println("StringBuffer Version");
       }
       public static void main(String args[]){
          TestClass tc = new TestClass();
          tc.method(null);
       }
    }
    
    
    Here, null can be passed as both StringBuffer and String and none is more specific than the other. So, it will not compile.
    
 */
 class TestClass{
    public void method(Object o){
        System.out.println("Object Version");
    }
    public void method(java.io.FileNotFoundException s){
        System.out.println("java.io.FileNotFoundException Version");
    }
    public void method(java.io.IOException s){
        System.out.println("IOException Version");
    }
    public static void main(String args[]){
        TestClass tc = new TestClass();
        tc.method(null);
    }
}

public class MostSpecificWithNullAndInheritanceAsParameters {
    public static void main(String args[]){
        TestClass.main(args);
    }
}