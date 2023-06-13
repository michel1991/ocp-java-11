package concurrency.synchronizeds;
import java.util.concurrent.*;

/**
    What is the output of the following application?
    A. A deadlock is produced at runtime.
    B. A livelock is produced at runtime.
    C. 1000
    D. The code does not compile.
    E. The result is unknown until runtime because stroke is not written in a thread-safe manner and a write may be lost.
    F. None of the above.
    
    The application compiles, so option D is incorrect.
    The stroke variable is thread-safe in the sense that no write is lost,
    since all writes are wrapped in a synchronized method, making option E incorrect.
    The issue here is that the main() method reads the value of getStroke()
    while tasks may still be executing within the ExecutorService.
    The shutdown() method stops new tasks from being submitted
    but does not wait for previously submitted tasks to complete.
    Therefore, the result may output 0, 1000, or anything in between,
    making option F the correct answer.
    If the ExecutorService method awaitTermination() is called before the value of stroke
    is printed and enough time elapses, then the result would be 1000 every time.

 */
public class Athlete {
    int stroke = 0;
    public synchronized void swimming() {
        stroke++;
    }
    private int getStroke() {
        synchronized(this) { return stroke; }
    }
    public static void main(String... laps) {
        ExecutorService s = Executors.newFixedThreadPool(10);
        Athlete a = new Athlete();
        for(int i=0; i < 1000; i++) {
            s.execute(() -> a.swimming());
        }
        s.shutdown();
        System.out.print(a.getStroke());
    } }