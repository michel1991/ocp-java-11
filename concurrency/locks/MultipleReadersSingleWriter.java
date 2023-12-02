package concurrency.locks;
import java.util.concurrent.locks.*;
import java.util.*;

/**
   You have a collection (say, an ArrayList) which is read by multiple reader
   threads and which is modified by a single writer thread. 
   The collection allows multiple concurrent reads but does not tolerate concurrent read and write.
   Which of the following strategies will you use to obtain best performance?
 
    A. Synchronize all access to the collection.
        While this is a valid approach, if you do this then even the reader threads will not be able to read concurrently. This will drastically reduce performance.
    B. Make the collection variable final.
    C. Make the collection variable final and volatile.
        Making it final and volatile will only ensure that
        all threads access the same collection object
        but it will not prevent simultaneous access by reader and writer threads.
    D. Wrap the collection into its synchronized version using Collections.synchronizedCollection().
    E. This is same as option 1 and has the same issue.
    F Encapsulate the collection into another class and use ReadWriteLock to manage read and write access.
    (Correct E)
    // You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/dkIsjHuhbvI
 */
public class MultipleReadersSingleWriter {
    private final ArrayList<String> theList = new ArrayList<>();
    //Note that ReadWriteLock is an interface.
    private final ReadWriteLock rwl = new ReentrantReadWriteLock();
    private final Lock r = rwl.readLock();
    private final Lock w = rwl.writeLock();    

    public String read(){
        r.lock();
        try{
            System.out.println("reading");
            if(theList.isEmpty()) return null;
            else return theList.get(0);
        }finally{
            r.unlock();
        }
    }

    public void write(String data){
        w.lock();
        try{
            System.out.println("Written "+data);
            theList.add(data);
        }finally{
            w.unlock();
        }
    }
}
