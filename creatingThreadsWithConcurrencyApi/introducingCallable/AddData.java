package creatingThreadsWithConcurrencyApi.introducingCallable;
import java.util.concurrent.*;

public class AddData{
  public static void main(String[] args) throws Exception {
     ExecutorService service = null;
      try{
             service = Executors.newSingleThreadExecutor();
             Future<Integer> result = service.submit(
                 () -> 30 + 11
             );
           System.out.println(result.get()); // 41
          System.out.println("call before get result");
      }finally{
             if(service != null){
              service.shutdown();
	      System.out.println("call shutdown");
	     }
       }
  }

}
