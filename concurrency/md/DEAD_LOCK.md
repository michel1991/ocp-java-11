### Which of the following statements about deadlock is correct?

* A. A deadlock occurs when threads become so busy in responding to each other that they are unable to perform any real work.
    This is called a live lock.

* B. Deadlock occurs when a thread is frequently unable to get access to a resource because the resource is hogged by other threads most of the time.
    This is called Starvation. For example, multiple threads need access to a File.
    Now, one thread acquires the lock for the file and doesn't release is for a long time. It then releases the lock for a brief moment and reacquires the lock. While another thread is kept waiting for the lock for a very long time. In some cases, it is possible that another thread may never get a chance to acquire the lock for the same file due to bad scheduling in the OS. Thus, the thread that is frequently not able to get the lock is starved.

* C. Thread 1 and 2 are said to be deadlocked when Thread 1 is blocked waiting for Thread 2 to release a resource, while Thread 2 is blocked waiting for Thread 1 to release another resource.
    This is a standard deadlock scenario.
   How to avoid deadlock is a common question in the interviews.
   One approach is so make sure that the resources are acquired in the same order by each thread.
   For example, if two threads need a File and a Printer, both should try to acquire a File lock first and if successful, then acquire the Printer lock.
  Thus, they will never get into a situation where File lock is acquired by one thread and Printer lock is acquired by another.

  How to identify where the deadlock is in the system is another question that is frequently asked in the interviews.
  This is a complicated topic to discuss here but basically, one can get a thread dump (by sending kill -3 or Control+Break to the java process) and in that log, one can see which thread holds which locks.
  The log also highlights the deadlocks.

* D. A deadlock is caused by starvation, which in turn is caused by a live lock.
 This makes no sense.

* F. A deadlock is caused when, in a multi core CPU system, one of the cores get offline or corrupt.

```
    The exam needs you to understand and differentiate among Deadlock, Starvation, and Livelock. The following are brief descriptions taken from Oracle Java Tutorial, which is sufficient for the exam:
    
    1. Deadlock describes a situation where two or more threads are blocked forever, waiting for each other.
For example, two threads T1 and T2 need a File and a Printer.
T1 acquires the lock for the file and is about to acquire the lock for the Printer but before it could acquire the lock,
T2 acquires the lock for the Printer and tries to acquire the lock for the file (which is already held by T1).
So now, both the threads keep waiting for ever for each other to release their locks and neither will be able to proceed.
    
    2. Starvation describes a situation where a thread is unable to gain regular access to shared resources and is unable to make progress.
This happens when shared resources are made unavailable for long periods by "greedy" threads.
For example, suppose an object provides a synchronized method that often takes a long time to return.
If one thread invokes this method frequently, other threads that also need frequent synchronized access to the same object will often be blocked.
    
    3. Livelock: A thread often acts in response to the action of another thread.
If the other thread's action is also a response to the action of another thread, then livelock may result.
As with deadlock, livelocked threads are unable to make further progress.
However, the threads are not blocked — they are simply too busy responding to each other to resume work.
For example, after acquiring the File lock, T1 tries to acquire the Printer lock.
Finding the Printer lock to be already taken, it releases the lock for the File and notifies T2.
At the same time, T2 tries to acquire the File lock and seeing that it is already taken it releases Printer lock and notifies T1.
This process can go on and on, both the threads releasing and acquiring the locks in tandem but none of them getting both the locks at the same time. So neither of the threads is blocked but neither of the threads is able to do any real work. All they are doing is notifying each other.
```

Correct(C)
