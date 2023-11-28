package operations;

/**
  Which of the following statements are true?

   A. The condition expression in an if statement can be a method call.
    Yes, as long as the method returns a boolean value.
    
   B.  If a and b are of type boolean, the expression (a = b) can be used as the condition expression of an if statement.
   
   C. An if statement can have either an 'if' clause or an 'else' clause.
    An if-statement must always have an 'if' clause. 'else' is optional.
    
   D. The statement : if (false) ; else ; is illegal.
    if-clause and the else-clause can have empty statements. Empty statement ( i.e. just  a semi-colon ) is a valid statement.
    
   E. Only expressions which evaluate to a boolean value can be used as the condition in an if statement.
    Unlike C/C++ where you can use integers as conditions, in java, only booleans are allowed.
    
    (correct A, B, E)
 */
public class EmptyIf {
    public static void main(String... args){
        /**
            The expression (a = b) does not compare the variables a and b,
            but rather assigns the value of b to the variable a. The result of the expression
            is the value being assigned. Since a and b are boolean variables, the value returned by the expression
            is also boolean. This allows the expressions to be used as the condition for an if-statement.
            
            if-clause and the else-clause can have empty statements. Empty statement ( i.e. just ; )
            is a valid statement. However, the following is illegal:
            
            if (true) else; because the if part doesn't contain any valid statement.
            (A statement cannot start with an else!) But the following is valid:
             if(true) if(false); because if(false); is a valid statement.
         */
        
        if(true) if(false);
    }
}