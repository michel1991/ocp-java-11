package interfaces.accessStaticMethod.errors;

/**
 * Which statements about the following code are correct?
   A. Code for class HomeOffice will cause compilation to fail.
   B. Code for interface WFH will cause compilation to fail.
    Since Java 9, an interface is allowed to have private (but not protected) static as well as instance methods.
    
   C. It will compile fine and print R No 1, Home when run.
   D. Line at //1 will cause compilation to fail.
   E. Line at //2 will cause compilation to fail.
   
     Since the declared type of variable off is Office, the compiler will check the call to getAddress against the Office interface.
     However, getAddress in Office is static and Java 8 requires a static interface method to be invoked using the interface
     name instead of a reference variable. That is why, the compiler will raise the following error message:
    
    TestClass.java:26: error: illegal static interface method call
        System.out.println(h.getAddress()); //2
                                    ^
    the receiver expression should be replaced with the type qualifier 'Office'
    1 error
    
    Correct(E)
     */
interface House{
public default String getAddress(){
    return "101 Main Str";
}
}

interface Office {
public static String getAddress(){
    return "101 Smart Str";
}
}

interface WFH extends House, Office{
    private boolean isOffice(){ return true; }
}

class HomeOffice implements House, Office{
public String getAddress(){
    return "R No 1, Home";
}
}


public class HomeOfficeTestClass {
    public static void main(String[] args) {
        Office off = new HomeOffice();  //1
        System.out.println(off.getAddress()); //2
    }
}