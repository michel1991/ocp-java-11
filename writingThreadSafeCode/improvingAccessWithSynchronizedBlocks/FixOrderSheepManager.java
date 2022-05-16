package writingThreadSafeCode.improvingAccessWithSynchronizedBlocks;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class FixOrderSheepManager{
  private int sheepCount = 0;

  private void incrementAndReport(){
      synchronized(this){
        System.out.print( (++sheepCount) + " ");
     }
     
  } 

   public static void main(String[] args){
     ExecutorService service = null;
     try{
         service = Executors.newFixedThreadPool(20);
        var manager = new FixOrderSheepManager();
        for(int i = 0; i < 10; i++)
          service.submit( () -> manager.incrementAndReport() );

     } finally{
         if(service != null)
          service.shutdown();
      }         


   }

}
