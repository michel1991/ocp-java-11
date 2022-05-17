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

}
