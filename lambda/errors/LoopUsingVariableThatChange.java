package lambda.errors;
import java.util.function.*;

public class LoopUsingVariableThatChange {
    /**
    * Which is true of the following code?
    *   A. The first compiler error is on line A.
        B. The first compiler error is on line B.
        C. The first compiler error is on line C.
        D. The first compiler error is on line D.
        E. The code compiles successfully.

      Lambdas are only allowed to reference effectively final variables.
      The loop variable i is not effectively final, making option C the answer.
     */
   static void usingSupply(){
       int length = 3;

       for (int i = 0; i<3; i++) {
           if (i%2 == 0) {
               Supplier<Integer> supplier = () -> length; // A
               System.out.println(supplier.get());        // B
           } else {
               Supplier<Integer> supplier = () -> i;      // C
               System.out.println(supplier.get());        // D
           }
       }
   }
}