package creatingThreadsWithConcurrencyApi.introducingTheSingleThreadExecutor;
import java.util.concurrent.*;

/**
 * Order in the same thread is always follow.
 * In this example with have two threads (main thread, executors thread with threads task)
 */
class ZooInfo{
    public static void main(String[] args){
      ExecutorService  service = null;
      Runnable task1 = () -> System.out.println("Printing zoo inventory");
      Runnable task2 = () -> {
          for(int i = 0; i < 3; i++)
              System.out.println("Printing record:"+i);
      };

      try{
          service = Executors.newSingleThreadExecutor();
          System.out.println("begin");
          service.execute(task1);
          service.execute(task2);
          service.execute(task1);
          System.out.println("end");
      } finally{
          if(service != null){
              service.shutdown();
              System.out.println("call finally main thread ");
          }
      }
   }
 
}
