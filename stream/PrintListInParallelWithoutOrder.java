package stream;
import java.util.stream.*;
import java.util.*;

/**
   Given a List<Integer> of values, m, and the following getLunch() method that takes a lot of time to complete,
   which stream operation concurrently processes the data,
   while printing the results in the order they are stored in the original List? (Choose all that apply.)

    A.
        m.parallelStream()
           .forEachOrdered(s ->
              System.out.print(
                 getLunch(s)));

    B.
        System.out.println(m
           .stream().parallel()
           .map(x -> getLunch(x))
           .collect(Collectors.toList()));

    C.
        m.parallelStream()
           .map(x -> getLunch(x))
           .forEach(System.out::print);

  D.
    m.parallelStream()
       .map(x -> getLunch(x))
       .forEachOrdered(
          System.out::print);

  E.
    m.parallel()
       .forEach(s ->
          System.out.print(
             getLunch(s)));

    F. None of the above

    To be efficient, the stream operation should perform getLunch() in a concurrent manner, while still outputting the results in the order they appear in the stream.
    Options B and D accomplish this, one relying on a Collector, while the other using forEachOrdered().
    Option A is incorrect, because each call to getLunch() is executed serially instead of concurrently.
    Option C is also incorrect.
    While the call to getLunch() is processed in parallel, the output is random.
    Finally, option E does not compile, as there is no method parallel() defined on a List.
 */
class PrintListInParallelWithoutOrder{
     public static int getLunch(int recipe){
       // IMPLEMENTATION OMITTED
       //
        return recipe;
     }
     

     public static void answerOne(List<Integer> m){
        System.out.println(
                m.stream()
	             .parallel()
		         .map( x -> getLunch(x) )
		         .collect(Collectors.toList() )
	         );
     }


      public static void answerTwo(List<Integer> m){
             m.parallelStream()
             .map( x -> getLunch (x))
	         .forEachOrdered(System.out::print)
	       ;
      }


     public static void feedAnimals(List<Integer> m){
          // INSERT CODE HERE
     }

     public static void main(String... args){
        /* 
	  Given a List<Integer> of values, m, and the following getLunch() method that takes a lot of time to complete, 
	  which stream operation concurrently processes the data, 
	  while printing the results in the order they are stored in the original List? (Choose all that apply.)
       */
       List list = List.of(1, 3, 6, 8);	     
     }

     
}
