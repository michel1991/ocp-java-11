#### Which method must be implemented by a class implementing the Callable interface?
* A. run()
* B. execute()
* C. call()
```java
    public interface Callable<V>{
        V call() throws Exception;
    }
/*A task that returns a result and may throw an exception.
    Implementers define a single method with no arguments called call.  
    The Callable interface is similar to Runnable, in that both are designed
    for classes whose instances are potentially executed by another thread.
    A Runnable, however, does not return a result and cannot throw a checked exception.
*/
``` 
* D. do()


A java.util.concurrent.Callable is used when you expect your threads to return a computed result.
You can submit instances of a Callable to an ExecutorService:
```txt
    Future<Long> result  = null;
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Callable<Long> worker = new MyCallable();
            //This call returns immediately.   
            result = executor.submit(worker);
    
            The result of the Callable's call() method can be retrieved from the Future object.
    
            //Call to Future.get() blocks until the result is available.
            //so don't call the following statement here.
            //System.out.println("Result is " + result.get());
            while(!result.isDone()){
                try {
                    //Do something else and check later
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
    //Since result.isDone() is true, the result is available now
    System.out.println("Result is "+result.get());
```



You may want to check out the free video by
Dr. Sean Kennedy explaining this question: https://youtu.be/bhUXRYOaRSk
Correct (C)