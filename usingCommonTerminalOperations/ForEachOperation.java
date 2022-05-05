package usingCommonTerminalOperations;
import java.util.stream.*;


public class ForEachOperation{
  public static void main(String[] args){
         
     Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
     s.forEach(System.out::print);
       

  }

}
