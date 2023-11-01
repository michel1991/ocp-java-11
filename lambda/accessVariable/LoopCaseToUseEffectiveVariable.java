package lambda.accessVariable;
import java.util.function.*;
public class LoopCaseToUseEffectiveVariable {

    /**
    * Which is true of the following code?
    *   A. The first compiler error is on line A.
        B. The first compiler error is on line B.
        C. The first compiler error is on line C.
        D. The first compiler error is on line D.
        E. The code compiles successfully.

       Lambdas are only allowed to reference effectively final variables.
       You can tell the variable j is effectively final because adding
       a final keyword before it wouldn’t introduce a compile error.
        Each time the else statement is executed, the variable is redeclared and goes out of scope.
        Therefore, it is not re-assigned. Similarly, length is effectively final.
        There are no compile errors, and option E is the correct.
     */
  static void loop(){
      int length = 3;

      for (int i = 0; i<3; i++) {
          if (i%2 == 0) {
              Supplier<Integer> supplier = () -> length; // A
              System.out.println(supplier.get());       // B
          } else {
              int j = i;
              Supplier<Integer> supplier = () -> j;        // C
              System.out.println(supplier.get());        // D
          }
      }
  }

    public static void main(String... args){
        loop();
   }
}