package creatingThreadsWithConcurrencyApi.waitingForResults;
import java.util.concurrent.*;

public class CheckResults{
  private static int counter = 0;
   
  public static void main(String[] args) throws Exception {
     ExecutorService service = null;
      try{
	        System.out.println("start"); 
             service = Executors.newSingleThreadExecutor();
             Future<?> result = service.submit(
                 () -> {
                     for (int i = 0; i < 500; i++ )
                       CheckResults.counter++;
                  }
             );

           service.submit( () -> {  
               System.out.println( " test order one" );
               return 1;
            });
            service.submit( () -> {
               System.out.println( " test order two" );
	       return 2;
	    });

	     service.execute( () -> {  
               System.out.println( " test order three callable" );
               return ;
            });

            result.get(10, TimeUnit.SECONDS);
            System.out.println("Reached!");
      }catch(TimeoutException e){
           System.out.println("Not reached in time");
      } finally{
             if(service != null){
              service.shutdown();
                System.out.println("call shutdown ");
	     }
     
       }
        System.out.println("end "); 
  }

}
