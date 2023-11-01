package interfaces.function.primitives;
import java.util.function.*;
public class PrimitiveFI {
    /**
    * Lines 6 and 7 both call the method applyAsDouble() rather than apply().
    * This tells us that the answer is a primitive functional interface, ruling out options C and D.
    * The primitive versions are correct with options E and F.
    * Line 8 calls accept(), making it a consumer. Option A is the remaining correct answer.
     */
    public static void doubles(ToDoubleFunction<String> x, LongToDoubleFunction y, Consumer<Double> z) {
         double d1 = x.applyAsDouble("");
         System.out.println("ToDoubleFunction  value " + d1);
         double d2 = y.applyAsDouble(1L);
         System.out.println("LongToDoubleFunction  value " + d2);
         z.accept(1.0);
    }

   public static void main(String... args){
        doubles(x -> Double.parseDouble(x), x -> x, System.out::println);
   }
}