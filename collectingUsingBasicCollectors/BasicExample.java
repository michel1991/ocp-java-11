package collectingUsingBasicCollectors;
import java.util.stream.*;

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
 
  public static void main(String[] args){
     joiningDataIntoStream();
     averageOfStringLength();
  }

}
