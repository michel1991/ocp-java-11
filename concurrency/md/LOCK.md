#### Which of the following statements are correct regarding synchronization and locks?

* A. A thread exclusively owns the intrinsic lock between the time it has acquired the lock and released the lock.


* B.  A thread can acquire a lock on the class.

``` txt
This is what happens when a static synchronized method is invoked, since a static method is associated with a class, not an object. In this case, the thread acquires the intrinsic lock for the Class object associated with the class. Thus access to class's static fields is controlled by a lock that's distinct from the lock for any instance of the class.
```

* C. A thread will release the intrinsic lock if the synchronized method calls a non-synchronized method and then reacquire the lock upon returning from that method.

The intrinsic lock remains acquired throughout the duration of the synchronized method.

* D. Java allows a thread to acquire the intrinsic lock of only one object at a time to prevent deadlocks.

``` txt
A thread can obtain locks of multiple object by nesting synchronized blocks. For example,

synchronized(obj1){
   synchronized(obj2) {
      //here the thread has locks of obj1 as well as obj2
   }
}
Also remember that Java does not have any mechanism to prevent deadlocks. It is up to the developer to use the locks correctly to avoid deadlocks. One strategy that is commonly used to prevent deadlocks is to always acquire locks of the objects in the same sequence. (This topic will be elaborated in other questions.)
```

Please go through this link that explains synchronization and intrinsic locks.
You will find questions in the exam that use statements given in this trail: https://docs.oracle.com/javase/tutorial/essential/concurrency/locksync.html

Correct(A, B)

