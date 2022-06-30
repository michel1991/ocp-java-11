package genericReturnTypes;
import java.util.*;

public class Goat extends Mammal{
  public List<String> play(){
     return new ArrayList<String>();
  }

  public String sleep(){
      return "Goat Sleep";
  }

}
