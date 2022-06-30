package genericReturnTypes;
import java.util.*;

public class Monkey extends Mammal{
   public ArrayList<CharSequence> play() {
      ArrayList<CharSequence>  list = new ArrayList<>();
      StringBuilder myBuilder = new StringBuilder();
      list.add(myBuilder);

      return list;
   }
}
