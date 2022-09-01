package workingWithGenerics.boundingGenericTypes.upperBoundedWildcards;
import java.util.*;

public class ImmutableListUpperBoundedWildcards{
  
  static class Sparrow extends Bird{}
  static class Bird{}

  public static void main(String[] args){
     List<? extends Bird> birds = new ArrayList<Bird>();
      birds.add (new Sparrow());  // does not compile
      birds.add (new Bird());  // does not compile

   }
}
