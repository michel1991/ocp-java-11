package concurrency.errors;
import java.util.concurrent.*;
import java.util.*;
import java.util.stream.*;


/**
 *  What is the most likely result of executing the following application?
    A. A deadlock is produced at runtime.
    B. A livelock is produced at runtime.
    C. The application completes successfully.
    D. The code does not compile.
    E. The code hangs indefinitely at runtime.
    F. The output cannot be determined ahead of time.
    
    The synchronized block used in the getQuestion() method requires an object to synchronize on.
    Without it, the code does not compile, and option D is the correct answer.
    What if the command was fixed to synchronize on the current object, such as using synchronized(this)?
    Each task would obtain a lock for its respective object and then wait
    a couple of seconds before requesting the lock for the other object.
    Since the locks are already held, both wait indefinitely, likely resulting in a deadlock.
    We say most likely because even with corrected code, a deadlock is not guaranteed.
    It is possible, albeit very unlikely, for the JVM to wait five seconds before starting the second task,
    allowing enough time for the first task to finish and avoiding the deadlock completely.

 */
class Riddle {
    public void sleep() {
        try { Thread.sleep(5000); } catch (Exception e) {}
    }
    public String getQuestion(Riddle r) {
        synchronized {
            sleep();
            if(r != null) r.getAnswer(null);
            return "How many programmers does it take "
                   + "to change a light bulb?";
        }
    }
    public synchronized String getAnswer(Riddle r) {
        sleep();
        if(r != null) r.getAnswer(null);
        return "None, that's a hardware problem";
    }

    public static void main(String... ununused) {
        var r1 = new Riddle();
        var r2 = new Riddle();
        var s = Executors.newFixedThreadPool(2);
        s.submit(() -> r1.getQuestion(r2));
        s.execute(() -> r2.getAnswer(r1));
        s.shutdown();
    }
}
public class RiddleSynchronizedBlocRequireObject {
  
}