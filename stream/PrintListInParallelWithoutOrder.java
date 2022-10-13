package stream;
import java.util.stream.*;
import java.util.*;

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
