package concurrency.deadblock;
/**
 * Consider the program shown in exhibit and select the right option(s).
    A. It will print XX followed by YY
    B. It will print YY followed by XX
    C. It will print XY followed by YX
    D. The above code may result in a deadlock and so nothing can be said for sure about the output.
    
    Correct(D)
    
    This is a complex question. Consider the following situation :
    First thread acquires the lock of sb1. It appends X to sb1. Just after that, the OS stops this thread and starts the second thread.
    (Note that first thread still has the lock of sb1). Second thread acquires the lock of sb2 and appends Y to sb2.
    Now it tries to acquire the lock for sb1. But sb1's lock is already acquired by the first thread so the second thread has to wait.
    Now, the OS starts the first thread. It tries to acquire the lock of sb2 but cannot get it as the lock is already acquired by the second thread.
    Here, you can see that both the threads are waiting for each other to release the lock.
    So in effect both are stuck! This is a classic case of a deadlock.
    So the output cannot be determined.

 */
public class TestClass
    {
        static StringBuffer sb1 = new StringBuffer();
        static StringBuffer sb2 = new StringBuffer();
        public static void main(String[] args)
        {
            new Thread
      (
              new Runnable()
             {
                 public void run()
                 {
                     synchronized(sb1)
                {
                    sb1.append("X");
                    synchronized(sb2)
                    {
                        sb2.append("Y");
                    }
                }
                     System.out.println(sb1);
                 }
             }
      ).start();
            new Thread
      (
              new Runnable()
             {
                 public void run()
                 {
                     synchronized(sb2)
                {
                    sb2.append("Y");
                    synchronized(sb1)
                    {
                        sb1.append("X");
                    }
                }
                     System.out.println(sb2);
                 }
             }
      ).start();
        }
    }