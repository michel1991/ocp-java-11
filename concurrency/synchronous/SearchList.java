package concurrency.synchronous;
import java.util.*;

/**
 * What is the output of the following application?
    A. true
    B. false
    C. The code does not compile.
    D. The result is unknown until runtime.
    E. An exception is thrown.
    F. None of the above.
    
    The code attempts to search for a matching element in an array using multiple threads.
    While it does not contain any compilation problems,
    it does contain an error.
    Despite creating Thread instances, it is not a multithreaded program.
    Calling run() on a Thread runs the process as part of the current thread.
    To be a multithreaded execution, it would need to instead call the start() method.
    For this reason, the code completes synchronously,
    waiting for each method call to return before moving on to the next
    and printing true at the end of the execution, making option A the correct answer.
    On the other hand, if start() had been used,
    then the application would be multithreaded but not thread-safe.
    The calls to update foundMatch are not synchronized, and even if they were,
    the result might not be available by the time print() in the main() method was called.
    For this reason, the result would not be known until runtime.
 */
public class SearchList<T> {
    private List<T> data;
    private boolean foundMatch = false;
    public SearchList(List<T> list) {
        this.data = list;
    }
   public void exists(T v,int start, int end) {
        if(end-start==0) {}
      else if(end-start==1) {
          foundMatch = foundMatch || v.equals(data.get(start));
      } else {
          final int middle = start + (end-start)/2;
          new Thread(() -> exists(v,start,middle)).run();
          new Thread(() -> exists(v,middle,end)).run();
      }
    }
   public static void main(String[] a) throws Exception {
        List<Integer> data = List.of(1,2,3,4,5,6);
        SearchList<Integer> t = new SearchList<Integer>(data);
        t.exists(5, 0, data.size());
        System.out.print(t.foundMatch);
    } }
