package stream.groups;
import java.util.*;
import java.util.stream.*;

/**
 *  Which is a possible output of the following code snippet?
 
    A. {false=[Stonehenge, Statue of Liberty], true=[Eiffel Tower, Mount Fuji]}
    B. {false=[Stonehenge], true=[Mount Fuji, Eiffel Tower, Statue of Liberty]}
    C. {false=[Mount Fuji, Stonehenge], true=[Eiffel Tower, Statue of Liberty]}
    D. Exactly one line contains a compiler error.
    E. More than one line contains a compiler error.
    F. None of the above.
    
    The code compiles, so options D and E are incorrect.
    The code first splits the stream into a Map<Boolean, List<String>
    based on whether the landmark contains a space.
    Using the flatMap() method, it then takes the List<String>
    values of the Map and reforms them as a Stream<String>.
    This new stream is similar to the original stream,
    although with elements in a possibly different order.
     Finally, the groupingBy() collector splits the stream based
     on whether it does not start with an "S".
     Since Set and Map were used,
     the order may vary, but option A is one possible output.
 */
public class LandMarksGroupByBooleanAsKey {
    public static void main(String... args){
        var landmarks = Set.of("Eiffel Tower", "Statue of Liberty",
                               "Stonehenge", "Mount Fuji");
        var result = landmarks
               .stream()
               .collect(Collectors.partitioningBy(b -> b.contains(" ")))
               .entrySet()
               .stream()
               .flatMap(t -> t.getValue().stream())
               .collect(Collectors.groupingBy(s -> !s.startsWith("S")));
                    System.out.println(result);
    }
}