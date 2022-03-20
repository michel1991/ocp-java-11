import java.util.*;
import java.util.function.*;

public class SampleRemoveIfMethod{
  public static void main(String[] args){
   List<String> bunnies = new ArrayList<>();
    bunnies.add("long ear");
    bunnies.add("floppy");
    bunnies.add("hoppy");
    System.out.println(bunnies);
    bunnies.removeIf(s -> s.charAt(0) != 'h');
   System.out.println(bunnies);
  }
}
