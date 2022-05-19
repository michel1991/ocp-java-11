package  usingConcurrentCollections.understandingMemoryConsistencyErrors;
import java.util.concurrent.*;

public class  FixConcurrentModificationException{
  public static void main(String[] args){
      var foodData = new ConcurrentHashMap<String, Integer>();
      foodData.put("penguin", 1);
      foodData.put("flamingo", 2);
       for (String key: foodData.keySet())
            foodData.remove(key);
  }

}
