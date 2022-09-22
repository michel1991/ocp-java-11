package creatingThreadsWithConcurrencyApi;
import java.util.concurrent.*;
import java.util.*;

public class SubmittingTaskCollectionsWithInvokeAll{
  static void example() throws InterruptedException, ExecutionException{
     ExecutorService service = null;
     System.out.println("begin");
     try{
	   service = Executors.newSingleThreadExecutor();    
          Callable<String> task = () -> "result";
          List<Future<String>> list = service.invokeAll(
               List.of(task, task, task)
            );
          for(Future<String> future : list){
               System.out.println(future.get());
          }
     } finally{
	     if( service != null){
                service.shutdown();
	     }
      System.out.println("end");
     }
  }

  public static void main(String... args) throws InterruptedException, ExecutionException {
          System.out.println("main thread start ");
	  example() ;
	   System.out.println("main thread end ");
  }

}
