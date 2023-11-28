#### You have been given an instance of an Executor and you use that instance to execute tasks.
#### How many threads will be created for executing these tasks by the Executor?

* A. Exactly 1.
* B. One thread for each task that is submitted to the Executor.
* C. As many as there are cores in the CPU.
* D. Number of threads created by the Executor depends on how the Executor instance was created.
* E. Number of threads is automatically determined based on the load on the Executor instance.

java.util.concurrent.Executor is an interface that has only one method: void execute(Runnable command)
Java concurrent library has several implementations for this interface such as ForkJoinPool, ScheduledThreadPoolExecutor,
and ThreadPoolExecutor.
As instance of an Executor is created using various static factory methods of java.util.concurrent.Executors
such as newFixedThreadPool, newSingleThreadExecutor, and newScheduledThreadPool.

Thus, the number of threads used by an Executor instance depends on the class
of that instance and how that instance was created. For example, if an instance
was created using Executors.newSingleThreadExecutor(), only one thread will be created,
but if it was created using Executors.newFixedThreadPool(5), five threads will be created.
Note: Most of the concrete classes that implement Executor, actually implement java.util.concurrent.ExecutorService interface.
ExecutorService extends Executor.
(correct D)
