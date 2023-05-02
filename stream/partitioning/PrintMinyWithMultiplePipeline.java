package stream.partitioning;
import java.util.stream.*;
import java.util.*;
import static java.util.stream.Collectors.*;
import java.util.Map.*;
import java.util.function.*;

/**
 *  Which of the following produces different output than the others?
   C.
    Stream.of("eeny", "meeny", "miny", "moe")
       .collect(groupingBy(x -˃ x.charAt(0) == 'e'))
       .get(false)
       .stream()
       .collect(partitioningBy(String::length))
       .get(4)
       .forEach(System.out::println);

   Four of the five examples print miny. Option C does not compile.
   The difference is that partitioningBy() requires a Predicate that returns a boolean.
   When getting a question like this on the exam,
   focus on the differences between the provided options

 */
public class PrintMinyWithMultiplePipeline {
  
    static void answerA(){
        System.out.println("Beging Answer A");
        Stream.of("eeny", "meeny", "miny", "moe")
           .collect(partitioningBy(x -> x.charAt(0) == 'e'))
           .get(false)
           .stream()
           .collect(groupingBy(String::length))
           .get(4)
           .forEach(System.out::println);

        
        System.out.println("");
    }
    
    static void answerB(){
        System.out.println("Beging Answer B");
        Stream.of("eeny", "meeny", "miny", "moe")
               .filter(x -> x.charAt(0) != 'e')
               .collect(groupingBy(String::length))
               .get(4)
               .forEach(System.out::println);
        System.out.println("");
    }
    
    static void answerD(){
        System.out.println("Beging Answer D");
        Stream.of("eeny", "meeny", "miny", "moe")
               .collect(groupingBy(x -> x.charAt(0) == 'e'))
               .get(false)
               .stream()
               .collect(groupingBy(String::length))
               .get(4)
               .forEach(System.out::println);
        System.out.println("");
    }
    
    static void answerE(){
        System.out.println("Beging Answer E");
        Stream.of("eeny", "meeny", "miny", "moe")
               .collect(partitioningBy(x -> x.charAt(0) == 'e'))
               .get(false)
               .stream()
               .collect(partitioningBy(x -> x.length() == 4))
               .get(true)
               .forEach(System.out::println);
        
        System.out.println("");
    }
    
    public static void main(String... args){
        answerA();
        answerB();
        answerD();
        answerE();
    }
    
}