package stream.runtime;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class SortedListPreviousStreamClosed {
    /***
     *  What is true of the following code?
        A. Both streams are guaranteed to print the single character a.
        B. Both streams will print a single character of a, b, or c.
        C. Only one stream is guaranteed to print the single character a.
        D. Only one stream will print a single character of a, b, or c.
        E. The code does not compile.

         All of the code compiles. The first stream source has three elements.
         The intermediate operations both sort the elements of this stream
         and then we request one from findAny().
         The findAny() method is not guaranteed to return a specific element.
         Since we are not using parallelization, it is highly likely that the code will print a.
         However, you need to know this is not guaranteed.
         Additionally, the stream on line 28 prints Optional[a], Optional[b], or Optional[c].
        Since only lines 23–26 print a single character, option D is the answer.
     */
   static void sorted(){
       var list = List.of('c', 'b', 'a'); //  21:
       //22:
       list.stream() // 23:
         .sorted() //  24:
          .findAny() //  25:
          .ifPresent(System.out::println); // 26:
       //27:
       System.out.println(list.stream().sorted().findFirst()); // 28:
   }

    public static void main(String... args){

    }
}