package collectingUsingBasicCollectors;
import java.util.stream.*;
import java.util.*;

class BasicExample{
   static void joiningDataIntoStream(){
     var ohMy = Stream.of("lions", "tiggers", "bears");

     String result = ohMy.collect(Collectors.joining(", "));
    System.out.println( "joining string: " + result); // lions tiggers, beears

  }

   static void averageOfStringLength(){ 
     var ohMy = Stream.of("lions", "tiggers", "bears");
 
     Double result = ohMy.collect(Collectors.averagingInt(String::length));
    System.out.println("average of string length " + result);
   
  }

  static void fromStreamToCollectionFilterAllStringStartsByT() {
    var ohMy = Stream.of("lions", "tiggers", "bears");
    TreeSet<String> result = ohMy.filter( s -> s.startsWith("t") )
                                 .collect(Collectors.toCollection(TreeSet::new))
     ;
    System.out.println("from stream to Collection filter all string start by t " + result);
  }  
 
  public static void main(String[] args){
     joiningDataIntoStream();
     averageOfStringLength();
     fromStreamToCollectionFilterAllStringStartsByT();
  }

}
