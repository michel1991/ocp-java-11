package operations.switchs.errors;

/**
   What will be printed by the following code if it is run with command line: java TestClass -0.50 ?
    A. Hello
    B. World
    C. Hello World
    D. Hello World Good Bye
    E. None of the above.
    
    Observe that the method getSwitch() has been declared to return a double.
    Its return value is being used in the switch statement.
    Therefore, the program will not even compile because double/float/long/boolean cannot be used in a switch statement.
    
    Correct(E)

 */
public class TestClass{
    public static double getSwitch(String str){
       return Double.parseDouble(str.substring(1, str.length()-1) );
    }
    public static void main(String args []){
          switch(getSwitch(args[0])){
             case 0.0 : System.out.println("Hello");
             case 1.0 : System.out.println("World"); break;
             default : System.out.println("Good Bye");
          }
    }
 }

public class DoubleInSwitch {
    public static void main(String[] args){
        TestClass.main(args);
     }
}