package stream;
import java.util.stream.*;
import java.util.*;

public class MaxNumber{
 private static void magic(Stream<Integer> s) {
    Optional o = s
      .filter(x -> x < 5)
      .limit(3)
      .max((x, y) -> x-y);
     System.out.println(o.get());
  }

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

