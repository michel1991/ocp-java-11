package usingCommonTerminalOperations;
import java.util.stream.*;


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

  public static void main(String[] args){
          withLambda();
         withReferenceMethod();
        multiply();
  }

}
