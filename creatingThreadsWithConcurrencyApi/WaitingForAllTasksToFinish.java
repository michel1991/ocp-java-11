package creatingThreadsWithConcurrencyApi;
import java.util.concurrent.*;

public class WaitingForAllTasksToFinish{
   public static void example() throws InterruptedException{
     ExecutorService service = null;
     try{
         service = Executors.newSingleThreadExecutor();
	 service.execute(() -> System.out.println(" Hello Fink "));
	 service.execute(() -> System.out.println(" Just keep calm Fink "));
	 service.submit(() -> {
               int sum = 0;
	       for(int i = 0; i < 10; i++){
		   sum+=i;
                  System.out.println(" index " + i + " sum is " + sum);
	       }
	       return sum;
	 });
         // Add tasks to the thread executor
      } finally{
        if(service != null){
             service.shutdown();
            System.out.println("Helllo executor call shutdown ");
         }
        
      }

      if(service !=null){
        service.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("Helllo executor call awaitTermination "); 
        // Check whether all tasks are finished
       if(service.isTerminated())
        System.out.println("Finish!");
       else
          System.out.println("At least one task is still running");

     }

   }

   public static void main(String[] args) throws InterruptedException  { 
      System.out.println("Main Thread start "); 
	   example();
       System.out.println("Main Thread end ");  

   }

}
