package concurrency;
import java.util.concurrent.*;

class CyclicBarrierSample{
  
    static void printSaladBarEmpty(){
       var cb = new CyclicBarrier(4,  () -> System.out.println("Salad bar empty")); // r1
       ExecutorService s = null;
      try {
          s = Executors.newFixedThreadPool(4);
          for (int i = 0; i < 12; i++) {
              s.submit(() -> cb.await()); // r2
           }
      } finally {
              if (s != null) s.shutdown();
          }
    }


    public static void main(String... args){
       printSaladBarEmpty();
    }
  
}
