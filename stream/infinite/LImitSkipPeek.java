package stream.infinite;
import java.util.stream.*;

public class LImitSkipPeek {
    /**
     * What is the expected output of the following code snippet?
        A. It does not compile.
        B. It throws an exception at runtime.
        C. It does not print any output at runtime.
        D. 345345
        E. 334455
        F. The behavior of the code snippet cannot be determined until runtime.

        The code compiles and does not throw any exception at runtime,
        so options A and B are incorrect. The code snippet is serial, by default,
        so the order is predictable, making option F incorrect.
        The peek() method executes on each member of the pipeline,
        printing five numbers as the elements are then collected into a List, which gives us 345.
        They are then printed again, making the final output 345345 and option D correct.

     */
  static void display(){
      Stream.iterate(1, x -> x + 1)
       .limit(5)
       .skip(2)
       .peek(System.out::print)
       .collect(Collectors.toList())
       .forEach(System.out::print);
  }

    public static void main(String... args){
        display();
    }

}