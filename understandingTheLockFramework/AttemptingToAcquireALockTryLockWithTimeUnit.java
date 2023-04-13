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


     public static void main(String[] args) throws InterruptedException{
         System.out.println("Try using tryLock Main Thread");
         Lock lock = new ReentrantLock();
         new Thread( () -> {
            printMessage(lock);
            System.out.println("Thread get the lock and release");
         }).start();
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


}
