package interfaces.tricky.defaultMethods;

/**
 *  Which statements about the following code are correct?
    A. Code for interface House will cause compilation to fail.
    B.  Code for interface Bungalow will cause compilation to fail.
    C. Code for class MyHouse will cause compilation to fail.
    D. Line at //1 will cause compilation to fail.
    E. Line at //2 will cause compilation to fail.
    F. The code will compile successfully.
    
   There is no problem with the code.
   It is perfectly valid for a subinterface to override a default method of the base interface.
   A class that implements an interface can also override a default method.
   It is valid for MyHouse to say that it implements Bungalow as well as House even though House is redundant because Bungalow is a House anyway.
   It will actually print 101 Smart str.
   
   Correct(F)

 */


interface House{
    public default String getAddress(){
        return "101 Main Str";
    }
}

interface Bungalow extends House{
    public default String getAddress(){
        return "101 Smart Str";
    }
}

class MyHouse implements Bungalow, House{

}


class TestClass {

    public static void main(String[] args) {
        House ci = new MyHouse();  //1
        System.out.println(ci.getAddress()); //2
    }
}

public class InMultipleClassAtSameHierachy {
    public static void main(String[] args) {
        TestClass.main(args);
    }
}