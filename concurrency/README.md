### Which of the following properties of concurrency are true? (Choose all that apply.)
* A. By itself, concurrency does not guarantee which task will be completed first.
* B. Concurrency always improves the performance of an application.
* C. A computer with a single-processor CPU does not benefit from concurrency.
* D. Applications with many resource-heavy tasks tend to benefit more from concurrency than ones with CPU-intensive tasks.
* E. Concurrent tasks do not share the same memory.

By itself, concurrency does not guarantee which task will be completed first, so option A is correct.
Furthermore, applications with numerous resource requests will often be stuck waiting for a resource, which allows other tasks to run.
Therefore, they tend to benefit more from concurrency than CPU-intensive tasks, so option D is also correct.
Option B is incorrect because concurrency may in fact make an application slower if it is truly single-threaded in nature.
Keep in mind that there is a cost associated with allocating additional memory and CPU time to manage the concurrent process.
Option C is incorrect because single-processor CPUs have been benefiting from concurrency for decades.
Finally, option E is incorrect; there are numerous examples in this chapter of concurrent tasks sharing memory.

### Fill in the blanks: ____________ occur(s) when two or more threads are frozen and blocked forever. ____________ occur(s) when one or more threads are perpetually denied access to a resource.
* A. Race conditions, Livelock
* B. Deadlock, Starvation
* C. Starvation, Deadlock
* D. Livelock, Starvation
* E. Starvation, Race conditions
* F. Deadlock, Livelock

Deadlock occurs when two or more threads are frozen and not making any progress, while starvation occurs when one or more threads is perpetually denied access to a resource.
For these reasons, option B is correct.

### Which statements about methods in ReentrantLock are correct? (Choose all that apply.)
* A. The lock() method will attempt to acquire a lock without waiting indefinitely for it.
* B. The testLock() method will attempt to acquire a lock without waiting indefinitely for it.
* C. The attemptLock() method will attempt to acquire a lock without waiting indefinitely for it.
* D. By default, a ReentrantLock fairly releases to each thread, in the order that it was requested.
* E. Calling the unlock() method once will release a resource so that other threads can obtain the lock.
* F. None of the above

The lock() method will wait indefinitely for a lock, so option A is incorrect.
Options B and C are also incorrect, as the correct method name to attempt to acquire a lock is tryLock().
Option D is incorrect, as fairness is set to false by default and must be enabled by using an overloaded constructor.
Finally, option E is incorrect because a thread that holds the lock may have called lock() or tryLock() multiple times.
A thread needs to call unlock() once for each call to lock() and tryLock().

### Fill in the blanks: ____________ occur(s) when two or more threads are blocked forever but both appear active. ____________ occur(s) when two or more threads try to complete a related task at the same time, resulting in invalid or unexpected data.
* A. Livelock, Deadlock
* B. Deadlock, Starvation
* C. Race conditions, Deadlock
* D. Livelock, Race conditions
* E. Starvation, Race conditions
* F. Deadlock, Livelock

Livelock occurs when two or more threads are conceptually blocked forever, although they are each still active and trying to complete their task.
A race condition is an undesirable result that occurs when two tasks are completed at the same time, which should have been completed sequentially.

### Which happens when a new task is submitted to an ExecutorService, in which there are no threads available?
* A. The executor throws an exception when the task is submitted.
* B. The executor discards the task without completing it.
* C. The executor adds the task to an internal queue and completes when there is an available thread.
* D. The thread submitting the task waits on the submit call until a thread is available before continuing.
* E. The executor creates a new temporary thread to complete the task.

If a task is submitted to a thread executor, and the thread executor does not have any available threads,
the call to the task will return immediately with the task being queued internally by the thread executor.
For this reason, option C is the correct answer.

### Which of the following methods is not available on an ExecutorService instance? (Choose two.)
* A. execute(Callable)
* B. shutdownNow()
* C. submit(Runnable)
* D. exit()
* E. submit(Callable)
* F. execute(Runnable)

Option A is correct, as ExecutorService does not define nor inherit an overloaded method execute() that takes a Callable parameter.
ExecutorService defines two shutdown methods, shutdown() and shutdownNow(), one of which is shown in option B.
Option D is correct, as exit() does not exist and is not one of shutdown methods.
The ExecutorService interface defines the two submit() methods shown in options C and E.
Because ExecutorService extends Executor, it also inherits the execute(Runnable) method presented in option F.