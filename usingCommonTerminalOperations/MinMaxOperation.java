package usingCommonTerminalOperations;
import java.util.stream.*;
import java.util.*;

public class MinMaxOperation{
  public static void main(String[] args){
     Stream<String> s = Stream.of("monkey", "ape", "bonobo");
     Optional<String> min = s.min( (s1, s2) -> s1.length() - s2.length() );
     min.ifPresent(System.out::println);

     Optional<?> minEmpty = Stream.empty().min( (s1, s2) -> 0 );
     System.out.println("Min empty stream ");
     System.out.println(minEmpty.isPresent()); // false
  }
}
