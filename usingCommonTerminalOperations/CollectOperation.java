package usingCommonTerminalOperations;
import java.util.stream.*;


public class CollectOperation{

  static void basicExample(){
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println("basic example " + word);
  }


  public static void main(String[] args){
         
     basicExample();

  }

}
