package stream.sorted;
import java.util.stream.*;
import java.util.*;

/**
 * Given the following code fragment:
 
  What is the result?
  
    A. Compilation error at //1.
    B. Compilation error at //2.
    C. Compilation error at //3.
    D. USA, UK, Netherlands, India, France
    E. USA, Netherlands, UK, India, France
    F. France, India, Netherlands, UK, USA
    
    Correct(D)
    
   This is a straight forward question involving the usage of the Comparator interface and the Collectors.joining method.
    Comparator has a default method named reversed() that returns a new comparator composed on the existing one but with the reversed order.
    Basically, the new comparator just reverses the sign of the value returned by the original omparator.

    Collectors.joining returns a Collector that simply concatenates the elements of the input stream with the given parameter.


 */
public class PrintUsaUkNetherlandsEtc {
    public static void main(String... args){
        List<String> cities = List.of("USA", "Netherlands",
        "UK", "India", "France");
        Comparator<String> c = (a, b)->a.compareTo(b); //1
        Comparator<String> cr = c.reversed();//2
        String joined = cities.stream().sorted(cr)
        .collect(Collectors.joining(", "));//3
        System.out.println(joined);
    }
}