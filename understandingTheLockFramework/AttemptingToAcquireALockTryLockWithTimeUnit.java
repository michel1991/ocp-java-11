package understandingTheLockFramework;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class AttemptingToAcquireALockTryLockWithTimeUnit{
  public static void printMessage(Lock lock){
        try{
            lock.lock();
      }finally{
         lock.unlock();
      }

   }
  
  public void tryLockExample() throws InterruptedException{
     Lock lock = new ReentrantLock();
     new Thread( () -> printMessage(lock)).start();
     if(lock.tryLock(10, TimeUnit.SECONDS)){

         try{
              System.out.println("Lock obtained entering protected code");
          } finally{
            lock.unlock();
           }
          
        } else{
                System.out.println("Unable to acquire lock, doing something else");
             
          }
 
     }


     public static void main(String[] args) throws InterruptedException{
         var attenpting = new AttemptingToAcquireALockTryLockWithTimeUnit();
         System.out.println("Try using tryLock ");
         attenpting.tryLockExample();
      }


}
