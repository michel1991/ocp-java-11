package usingCommonTerminalOperations;
import java.util.stream.*;
import java.util.function.*;

public class ReduceOperation{
   static void withLambda(){ 
    Stream<String> stream = Stream.of("w", "o", "l", "f");
    String word = stream.reduce("", (s,c) -> s + c );
    System.out.println("result reduce with lambda " + word);
  }

    static void withReferenceMethod(){
    Stream<String> stream = Stream.of("w", "o", "l", "f");
    String word = stream.reduce("", String::concat); 
    System.out.println("result reduce with reference method " + word);
  }

   static void multiply(){
     Stream<Integer> stream = Stream.of(3, 5, 6);
      int result =  stream.reduce(1, (a, b) -> a * b );
      System.out.println("multiply:  "+ result ); 
   }


   static void omitIdentity(){
     BinaryOperator<Integer> op = (a, b) -> a * b;
     Stream<Integer> empty = Stream.empty();
     Stream<Integer> oneElement = Stream.of(3);
     Stream<Integer> threeElements = Stream.of(3, 5, 6);

     empty.reduce(op).ifPresent(System.out::println); // no output
     oneElement.reduce(op).ifPresent(System.out::println); // 3
     threeElements.reduce(op).ifPresent(System.out::println); // 90
   }

  public static void main(String[] args){
        withLambda();
        withReferenceMethod();
        multiply();
        omitIdentity();
  }

}
