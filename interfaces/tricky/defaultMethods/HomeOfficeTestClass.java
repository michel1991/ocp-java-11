package interfaces.tricky.defaultMethods;

/**
 Which statements about the following code are correct?
 
    A. Code for class HomeOffice will cause compilation to fail.
    B. Line at //1 will cause compilation to fail.
    C. Line at //2 will cause compilation to fail.
    D. The code will compile successfully if the getAddress method is removed from class HomeOffice.
     --
        If you remove getAddress method from HomeOffice, the class will fail to compile
        because the class will now have two different implementations of the same method
        and the compiler will not be able to figure out which method to invoke.
        To prevent this situation, Java prohibits a class from inheriting multiple implementations of the same method from different unrelated interfaces.
         However, if a class provides its own implementation of the same method,
         the ambiguity is removed because the compiler can unambiguously invoke the implementation provided by the class itself.
    E.It will compile fine and print R No 1, Home when run.

     ---- correct(E)

 */
interface House{
    public default String getAddress(){
       return "101 Main Str";
    }
  }
  
  interface Office {
    public default String getAddress(){
       return "101 Smart Str";
    }
  }
  
  class HomeOffice implements House, Office{
    public String getAddress(){
       return "R No 1, Home";
    }
  }
  
   class TestClass { // public
  
    public static void main(String[] args) {
      House h = new HomeOffice();  //1
      System.out.println(h.getAddress()); //2
    }
  }

public class HomeOfficeTestClass {
    
}