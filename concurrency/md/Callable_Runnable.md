### Using a Callable would be more appropriate than using a Runnable in which of the following situations?

* A.  When you want to execute a task directly in a separate thread.
    A Callable cannot be passed to Thread for Thread creation but a Runnable can be. i.e.
    new Thread( aRunnable ); is valid. But new Thread( aCallable ); is not.
    Therefore, if you want to execute a task directly in a Thread,
    a Callable is not suitable. You will need to use a Runnable.
    You can achieve the same by using an ExecutorService.submit( aCallable ),
    but in this case, you are not controlling the Thread directly.
    
* B. When your task might throw a checked exception and you want to execute it in a separate Thread.
    Callable.call() allows you to declare checked exceptions while Runnable.run() does not.
    So if your task throws a checked exception, it would be more appropriate to use a Callable.

* C. When your task does not return any result but you want to execute the task asynchronously.
    Both Callable and Runnable can be used to execute a task asynchronously.
    If the task does not return any result, neither is more appropriate than the other.
    However, if the task returns a result, which you want to collect asynchronously later,
    Callable is more appropriate.
    
* D. When you want to use ExecutorService to submit multiple instances of a task.
    Both can be used with an ExecutorService because ExecutorService has overloaded submit methods:
    <T> Future<T> submit(Callable<T> task)
        and
        Future<?> submit(Runnable task) Observe that even though a Runnable's run()
        method cannot return a value, the ExecutorService.submit(Runnable) returns a Future.
        The Future's get method will return null upon successful completion.


public interface Callable<V>
    A task that returns a result and may throw an exception. Implementers define a single method with no arguments called call -
    V call() throws Exception
    The Callable interface is similar to Runnable, in that both are designed
    for classes whose instances are potentially executed by another thread.
    A Runnable, however, does not return a result and cannot throw a checked exception
(correct is B)





