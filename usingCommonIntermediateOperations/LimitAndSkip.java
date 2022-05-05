package usingCommonIntermediateOperations;
import java.util.stream.*;

class LimitAndSkip{
  
   static void basicExample(){
      Stream<Integer> s = Stream.iterate(1, n -> n + 1);
      s.skip(5)
            .limit(2)
            .forEach(System.out::print); // 67 
   }

  public static void main(String[] args){
      basicExample();
  }

}
