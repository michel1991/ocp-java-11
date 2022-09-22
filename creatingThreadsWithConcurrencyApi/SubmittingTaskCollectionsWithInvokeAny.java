package creatingThreadsWithConcurrencyApi;
import java.util.concurrent.*;
import java.util.*;

public class SubmittingTaskCollectionsWithInvokeAny{
  static void example() throws InterruptedException, ExecutionException{
     ExecutorService service = null;
     System.out.println("begin");
     try{
	   service = Executors.newSingleThreadExecutor();  
         Callable<String> task = () -> "result";
         String data = service.invokeAny(
              List.of(task, task, task)
          );
      
      System.out.println(data);
     }finally{
       if( service != null){
            service.shutdown();
       }
        System.out.println("end");
     }
  
  }

  public static void main(String... args) throws InterruptedException, ExecutionException {
      System.out.println("The main Thread start "); 
      example();
      System.out.println("The main Thread end ");
  }

}
