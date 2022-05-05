package usingCommonTerminalOperations;
import java.util.stream.*;

public class CountOperation{
  public static void main(String[] args){
     Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
    System.out.println(s.count());
  }
}
