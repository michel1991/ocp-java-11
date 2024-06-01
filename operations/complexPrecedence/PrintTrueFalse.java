package operations.complexPrecedence;

/**
 What will the following lines of code print?

        System.out.println(1 + 5 < 3 + 7);
        System.out.println( (2 + 2) >= 2 + 3);
        
       A. They will not compile.
       B. 
            1false10
            false
       C.
            true
            false
       D. 
            false
            false
            
         -----
         
         Comparison operators have lower precedence than mathematical operators. Therefore, 1 + 5 < 3 + 7
         is evaluated as (1 + 5) < (3 + 7) i.e. 6<10, which prints true.
         
         Similarly,  (2 + 2) >= 2 + 3 is evaluated as  (2 + 2) >= (2 + 3) i.e. 4>=5, which prints false.
        If you have an expression,  2 + (2 >= 2) + 3, it would be tempting to answer 2true3, but actually,
        it would not compile because it would resolve to 2 + true + 3 and + operator is not overloaded for anything except String.
        Here, neither of the operands of + operator is a String.
        
        Correct(C)
            
        
 */
public class PrintTrueFalse {
    public static void main(String... args){
        System.out.println(1 + 5 < 3 + 7);
        System.out.println( (2 + 2) >= 2 + 3);
    }
}