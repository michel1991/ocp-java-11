package creatingThreadsWithConcurrencyApi;
import java.util.concurrent.*;
import java.util.*;

public class SubmittingTaskCollectionsWithInvokeAny{
  static void example() throws InterruptedException, ExecutionException{
     ExecutorService service = null;
     System.out.println("begin");
     Callable<String> task = () -> "result";
     String data = service.invokeAny(
          List.of(task, task, task)
      );
      
      System.out.println(data);
  
      System.out.println("end");
  }

}
