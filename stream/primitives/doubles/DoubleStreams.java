package stream.primitives.doubles;
import java.util.stream.*;

public class DoubleStreams {
    /**
       Which of the following correctly fill in the blank on line 6 so that the program can compile and run
       without throwing an exception? (Choose all that apply.)

       A. opt.orElse(0)
        B. opt.orElseGet(() -> 0)
        C. opt.orElseThrow()
        D. opt.get()
        E. opt.getAsDouble()
        F. Line 5 throws an exception at runtime.

        Option D is wrong because it doesn’t even compile. The opt variable is an OptionalDouble since
        it came from a primitive stream. An OptionalDouble doesn’t have a get() method.
        Option E is wrong because there is no value in the OptionalDouble to get.
        Option C throws an exception when there is no value. Options A and B provide a default return value to print.

     */
  static void withFindAny(){
      var ds = DoubleStream.empty(); //  4:
      var opt = ds.findAny(); //5:
      System.out.println(opt.orElseGet(() -> 0) ); //  6:  ______________________

  }
}