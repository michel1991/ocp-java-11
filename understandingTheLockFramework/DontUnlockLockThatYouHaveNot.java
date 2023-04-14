package understandingTheLockFramework;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class DontUnlockLockThatYouHaveNot {
  public static void main(String... args){
      Lock lock = new ReentrantLock();
      lock.unlock();
  }
}