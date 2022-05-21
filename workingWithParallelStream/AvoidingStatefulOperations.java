package workingWithParallelStream;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;

public class AvoidingStatefulOperations{
  public List<Integer> addValues(IntStream source){
      var data = Collections.synchronizedList(new ArrayList<Integer>());
        source.filter( s -> s % 2 == 0)
              .forEach(i -> { data.add(i);  }); // stateful: don't do this

        return data;
   }

   static void executeWithSerialStream(){
      var sample = new AvoidingStatefulOperations();
      var list  = sample.addValues(IntStream.range(1, 11));
      System.out.println(list);
   }

  public static void main(String[] args){
     System.out.println("execute with serial stream");
     executeWithSerialStream();
     System.out.println();
   }

}
