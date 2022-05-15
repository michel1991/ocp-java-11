package creatingThreadsWithConcurrencyApi;
import java.util.concurrent.*;

public class WaitingForAllTasksToFinish{
   public static void example() throws InterruptedException{
     ExecutorService service = null;
     try{
         service = Executors.newSingleThreadExecutor();
         // Add tasks to the thread executor
      } finally{
        if(service != null)
          service.shutdown();
      }

      if(service !=null){
        service.awaitTermination(1, TimeUnit.MINUTES);
       
        // Check whether all tasks are finished
       if(service.isTerminated())
        System.out.println("Finish!");
       else
          System.out.println("At least one task is still running");

     }

   }

   public static void main(String[] args){

   }

}
