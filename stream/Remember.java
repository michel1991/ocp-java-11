package stream;
import java.util.stream.*;

public class Remember {
    /**
    * Which are true statements? (Choose all that apply.)
    *  R: findAny() and findFirst() are guaranteed to return the same result if the stream is empty
    *  R: findAny() and findFirst() are guaranteed to return the same result if the stream has exactly one element.
    *
    * When the stream is empty, both methods return an empty Optional.
    * When the stream has one element, both methods return an Optional containing that element.
    * When there are multiple elements, findAny() makes no guarantees about which element is returned.
     */
    public static void findAnyAndFirst(Stream<?> streamFindAny, Stream<?> streamFindFirst){
       var resultEmptyStreamFindAny = streamFindAny.findAny();
       var resultEmptyStreamFindFirst = streamFindFirst.findFirst();
       System.out.println(resultEmptyStreamFindAny);
       System.out.println(resultEmptyStreamFindFirst);
   }



    public static void main(String... args){
        findAnyAndFirst(Stream.empty(), Stream.empty());
        findAnyAndFirst(Stream.of(1), Stream.of(1));
   }
}