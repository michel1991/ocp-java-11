package understandingTheLockFramework;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class AttemptingToAcquireALock{
  public static void printMessage(Lock lock){
        try{
            lock.lock();
      }finally{
         lock.unlock();
      }

   }

     public static void main(String[] args){
         var attenpting = new AttemptingToAcquireALock();
         System.out.println("Try using tryLock ");
         Lock lock = new ReentrantLock();
         new Thread( () ->{
            System.out.println("Thread get the lock ");
            printMessage(lock);
         }).start();

         if(lock.tryLock()){

            try{
               System.out.println("Lock obtained");
            } finally{
               lock.unlock();
            }

         } else{
            System.out.println("Unable to acquire lock, doing something else");

         }
        System.out.println("End Main thread ");
      }


}
