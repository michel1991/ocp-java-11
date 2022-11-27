package operations.errors;
import java.util.*;
public class RememberMathMethodReturnType {
    /**
    * Remember to watch return types on math operations. One of the tricks is option B on line 24.
    * The round() method returns an int when called with a float. However, we are calling it with a double so it returns a long.
    * The other trick is option C on line 25. The random() method returns a double. Converting from an array to an ArrayList uses Arrays.asList(names).
    * There is no asList() method on an array instance, and option E is correct.
     */
    public static void firstCase(){
      double one = Math.pow(1, 2);
      int two = Math.round(1.0);
      float three = Math.random();
      var doubles = new double[] { one, two, three};
      String [] names = {"Tom", "Dick", "Harry"};
      List<String> list = names.asList();
      var other = Arrays.asList(names);
      other.set(0, "Sue");
  }

    public static void main(String... args){
        System.out.println("");
    }
}