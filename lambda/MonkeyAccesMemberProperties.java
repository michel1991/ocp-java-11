package lambda;
/**
*   Given the following methods, which lambda expressions can be used in the blank? (Choose all that apply.)
    public class Monkey {
        static int pages = 0;
        interface Type {
            Object type(int writer);
        }
            public static void main(String... bananas) {
                boolean done = false;
                for(var b : bananas) {
                Type myType = ________________;
                pages++;
            }
            done = true;
         }
      }

    A. t -> {int t = 2; return b+t;}
    B. b -> ""
    C. x -> done ? 1 : 2
    D. (var c) -> pages++
    E. u -> {return 6.2f}
    F. var -> var

   Option A is incorrect because t is declared twice, in the lambda parameter list and in the lambda body.
   Option B is correct because b is also declared twice, as a local variable in the method and in the lambda parameter list.
   Option C is incorrect because done is a local variable that is not final or effectively final.
   For this reason, it cannot be used in a lambda expression.
   Option D is correct as instance and static members are permitted in lambda expressions.
   Option E is incorrect because the lambda expression is missing a semicolon (;) at the end of the return statement.
   Finally, option F is a valid lambda expression, albeit hard to look at.
   Remember, var can be used as a valid identifier, just not a valid type like a class name. Please never write a lambda expression like this!


 */
public class MonkeyAccesMemberProperties {
    static int pages = 0;
    interface Type {
        Object type(int writer);
    }

    static void withFirstSolution(String... bananas){
        boolean done = false;
        for(var b : bananas) {
            Type myType = (var c) -> pages++; // ________________
            pages++;
        }
        done = true;
    }

    static void withSecondSolution(String... bananas){
        boolean done = false;
        for(var b : bananas) {
            Type myType =  var -> var; // ________________
            pages++;
        }
        done = true;
    }

    public static void main(String... bananas) {
        withFirstSolution();
        withSecondSolution("bananas");
    }
}