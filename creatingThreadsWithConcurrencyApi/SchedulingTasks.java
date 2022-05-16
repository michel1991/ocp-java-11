package creatingThreadsWithConcurrencyApi;
import java.util.concurrent.*;

public class SchedulingTasks{
  static void basicSchedulingTask(){
     ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
     Runnable task1 = () -> System.out.println("Hello Zoo");
     Callable<String> task2 = () -> "Monkey";
     ScheduledFuture<?> r1 = service.schedule(task1, 10, TimeUnit.SECONDS );
    ScheduledFuture<?> r2 = service.schedule(task2, 8, TimeUnit.MINUTES );
   }
  
 static void repeatTaskWithScheduleAtFixedRate(){
   ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
   Runnable task1 = () -> System.out.println("Hello Zoo");
    service.scheduleAtFixedRate(task1, 5, 1, TimeUnit.MINUTES);
  }

}
