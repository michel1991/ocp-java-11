package stream.flatMap;
import java.util.stream.*;
import java.util.*;
import java.util.Map.*;
import java.util.function.*;


public class FlatMapOperations {

    /**
      What does the following output?
        A. [tire-][wheel-]
        B. tire-wheel-
        C. None of the above.
        D. The code does not compile

        The flatMap() method is used to turn a stream of collections
        into a one-dimensional stream.
        This means it gets rid of the empty list and flattens the other two.
        Option A is incorrect because this is the output you’d get using the regular map() method.
        Option B is correct because it flattens the elements.
        Notice how it doesn’t matter that all three elements are different types of Collection implementations.
     */
    public static void printireUnderscoreTWheelUnderscoreT(){
        Set<String> set = new HashSet<>();
        set.add("tire-");
        List<String> list = new LinkedList<>();
        Deque<String> queue = new ArrayDeque<>();
        queue.push("wheel-");
        Stream.of(set, list, queue)
           .flatMap(x -> x.stream())
           .forEach(System.out::print);

    }



}