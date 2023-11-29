package operations.switchs;

/**
   Which of these combinations of switch expression types and case label value types
   are legal within a switch statement?
 */
public class CombinaisonExpression {

    /**
        A. switch expression of type int and case label value of type char.
     */
    
    public static void additionalInfoAnswerA(){
        //It is possible to do both, that is, switch expression of type int and case label
        // value of type char as well as switch expression of type
        // char and case label value of type int. For example:

            int i = 97;
            char ch = 'a';

            switch(i){

                //any char value is valid here because all char values
                //are assignable to an int variable.
                case 'a' : System.out.println("got a"); //prints "got a".
            }

        switch(ch){
                case 97 : System.out.println("got 97"); //prints "got 97"

            //this will NOT compile because -1 is not a valid value for a char.
            // case -1 : System.out.println("what?"); //(remove comment on this line)
            }

        /**
             Note that the following is invalid because a char cannot be assigned to an Integer:
               Integer x = 1;  // int x = 1; is valid.
                switch(x){
                    case 'a' : System.out.println("a");
                }
         */
    }
    
  /**
        B. switch expression of type float and case label value of type int.
        C. switch expression of type byte and case label value of type float.
        D. switch expression of type char and case label value of type byte.
            (all for D answer)
            This will not work in all cases because a byte may have negative values which cannot be assigned to a char.
            For example, char ch = -1; does not compile.
            Therefore, the following does not compile either:
               char ch = 'x';
               switch(ch){
        
                //this case will not compile because of "possible loss of precision"
                  case -1 : System.out.println("-1"); break;
        
                  default: System.out.println("default");    
               }
       E. switch expression of type boolean and case label value of type boolean.
   */
    
    
    /**
        Rules for a switch statement

        1. Only String, byte, char, short, int, (and their wrapper classes Byte, Character, Short, and Integer),
           and enums can be used as types of a switch variable. String is allowed since Java 7.
        2. The case constants must be assignable to the switch variable.
          For example, if your switch variable is of class String, your case labels must use Strings as well.
        3. The switch variable must be big enough to hold all the case constants.
            For example, if the switch variable is of type char, then none
            of the case constants can be greater than 65535 because a char's range is from 0 to 65535.
            For example, the following will not compile because 200 cannot be assigned to the variable b,
            which can only hold values from -128 to 127.
            
            byte b = 10;
            switch(b){
                case 100 : System.out.print(100); //OK
                case 200 :  System.out.print(200); //will not compile
            }
        4. All case labels should be COMPILE TIME CONSTANTS. This means, you can have literals such as 'a', 5, 10,
            or a final variable, the value of which is computed at compile time such as int I = 2*3;
            For example, the following is valid:
         */
         static void holdExampleRuleFour(){
            int x = 10;
            final int I = 2*3;
            switch(x){ 
                case I : System.out.println(x); //this is valid because I is a compile time constant
            }
          }

      /*  5. No two of the case constant expressions associated with a switch statement may have the same value.
          6. The default label is optional and at most one default label may be associated with the same switch statement.
     */
}