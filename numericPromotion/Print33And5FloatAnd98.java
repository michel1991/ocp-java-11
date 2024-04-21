package numericPromotion;
/**
 * Which of the following statements are true?
   A. System.out.println(1 + 2 + "3"); will print 33.
    operator + is left associative so evaluation of (1 + 2 + "3" ) is as follows: ( 1 + 2 ) + "3" -> 3 + "3" -> "33".
    
  B. System.out.println("1" + 2 + 3); will print 15.
        evaluation of ("1" + 2 + 3) is as follows: ("1" + 2) + 3 -> "12" + 3 -> "123".
        
  C. System.out.println(4 + 1.0f); will print 5.0
    (4 + 1.0f ) evaluates as 4.0f + 1.0f ->5.0f -> 5.0
    
  D.
     System.out.println(5/4); will print 1.25
    (5/4) performs integer division because both 5 and 4 are integers, resulting in the value 1.
    
  E. System.out.println('a' + 1 ); will print b.
    Both operands in the expression ( 'a' + 1 ) will be promoted to int => 97 + 1 = 98
    
  All operands of type byte, char or short are promoted AT LEAST to an int before performing mathematical operations.
  If one of the operands is larger than an int then the other one is promoted to the same type.
   Note that System.out.println((float)5/4); will print 1.25. If you remove the explicit cast (float), it will print 1.
   
   Correct(A, C)
 */
public class Print33And5FloatAnd98 {
    public static void main(String...args){
        System.out.println(1 + 2 + "3");
        System.out.println(4 + 1.0f);
    }
}