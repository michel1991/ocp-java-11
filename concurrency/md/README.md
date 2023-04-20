#### Which of the following static methods does not exist in the Executors class? (Choose two.)
* A. newFixedScheduledThreadPool()
* B. newThreadPool()
* C. newFixedThreadPool(int)
* D. newSingleThreadExecutor()
* E. newScheduledThreadPool(int)
* F. newSingleThreadScheduledExecutor()

Options C, D, E, and F are all proper ways to obtain instances of ExecutorService.
Remember that newSingleThreadExecutor() is equivalent to calling newFixedThreadPool(int)
with a value of 1. The correct answers are options A and B, as neither of these methods exist.

#### Which ScheduledExecutorService method
#### can result in the same action being executed
#### by two threads at the same time?
* A. scheduleAtFixedDelay()
* B. scheduleAtFixedRate()
* C. scheduleWithFixedDelay()
* D. scheduleAtSameRate()
* E. scheduleWithRate()
* F. None of the above

Options A, D, and E include method names that do not exist in ScheduledExecutorService.
The scheduleAtFixedRate() method creates a new task for the associated action
at a set time interval, even if previous tasks for the same action are still active.
In this manner, it is possible multiple threads working
on the same action could be executing at the same time,
making option B the correct answer. On the other hand,
scheduleWithFixedDelay() waits until each task is completed before scheduling the next task,
guaranteeing at most one thread working on the action is active in the thread pool.

#### Fill in the blanks: ______________ is a special case of ______________,
#### in which two or more active threads try
#### to acquire the same set of locks and are repeatedly unsuccessful.
* A. Deadlock, livelock
* B. Deadlock, resource starvation
* C. Livelock, resource starvation
* D. Resource starvation, race conditions
* E. Resource starvation, livelock
* F. None of the above

Resource starvation is when a single active thread is perpetually unable
to gain access to a shared resource. Livelock is a special
case of resource starvation, in which two or more active
threads are unable to gain access to shared resources,
repeating the process over and over again.
For these reasons, option C is the correct answer.
Deadlock and livelock are similar,
although in a deadlock situation the threads are stuck waiting,
rather than being active or performing any work.
Finally, a race condition is an undesirable
result when two tasks that should be completed sequentially are completed at the same time.

