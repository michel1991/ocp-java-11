package usingCommonTerminalOperations;
import java.util.stream.*;
import java.util.*;

public class FindAnyAnFindFirst{
    static void findAnyInfiniteStreamNumber(){
        System.out.println("Beging findAnyInfiniteStreamNumber");
        Stream
              .iterate(1.0, (previousValue) -> previousValue + .5)
              .findAny()
              .ifPresent(System.out::println)
        ;
        System.out.println("end findAnyInfiniteStreamNumber");
    }

    static void findFirstInfiniteStreamNumber(){
        System.out.println("Beging findFirstInfiniteStreamNumber");
        Stream
        .iterate(1.0, (previousValue) -> previousValue + .5)
        .findFirst()
        .ifPresent(System.out::println)
        ;
        System.out.println("end findFirstInfiniteStreamNumber");
    }

  public static void main(String[] args){
     Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
     Stream<String> infinite = Stream.generate( () -> "chimp" );

      s.findAny().ifPresent(System.out::println); // monkey (usually)
      System.out.println();
      infinite.findAny().ifPresent(System.out::println); // chimp
      System.out.println();
      findAnyInfiniteStreamNumber();
      System.out.println();
      findFirstInfiniteStreamNumber();
  }
}
