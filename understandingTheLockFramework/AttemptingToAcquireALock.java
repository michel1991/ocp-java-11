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
  
  public void tryLockExample(){
     Lock lock = new ReentrantLock();
     new Thread( () -> printMessage(lock)).start();
     if(lock.tryLock()){

         try{
              System.out.println("Lock obtained");
          } finally{
            lock.unlock();
           }
          
        } else{
                System.out.println("Unable to acquire lock, doing something else");
             
          }
 
     }


     public static void main(String[] args){
         var attenpting = new AttemptingToAcquireALock();
         System.out.println("Try using tryLock ");
         attenpting.tryLockExample();
      }


}
