package collectingUsingBasicCollectors;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

class BasicExample{
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


  static void basicCollectingIntoMap(){
    var ohMy = Stream.of("lions", "tiggers", "bears");
     Map<String,  Integer> map = ohMy.collect( Collectors.toMap(s-> s, String::length) );
    System.out.println("basic example collecting into map " + map);

  }

  static void basicCollectingIntoMapWithIdentity(){
    var ohMy = Stream.of("lions", "tiggers", "bears");
     Map<String,  Integer> map = ohMy.collect( Collectors.toMap(Function.identity(), String::length) );
    System.out.println("basic example collecting into map using function identity " + map);

  }  
 
  public static void main(String[] args){
     joiningDataIntoStream();
     System.out.println();
     averageOfStringLength();
      System.out.println();
     fromStreamToCollectionFilterAllStringStartsByT();
      System.out.println();
     basicCollectingIntoMap();
    
     System.out.println(); 
     basicCollectingIntoMapWithIdentity();
  }

}
