package stream;
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

    public static void main(String... args){

   }
}