package stream;
import java.util.stream.*;
import java.util.*;

public class MaxNumber{
    /**
    *  Which of the following are true? (Choose all that apply.)
    *   A. magic(Stream.empty()); runs infinitely.
        B. magic(Stream.empty()); throws an exception.
        C. magic(Stream.iterate(1, x -> x++)); runs infinitely.
        D. magic(Stream.iterate(1, x -> x++)); throws an exception.
        E. magic(Stream.of(5, 10)); runs infinitely.
        F. magic(Stream.of(5, 10)); throws an exception.
        G. The method does not compile.

      Calling get() on an empty Optional causes an exception to be thrown, making option B correct.
      Option F is also correct because filter() makes the Optional empty before it calls get().
      Option C is incorrect because the infinite stream is made finite by the intermediate limit() operation.
      Options A and E are incorrect because the source streams are not infinite.
      Therefore, the call to max() sees only three elements and terminates. For more information, see Chapter 4.
     */
 private static void magic(Stream<Integer> s) {
    Optional o = s
      .filter(x -> x < 5)
      .limit(3)
      .max((x, y) -> x-y);
     System.out.println(o.get());
  }

 /**
     Which of the following are true? (Choose all that apply.)
        A. magic(Stream.empty()); runs infinitely.
        B. magic(Stream.empty()); throws an exception.
        C. magic(Stream.iterate(1, x -> x++)); runs infinitely.
        D. magic(Stream.iterate(1, x -> x++)); throws an exception.
        E. magic(Stream.of(5, 10)); runs infinitely.
        F. magic(Stream.of(5, 10)); throws an exception.
        G. The method does not compile.

     Calling get() on an empty Optional causes an exception to be thrown, making options B and F correct.
     Option C is correct because the infinite stream is not made finite by the intermediate filter() operation.
     Therefore, the call to max() never terminates.
  */
 static void maxWithOnlyFilter( Stream<Integer> s ){
     // B. magic(Stream.empty()); throws an exception.
     // C. magic(Stream.iterate(1, x -> x++)); runs infinitely.
     // F. magic(Stream.of(5, 10)); throws an exception.
     Optional o = s.filter(x -> x < 5).max((x, y) -> x - y);
     System.out.println(o.get());
 }

   public static void main(String... args){
       // magic(Stream.empty());
       var result = Stream.empty();
       System.out.println(result);
       Stream<Object> emptyObjet = Stream.empty();
       // magic(Stream.iterate(1, x -> x++)); throws an exception
       Stream<Integer> stream = Stream.empty();
       magic(Stream.empty());

       System.out.println();
       System.out.println( " max with only filter ");

   }
}

