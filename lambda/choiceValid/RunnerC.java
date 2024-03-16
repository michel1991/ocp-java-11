package lambda.choiceValid;
/**
 * Given:
 *
 * Which of the following is/are valid lambda expression(s) that capture(s) the above interface?
 */
interface Runner {
    public void run();
}

class RunnerC{
    public static void main(String... args){
        /**
           A.
              -> System.out.println("running...");
          B.
             void -> System.out.println("running...")

         */
        
        /**
          C.
            () -> System.out.println("running...")
            A lambda body must be either a single expression or a block.
            System.out.println("running...") is not an expression because it doesn't return anything.
            So, it doesn't really satisfy the above requirement. However, it is an exception to the rule.
            A semicolon is not required when you use a method call returning
            void as the body of the lamda expression even though the method call is not an expression.
         */
        Runner r1 = () -> System.out.println("running...");
        
        /**
          D. 
           () -> { System.out.println("running..."); return; }

         */
        Runner r2 = () -> { System.out.println("running..."); return; };
        
        /**
           E.
             (void) -> System.out.println("running...")
           F.
             -> System.out.println("running...")
             

         */
        
        /**
         Runner is a valid functional interface because it has exactly one abstract method.
            Since this method does not take any parameter, the parameter list part of the lambda expression must be ().
            Further, since it does not return anything, the body part should ideally
            be such that it does not return anything either.
            Thus, you can either use a method call that returns void or some code enclosed within { and }
            that does not return anything. In this case, however, since there is only one interface with one method,
            it is ok even if the body of the lambda expression returns a value as illustrated by the following code:
            
            
            interface Runner {
              public void run();
            }
            public class TestClass {
            
               public static void main(String[] args) {
                    run( () -> voidMethod() ); //will invoke run(Runner ) method.
                    run( () -> intMethod() );//will also invoke run(Runner ) method.
                }
            
                public static void run(Runner x) {
                    x.run();
                }
            
                public static void voidMethod() {
                    System.out.println("voidMethod");
                }
                public static int intMethod() {
                    System.out.println("intMethod");
                    return 0;
                }
            }
            
            
            The return type of the lambda expression's body becomes important in the following code though:
            
            interface Runner {
              public void run();
            }
            interface Runner2 {
              public int run();
            }
            
            public class TestClass {
            
               public static void main(String[] args) {
                    run(() -> voidMethod()); //will invoke run(Runner ) method.
                    run(() -> intMethod());  //will not invoke run(Runner ) method.
                }
            
                public static void run(Runner x) {
                   System.out.println("In runner");
                    x.run();
                }
                public static void run(Runner2 x) {
                    System.out.println("In runner2");
                    x.run();
                }
            
                public static void voidMethod() {
                    System.out.println("voidMethod");
                }
                public static int intMethod() {
                    System.out.println("intMethod");
                    return 0;
                }
            }
         */
        
        
        
        
        
    }
}
