package understandingTheLockFramework;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class DuplicateLock {
    /**
     * Has a counter that count the number of time lock()/unlock() are call
     */
  public static void main(String... args){
      Lock lock = new ReentrantLock();
      
      if(lock.tryLock()){

          try{
              lock.lock();
              System.out.println("Lock obtained");
          } finally{
              lock.unlock(); 
          }

      }
      new Thread( () ->{
          System.out.println("Thread get the lock " + lock.tryLock()); // always return false
      }).start();
      
      System.out.println("End Main thread ");
  }
}