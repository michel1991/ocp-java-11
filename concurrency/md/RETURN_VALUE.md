### You want to execute a task that returns a result without blocking.
### Which of the following types from java.util.concurrent package will be required to achieve this?

* A. Executor
    Executor interface executes a Runnable. But the return type of Runnable's run() is void, so, it cannot return anything.

* B. ExecutorService

``` txt
  ExecutorService extends Executor and provides a submit(Callable ) method:
    <T> Future<T>  submit(Callable<T> task)
    Submits a value-returning task for execution and returns a Future representing the pending results of the task.
``` 
* C. Executors
    java.util.concurrent.Executors is a utility class that contains factory methods to create various kinds of ExecutorService implementations.

* D. Runnable

* E. Callable
    The difference between Callable and Runnable is that Callable's call() returns a value.
   It may also throw an Exception while Runnable's run() cannot return any value and cannot throw any Exception.

* F. Future
    When you submit a task (i.e. a Callable) to an ExecutorService using ExecutorService's submit(Callable ) method,
    it returns a Future object immediately without blocking.
    You can check the status of the Future object later to get the actual result once it is done.

``` txt
 The following is a sample code that can be used to create and execute a task that returns the result without blocking.
    import java.util.concurrent.Callable;
    import java.util.concurrent.ExecutorService;
    import java.util.concurrent.Executors;
    import java.util.concurrent.Future;
    
    public class ResultWithoutBlockingExample {
    
        public static void main(String[] args) throws Exception {
            //create a thread pool of two threads
            ExecutorService es = Executors.newFixedThreadPool(2);
            
            MyTask task1 = new MyTask();
            Future<String> result = es.submit(task1);
            System.out.println("Proceeding without blocking... ");
            while(!result.isDone()){
                try {
                    //check later
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            System.out.println("Result is "+result.get());
            es.shutdown();
        }
        
        public static class MyTask implements Callable<String>{
            public String call(){
                try {
                    //simulate a long running task;
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                return "Data from "+Thread.currentThread().getName();
            }
        }
    }
``` 
Correct(B, C, E, F)
