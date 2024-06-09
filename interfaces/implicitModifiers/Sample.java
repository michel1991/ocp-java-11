package interfaces.implicitModifiers;
/**
  Consider the following class and interface definitions (in separate files):
  
   What will happen when the above code is compiled and run?
    A. It will give an error at compile time at line //1.
    B. It will give an error at compile time at line //2.
    C. It will give an error at compile time at line //3
    D. It will give an error at compile time at line //4.
    E. It will compile and run without any problem.
    
    ----------------
    As a rule, fields defined in an interface are public, static, and final. The methods are public.
    Here, the interface IInt defines thevalue and thus any class that implements this interface gets this field.
    Therefore, it can be accessed using s.thevalue or just thevalue inside the class.
    Also, since it is static, it can also be accessed using IInt.thevalue or Sample.thevalue.
     Correct(E)

 */
public class Sample implements IInt{
    public static void main(String[] args){
        Sample s = new Sample();  //1
        int j = s.thevalue;       //2
        int k = IInt.thevalue;    //3
        int l = thevalue;         //4
    }
}
interface IInt{ // public 
        int thevalue = 0;
}