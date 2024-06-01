package operations.switchs;

/**
   What, if anything, is wrong with the following code?
   
    A. Data Type of 'x' is not valid to be used as an expression for the switch clause.
       --------------
        x is an int and int is perfectly valid. long, double, boolean, and float are not valid.
       
    B. The case label 0 must precede case label 1.
        While ordering may be important for the logic being implemented in the code, technically, any order is valid.
        
    C. Each case section must end with a break keyword.
         This is not necessary.
         If there is no break at the end of a case section, the control
         will fall through to the next case section (even if the case label doesn't match).
       
    D. The default label must be the last label in the switch statement.
        Any order of case statements is valid.
        
    E. There is nothing wrong with the code.
    
    F. The last case statement is invalid.
      'a' and 'b' are chars (and are therefore valid integral values). They can be used as case labels for a switch that uses an int variable.

        Note that 'a'|'b' produces a char value that is the result of the bitwise OR operation on 'a' and 'b'.
        It does not mean that the case will be executed when the value of x is 'a' or 'b'.
        This case will be executed when the value of x matches the value of the bitwise OR of 'a' and 'b',
        which is actually same as the char value 'c'. The following is how 'a'|'b' is computed.
        
        'a' = 97 = 1100001
        'b' = 98 = 1100010
        'a'|'b'    =  1100011  <== same as 'c'.
        
        It does
        
      --------------------------------
  
       Rules for a switch statement

        1. Only String, byte, char, short, int, (and their wrapper classes Byte, Character, Short, and Integer),
        and enums can be used as types of a switch variable. String is allowed since Java 7.
        
        2.The case constants must be assignable to the switch variable. For example, if your switch variable is of class String,
        your case labels must use Strings as well.
        
        3. The switch variable must be big enough to hold all the case constants.
        For example, if the switch variable is of type char, then none of the case constants can be greater
        than 65535 because a char's range is from 0 to 65535. For example, the following will not compile
        because 200 cannot be assigned to the variable b, which can only hold values from -128 to 127.
        
        byte b = 10;
        switch(b){
            case 100 : System.out.print(100); //OK
            case 200 :  System.out.print(200); //will not compile
        }
        
        4. All case labels should be COMPILE TIME CONSTANTS. This means, you can have literals
        such as 'a', 5, 10, or a final variable, the value of which is computed at compile time such as int I = 2*3; For example,
        the following is valid:
        
        int x = 10;
            final int I = 2*3;
            switch(x){ 
            case I : System.out.println(x); //this is valid because I is a compile time constant
        }
        
        5. No two of the case constant expressions associated with a switch statement may have the same value.
        6. The default label is optional and at most one default label may be associated with the same switch statement.
       
            Correct(E)
 */
public class BitWiseABCharWithInteger {
    void test(int x){
        switch(x){
            case 1:
            case 2:
            case 0:
            default :
            case 4:
            case 'a'|'b': System.out.println('c');
        }
    }
    
    public static void main(String... args){
        var bitwise= new BitWiseABCharWithInteger();
        bitwise.test(2);
    }
}