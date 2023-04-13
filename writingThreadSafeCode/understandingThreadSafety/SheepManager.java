package writingThreadSafeCode.understandingThreadSafety;
import java.util.concurrent.*;

public class SheepManager{
  private int sheepCount = 0;

  private void incrementAndReport(){
     System.out.print( (++sheepCount) + " ");
  } 

   public static void main(String[] args){
       ExecutorService service = null;
       try{
           service = Executors.newFixedThreadPool(20);
          SheepManager manager = new SheepManager();
          for(int i = 0; i < 10; i++){
               System.out.println("counter main Thread "+ i);
               service.submit( () -> manager.incrementAndReport() );
  	     }

       } finally{
           if(service != null)
            service.shutdown();
        }


   }

}
