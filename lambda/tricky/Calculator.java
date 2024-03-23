package lambda.tricky;
import java.util.function.*;

/**
   Given:

    //assume appropriate imports
    public class Calculator{
        public static void main(String[] args) {
            double principle = 100;
            int interestrate = 5;
            double amount = compute(principle, x->x*interestrate);
        }
    
        INSERT CODE HERE
    }
    
   Which of the following methods can be inserted in the above code so that it will compile and run without any error/exception?
   
   A.
       public static double compute(double base, Function<Integer, Integer > func){
        return func.apply((int)base);
        
   B.
      public static double compute(double base, Function<Integer, Double> func){
         return func.apply((int)base);
     }
      The method definition is fine. But the usage of this method i.e. compute(principle, x->x*interestrate); will not compile because
     the type of the expression that makes up the body of the function i.e. x*interestrate is int, while the expected return type of the Function is Double.
      int cannot be boxed to a Double.
     You could do this though: double amount = compute(principle, x->new Double(x*interestrate));
     
   C.
     public static double compute(double base, Function<Double, Integer> func){
        return func.apply(base);
    }
      Function<Double, Integer> implies that your argument type is Double and return type is Integer.
      However, the return type of the lambda expression x->x*interestrate is Double because you are passing base, which is a double,
      as the argument to this function..
      
   D. public static double compute(double base, Function<Double, Double> func){
        return func.apply(base);
    }
    
   E.
     public static double compute(double base, Function<Integer, Double> func){
        return func.apply(base);
    }
   Function<Integer, Double> implies that your argument type is Integer and return type is Double.
   However, you are passing base, which is double, to this function.
   You cannot pass a double where an int or Integer is required without explicit cast due to potential loss of precision.
   
  The lambda expression x->x*interestrate basically takes an input value, modifies it, and return the new value.
  It is, therefore, acting as a Function.
   Therefore, you need a method named compute that takes two arguments - an double value and a Function instance.
   Option 1 and 4 provide just such a method.
   
   Correct(A, D)
     
}


 */
public class Calculator{
    public static void main(String[] args) {
        double principle = 100;
        int interestrate = 5;
        double amount = compute(principle, x->x*interestrate);
    }

    //INSERT CODE HERE
    public static double compute(double base, Function<Double, Double> func){
        return func.apply(base);
    }
}
