package operations.switchs;
/**
   Consider the following code snippet:

    //INSERT LINE OF CODE HERE
    switch( condition ){
        case 1  : System.out.println("1");   break;
        case 2  : System.out.println("2");   break;
        case 3 : System.out.println("3");  break;
    }
    
     What type can be inserted in the code above so that the above code compiles and runs as expected ?
     
    A.
      int condition;
     It will not compile because condition is not initialized before it is used in the switch.
     
    B.
       long condition = 2;
       long, float, double, and boolean can never be used as a switch variable.
    
    C.
       var condition = new Integer("1");
        Although it is deprecated but it is still a valid option.
        The preferred way is to use parseInt(String) to convert a string to a int primitive, or use valueOf(String)
        to convert a string to an Integer object.
    D.
       String condition = "1";
        Although a String can be used in a switch statement,
        it will not work here because the case statements in the given code do not use Strings.
    E.
       var condition = new Short(1);
    This is almost a valid option but for the fact that 1 is an int and you can't instantiate a Short object with an int argument.
     That is why it will not compile. short condition = new Short((short)1); would have been valid.
     
    F.  Byte condition = 1;
   
    --------
    Rules for a switch statement
    
        1. Only String, byte, char, short, int, (and their wrapper classes Byte, Character, Short, and Integer),
        and enums can be used as types of a switch variable. String is allowed since Java 7.
        
        2. The case constants must be assignable to the switch variable.
        For example, if your switch variable is of class String, your case labels must use Strings as well.
        
        3. The switch variable must be big enough to hold all the case constants.
        For example, if the switch variable is of type char, then none of the case constants can be greater than 65535
        because a char's range is from 0 to 65535. For example, the following will not compile because 200
        cannot be assigned to the variable b, which can only hold values from -128 to 127.
        
            byte b = 10;
            switch(b){
                case 100 : System.out.print(100); //OK
                case 200 :  System.out.print(200); //will not compile
            }
            
        4. All case labels should be COMPILE TIME CONSTANTS. This means, you can have literals such as 'a', 5, 10,
         or a final variable, the value of which is computed at compile time such as int I = 2*3; For example, the following is valid:
            int x = 10;
            final int I = 2*3;
            switch(x){ 
                 case I : System.out.println(x); //this is valid because I is a compile time constant
            }
            
        5. No two of the case constant expressions associated with a switch statement may have the same value.
        6. The default label is optional and at most one default label may be associated with the same switch statement.
    Correct(C, F)
 */
public class Condition {
    
    static void responseC(){
        //INSERT LINE OF CODE HERE
        var condition = new Integer("1");
        switch( condition ){
            case 1  : System.out.println("1");   break;
            case 2  : System.out.println("2");   break;
            case 3 : System.out.println("3");  break;
        }
    }
    
    static void responseF(){
        //INSERT LINE OF CODE HERE
        Byte condition = 1;
        switch( condition ){
            case 1  : System.out.println("1");   break;
            case 2  : System.out.println("2");   break;
            case 3 : System.out.println("3");  break;
        }
    }
    public static void main(String... args){
        responseC();
        responseF();
    }
}