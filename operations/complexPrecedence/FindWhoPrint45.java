package operations.complexPrecedence;

/**
  Given:
   int expr1 = 3 + 5 * 9 - 7;        
    int expr2 = 3 + (5 * 9) - 7;        
    int expr3 = 3 + 5 * (9 - 7);        
    int expr4 = (3 + 5) * 9 - 7;
    
    Which of the above variables will have the value 45?
    
    A. expr1
    B. expr2
    C. expr3
    D. expr4
    E. None of them.
    
   Their values are 41 41 13 and 65.
 You may find similar questions in the exam where you have to find the expression that returns the highest or lower value.
  In such cases, you will need to evaluate each expression.
    Correct(E)
    
 */
public class FindWhoPrint45 {
    public static void main(String...args){
        int expr1 = 3 + 5 * 9 - 7;        
        int expr2 = 3 + (5 * 9) - 7;        
        int expr3 = 3 + 5 * (9 - 7);        
        int expr4 = (3 + 5) * 9 - 7;   
    }
}