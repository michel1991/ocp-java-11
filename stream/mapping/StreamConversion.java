package stream.mapping;
import java.util.stream.*;

public class StreamConversion {
   /**
   * Which of following is the best way to convert a stream of String objects to a stream of int primitives?
   *   A. IntStream is = stream.map(Integer::parseInt);
       B. IntStream is = stream.mapToInt(Integer::parseInt);
       C. IntStream is = stream.boxed();
       D. Stream<Integer> is = stream.map(Integer::parseInt);
       E. Stream<Integer> is = stream.mapToInt(Integer::parseInt);
       F. None of the above. Primitives cannot be used in any type of stream.

     Options D and E are incorrect because the reference type is a Stream of wrapper objects rather than primitives.
     Option A does not compile because map() returns a Stream rather than an IntStream.
     Option C does not compile because we start with a Stream<String> instead of a Stream<Integer>.
     Option B is correct because it does return the primitive stream type of IntStream.
    */
  static void convertToInt(){
       Stream<String> stream = Stream.of("gorilla");
       IntStream is = stream.mapToInt(Integer::parseInt);
  }

   static void mapAndMapToInt(){

   }

   /**
    * Which of the following can fill in the blank to have the code print 44?
         A. Only map
         B. Only mapToInt
         C. Only mapToObject
         D. Both map and mapToInt
         E. Both map and mapToObject
         F. map, mapToInt, and mapToObject

         The map() method can fill in the blank.
         The lambda converts a String to an int, and Java uses autoboxing to turn that into an Integer.
         The mapToInt() method can also fill in the blank, and Java doesn’t even need to autobox.
         There isn’t a mapToObject() in the stream API. Note there is a similarly named mapToObj() method on IntStream.
         Since both map() and mapToInt() work here, option D is correct.

    */
    public static void main(String... args){
      var stream = Stream.of("base", "ball");
      stream.mapToInt(s -> s.length()).forEach(System.out::print);
   }
}