package lambda.canBeInsert;
import java.util.*;

/**
 * What can be inserted in the following code so that it will print 12?
       public class TestClass{
        interface Doer{
            String doIt(int x, String y);
    }
    public static void main(String[] args) {
    
        INSERT CODE HERE

        System.out.println(d.doIt(2, "12345"));
     }
  }

  A. int a; String b;
    Doer d = (a,  b)->b.substring(0, a);
    
    This will not compile because a and b are already defined.
    Remember that the parameter specification of a lambda expression does not create a new scope.
    The parameter names in the lambda expression exist in the same scope as the method or the block in which the lambda expression is created.
  
  B. int a = 0; String b = "";
    Doer d = (a,  b)->b.substring(0, a);
    Same as above.
    
  C. Doer d = (a, b)->b.substring(0, a);
  
  D. Doer d = (int a, String b)->b.substring(0, a);
  
  E. Doer d = a, b->b.substring(0, a);
    You must enclose the parameters within parenthesis when the lambda expression has more than one parameter.
    
  Correct(C, D)
  
     Interface Doer has exactly one abstract method and therefore it is a valid functional interface.
     Both -  (a, b)->b.substring(0, a); and  (int a, String  b)->b.substring(0, a); are valid lambda expressions that capture this interface.
    
    Think of the expression as if you are writing a method for a class that implements this interface:
        class SomeDoer implements Doer{
        public  String doIt(int a, String b){
            return b.substring(0, a);
        }
    }

 */
 class TestClass{ // public
    interface Doer{
            String doIt(int x, String y);
    }
public static void main(String[] args) {

        // INSERT CODE HERE
       Doer d = (int a, String b)->b.substring(0, a);
       Doer dResponseC = (a, b)->b.substring(0, a);
        System.out.println(d.doIt(2, "12345"));
    }
}

class Print12 {
    public static void main(String[] args) {
        TestClass.main(args);
    }
}