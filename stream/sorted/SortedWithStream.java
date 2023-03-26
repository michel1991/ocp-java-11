package stream.sorted;
import java.util.stream.*;
import java.util.*;
public class SortedWithStream {
    /**
    * There is no Stream<T> method called compare() or compareTo(), so options A through D can be eliminated.
    * The sorted() method is correct to use in a stream pipeline to return a sorted Stream.
    * The collect() method can be used to turn the stream into a List.
    * The collect() method requires a collector be selected, making option E incorrect and option F correct.
     */
   public static List<String> sortByDesc(List<String> list){
       return list.stream()
       .sorted((a, b) -> b.compareTo(a))
       .collect(Collectors.toList());
   }


    /**
       What is the output of this code?

        A. bloat
        B. BLOAT
        C. one
        D. ONE
        E. The code does not compile due to line x.
        F. None of the above.

        This is a correct stream pipeline.
        The source creates a stream of three elements.
        The first operation makes a stream of one element, one.
        Then that single element is made uppercase and sorted to complete the intermediate operations.
        Finally, the terminal operation prints ONE, which corresponds to option D.
     */
    static void sortedByNaturalOrder(){
        Stream.of("one", "two", "bloat")
               .limit(1)
               .map(String::toUpperCase)       // line x
               .sorted()
               .forEach(System.out::println);
    }

    /**
      Which of the following can fill in the blank to have the code print out *?

        A. (s,t) -˃ s.length() - t.length()
        B. String::isEmpty
        C. Both of these will produce the desired output.
        D. Neither of these will allow the code to compile.
        E. The code does not complete regardless of what goes in the blank.

        The sorted() method takes an optional Comparator as the parameter,
        which takes two String parameters and returns an int.
        Option A is correct because the lambda implements this interface.
        Option B is incorrect because the method reference doesn’t take any parameters,
        nor does it return an int. While generate() starts with an infinite stream,
        the limit() intermediate operation immediately makes it finite.
        Finally, the distinct() intermediate operation gives us one star instead of three.

     *
     */
    public static void printOneStairs(){
        Stream.generate(() -> "*")
           .limit(3)
           .sorted( (s,t) -> s.length() - t.length() ) // .sorted(_________________)
           .distinct()
           .forEach(System.out::println);

    }

    /**
     *  What is the expected output of the following code snippet?

        A. It does not compile.
        B. It throws an exception at runtime.
        C. It does not print any output at runtime.
        D. It prints four numbers twice each.
        E. It can print up to eight distinct numbers.
        F. The behavior of the code snippet cannot be determined until runtime.

        The code compiles and does not throw any exception at runtime,
        so options A and B are incorrect.
        As an element goes through the pipeline, it is printed once by the peek() method,
        then once by the forEach() method. For example, 0.1 0.1 0.54 0.54 0.6 0.6 0.3 0.3 is a
        possible output from this code. For this reason, option D is correct.

     */
    public static void randomDouble(){
        Random r = new Random();
        Stream.generate(r::nextDouble)
               .skip(2)
               .limit(4)
               .sorted()
               .peek(System.out::println)
               .forEach(System.out::println);

    }

    public static void main(String... args){
      var surnames = List.of("pierre", "hawking", "michel", "jobs", "yava");
      System.out.println(sortByDesc(surnames));
    }




}