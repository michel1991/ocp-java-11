package concurrency.synchronizeds;
import  java.util.concurrent.*;

/**
   Consider the following code:
   
   Which of the following statements are correct?
   A. It may result in a deadlock and the program may get stuck.
   B.  There is no potential for deadlock in the code.
   
   C.   Deadlock may occur but the program will not get stuck as the JVM will resolve the deadlock.
        ---
         Java does not provide any mechanism to detect, prevent or resolve a deadlock.
         
   D. The program will always print: 1 2, 2 1, 1 2 and 2 1.
        ---
         It may be printed only if deadlock does not happen.
         
   E. Nothing can be said for sure.
      ----
         It may run well or it may end up in a deadlock.

   -----
     Consider this situation:
    thread 1 enters run(), it gets the lock for obj1 and before it could get the lock for obj2, thread 2 runs.
    Thread 2 gets the lock for obj2 and tries to get the lock for obj1.
     Now both the threads are waiting for locks acquired by each other.
     So nobody can run. So the program gets stuck.
     Note that the threads are not dead. They just keep waiting. So the program never ends in such a case.
     
    Correct(A, E)
 */
public class Test extends Thread
{
    boolean flag = false;
    public Test(boolean f) { flag = f; }
    static Object obj1 = new Object();
    static Object obj2 = new Object();
    public void m1()
    {
        synchronized(obj1)
        {
            System.out.print("1 ");
            synchronized(obj2)
            {
                System.out.println("2");
            }
        }
    }
    public void m2()
    {
        synchronized(obj2)
        {
            System.out.print("2 ");
            synchronized(obj1)
            {
                System.out.println("1");
            }
        }
    }
    public void run()
    {
        if(flag){ m1();  m2(); }
        else { m2();  m1(); }
    }
    public static void main(String[] args)
    {
        new Test(true).start();
        new Test(false).start();
    }
}