package list.maps;
import java.util.*;

public class MapOperations {
    /**
    * What is the result of the following?
    *   A. {}
        B. {2=20}
        C. {2=20, 3=null}
        D. {2=20, 3=3}
        E. The code does not compile.
        F. An exception is thrown.

      The first call to merge() removes the first key because the mapping function returns null.
      The second call to merge() does not call the mapping function since the existing map value is null—it simply returns the value specified in the parameter.
      Key 2 is never touched. Therefore, the answer is option D.
     */
  static void makeMerge(){
      var map = new HashMap<Integer, Integer>();
      map.put(1, 10);
      map.put(2, 20);
      map.put(3, null);

      map.merge(1, 3, (a,b) -> null);
      map.merge(3, 3, (a,b) -> null);

      System.out.println(map);

  }
}