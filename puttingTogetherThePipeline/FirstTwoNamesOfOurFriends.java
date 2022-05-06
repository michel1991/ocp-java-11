package puttingTogetherThePipeline;
import java.util.*;
import java.util.stream.*;

class FirstTwoNamesOfOurFriends{
  public static void main(String[] args){
     var list = List.of("Toby", "Anna", "Leroy", "Alex");
     list.stream()
         .filter( n -> n.length() == 4)
         .sorted()
         .limit(2)
         .forEach(System.out::println)
    ;
  }
}
