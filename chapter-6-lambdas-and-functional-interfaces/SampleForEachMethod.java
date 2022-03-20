import java.util.*;
import java.util.function.*;

public class SampleForEachMethod{
  public static void main(String[] args){
   List<String> bunnies = new ArrayList<>();
    bunnies.add("long ear");
    bunnies.add("floppy");
    bunnies.add("hoppy");
    System.out.println(bunnies);
    bunnies.forEach((b) -> System.out.println(b));
   System.out.println(bunnies);
  }
}
