package usingCommonTerminalOperations;
import java.util.stream.*;
import java.util.*;

public class MinMaxOperation{
    static void minWithCustomComparator(){
        System.out.println("begin min with custom comparator ");
        Stream<String> s = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s.min( (s1, s2) -> s1.length() - s2.length() );
        min.ifPresent(System.out::println);
        System.out.println("end min with custom comparator ");
    }

    static void minWithComparator(){
        System.out.println("begin min with comparator ");
        Stream<Integer> s = Stream.of(1, 3, 7, 0, -1);
        Comparator<Integer> compMin = Integer::compare;
        Optional<Integer> min = s.min(compMin);
        min.ifPresent(System.out::println);
        System.out.println("end min with comparator  ");
    }

    static void maxWithComparator(){
        System.out.println("begin max with comparator ");
        Stream<Integer> s = Stream.of(1, 3, 7, 0, -1);
        Comparator<Integer> comparison = Integer::compare;
        Optional<Integer> max = s.max(comparison);
        max.ifPresent(System.out::println);
        System.out.println("end max with comparator  ");
    }

    static void minWithEmpty(){
        Optional<?> minEmpty = Stream.empty().min( (s1, s2) -> 0 );
        System.out.println("Min empty stream ");
        System.out.println(minEmpty.isPresent()); // false
        System.out.println("End Min empty stream ");
    }
  public static void main(String[] args){
        minWithCustomComparator();
        System.out.println();
        minWithComparator();
        System.out.println();
        maxWithComparator();
        System.out.println();
        minWithEmpty();
  }
}
