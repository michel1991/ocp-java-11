package stream.changeTomake;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

/**
  Given:
    ArrayList<Integer> source = new ArrayList<Integer>();
    source.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
    
    List<Integer> destination =
        Collections.synchronizedList(new ArrayList<Integer>());
    
    source
        .parallelStream()  //1
        .peek(item->{destination.add(item); }) //2
        .forEachOrdered(System.out::print);
    System.out.println("");
    destination
        .stream() //3
        .forEach(System.out::print); //4
    System.out.println("");
    
    What changes must be made to the above code so that it will consistently print
    123456
    123456
    ?
    
    A.
       Replace code at //1 with
        .stream()
       
    B. 
    Replace code at //2 with
    .map(item->{destination.add(item); return item; })
      ------
        This change is not required. peek will work as well as map in this case.

   C. 
     Replace code at //3 with
     .parallelStream()
    --------------------------
    If you change stream to parallelStream, forEach method will print the elements in any order.
    You will need to change forEach to forEachOrdered as well if you make this change.

   D.
     Replace code at //4 with
    .forEachOrdered(System.out::print);
    ----------------
    Since the stream is not parallel, changing forEach to forEachOrdered will not have any effect.
    Both will print the elements in the same order i.e. the order of the elements in the underlying List.

  ---------------------------------
   1. The forEachOrdered method processes the elements of the stream in the order they are present in the underlying source.
   In this case, the underlying source of the first stream is the "source" ArrayList.
   In this ArrayList, the elements are in the required order already and that is the order in which they will
   be printed even if the stream is a parallel stream because of forEachOrdered.

    2. Parallel streams allow operations such as peek and map to execute on the elements of the stream from multiple threads.
    This means they can be executed in any order.
    Therefore, in this case, the code that adds the elements to the destination (that is, the call to peek at //2)
    can add elements to destination list in any order.
    This means that, effectively, the order of elements in destination is unknown.
    This is the problem that really needs to be fixed here.
    Changing parallelStream to stream on the source will rectify this problem because
     then the elements will be added to destination in the same order.
    
    Observe that there is no benefit in using forEachOrdered on a parallel stream if that is all that you want to do with the stream.
    However, if you want to apply expensive intermediate operations such filter, peek, or map, and still process
    the elements in order at the end, using forEachOrdered might be useful because the intermediate operations can still be executed in parallel.
    
    You should go through this article from Oracle to understand this
    in detail: https://docs.oracle.com/javase/tutorial/collections/streams/parallelism.html
    Correct(A)
    
 */
public class ConsitentPrint12345 {
    public static void main(String... args){
        ArrayList<Integer> source = new ArrayList<Integer>();
        source.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        
        List<Integer> destination =
        Collections.synchronizedList(new ArrayList<Integer>());
        
        source
        .stream()  //1 (original: parallelStream() )
        .peek(item->{destination.add(item); }) //2
        .forEachOrdered(System.out::print);
        System.out.println("");
        destination
            .stream() //3
            .forEach(System.out::print); //4
        System.out.println("");
    }
}