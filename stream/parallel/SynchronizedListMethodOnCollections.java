package stream.parallel;
import java.util.stream.*;
import java.util.*;



public class SynchronizedListMethodOnCollections {
    /**
     * Given the following code snippet, what statement about the values printed on lines p1 and p2 is correct?
        A. They are always the same.
        B. They are sometimes the same.
        C. They are never the same.
        D. The code does not compile.
        E. The code will produce a ConcurrentModificationException at runtime.
        F. None of the above.

        First, the class uses a synchronized list, which is thread-safe and allows modification
        from multiple threads, making option E incorrect.
        The process generates a stream of numbers from 1 to 5 and sends them into a parallel
        stream where the map() is applied, possibly out of order.
        This results in elements being written to db in a random order.
        The stream then applies the forEachOrdered() method to its elements,
        which will force the parallel stream into a single-threaded state.
        At runtime, line p1 will print the results in order every time as 12345.
        On the other hand, since the elements were added to db in a random order,
        the output of line p2 is random and cannot be predicted ahead of time.
        Since the results may sometimes be the same, option B is the correct answer.
         Part of the reason that the results are indeterminate
         is that the question uses a stateful lambda expression,
         which based on your studies, should be avoided!
     */
  static void bagAddInParallel(){
        var db = Collections.synchronizedList(new ArrayList<>());
        IntStream.range(1,6)
               .parallel()
               .map(i -> {db.add(i); return i;})
                    .forEachOrdered(System.out::print);  // p1
                    System.out.println();
                    db.forEach(System.out::print);          // p2
  }

    static void main(String... args){
        bagAddInParallel();
    }
}