package creatingThreadsWithConcurrencyApi;
import java.util.concurrent.*;
import java.util.*;

public class SubmittingTaskCollectionsWithInvokeAll{
  static void example() throws InterruptedException, ExecutionException{
     ExecutorService service = null;
     System.out.println("begin");
     try{
	   service = Executors.newSingleThreadExecutor();    
          Callable<String> task = () ->{
            System.out.println("I am first task result ");
            return "result";
          };
          Callable<String> taskTwo = () -> {
            System.out.println("I am the second task");
            return "I am the second task";
          };
          Callable<String> taskThree = () -> {
            System.out.println("I am the Thirst task");
            return "I am the Thirst task";
          };
          List<Future<String>> list = service.invokeAll(
                  List.of(task, taskTwo, taskThree)
            );
          for(Future<String> future : list){
               System.out.println("result is in loop : " + future.get());
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
