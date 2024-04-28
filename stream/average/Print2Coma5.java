package stream.average;
import java.util.*;
import java.util.stream.*;
/**
 * Given:
    var nums = List.of(1, 2, 3, 4).stream();
    Which of the following options will compute the average of the numbers in the nums stream?
    
    A. double average = nums.collect(Collectors.averagingInt(i->i));
    nums is of type Stream<Integer> and Stream does have a collect method that takes a Collector.
    
    B. double average = nums.mapToObj(i->i).collect(Collectors.averagingInt(i->i));
    Stream does not have mapToObj method.
    
    C. double average = nums.average().getAsDouble();
    Stream does not have average() method.
    
    D. double average = nums.parallel().mapToInt(i->i).average();
    This is almost valid but IntStream's average() returns OptionalDouble.
    So, you need to invoke getAsDouble() on it if you want to assign the result to double.
    
    E. double average = nums.parallel().mapToDouble(i->i).average().getAsDouble();
    
    Correct(A, E)
    
 */
public class Print2Coma5 {
    static double reponseA(){
        var nums = List.of(1, 2, 3, 4).stream();
        double average = nums.collect(Collectors.averagingInt(i->i));
        return average;
    }
    
    static double reponseE(){
        var nums = List.of(1, 2, 3, 4).stream();
        double average = nums.parallel().mapToDouble(i->i).average().getAsDouble();
        
        return average;
    }
    
    public static void main(String... args){
        var nums = List.of(1, 2, 3, 4).stream();
       var responseA =  reponseA();
       var responseE =  reponseE();
       System.out.println("response a = " + responseA + " response E= " + responseE);
       
    }
}