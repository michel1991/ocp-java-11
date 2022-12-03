package collectingUsingBasicCollectors;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

class BasicExample{
   

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
     basicCollectingIntoMap();
    
     System.out.println(); 
     basicCollectingIntoMapWithIdentity();
  }

}
