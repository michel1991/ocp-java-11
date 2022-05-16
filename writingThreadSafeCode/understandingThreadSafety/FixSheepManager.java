package writingThreadSafeCode.understandingThreadSafety;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class FixSheepManager{
  private AtomicInteger sheepCount = new AtomicInteger(0);

  private void incrementAndReport(){
     System.out.print( sheepCount.incrementAndGet() + " ");
  } 

   public static void main(String[] args){
     ExecutorService service = null;
     try{
         service = Executors.newFixedThreadPool(20);
        FixSheepManager manager = new FixSheepManager();
        for(int i = 0; i < 10; i++)
          service.submit( () -> manager.incrementAndReport() );

     } finally{
         if(service != null)
          service.shutdown();
      }         


   }

}
