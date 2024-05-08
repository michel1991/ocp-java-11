package stream.tricky;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class GroupWithCounting {
    /**
       What will the following code most likely print when compiled and run?
       
       A.
          [1, 1, 3]
        The code first groups the elements based on their length and then counts the number of elements in each group.
        Therefore, data map will actually contain: {2=1, 3=1, 4=3}
        Since we are printing only values, it will print [1, 1, 3].
       
       B. [1, 2, 3]
    
       C. [2, 3, 4]
    
       D. ["greg", "dave", "don", "ed", "fred"]
    
       E. The data variable should be declared of type Map<Integer, Integer> for the code to compile.
        Collectors.counting() returns Collector that returns the number of elements collected as a Long and not as an Integer.
        Therefore, the given declaration is correct.
        
       F. The data variable should be declared of type Map<Long, Long> for the code to compile.
            String::length returns the length of a String as an int. Therefore, the key of the map will be Integer and not Long.
        
       --------------
       Correct(A)
       public static <T> Collector<T,?,Long> counting()
        Returns a Collector accepting elements of type T that counts the number of input elements.
        If no elements are present, the result is 0.
       
     */
    public static void main(String... args){
        List<String> names = Arrays.asList("greg", "dave", "don", "ed", "fred" );
        Map<Integer, Long> data = names.stream().collect(Collectors.groupingBy(
        String::length,
        Collectors.counting()) );
        System.out.println(data.values());
    }
}