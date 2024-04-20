package concurrency.threadSafe;
import java.util.*;
import java.util.concurrent.locks.*;

/**
 * Consider the following code:
 * What can be done to make the above code thread safe?
   A. Change new ReentrantLock() to new ReentrantLock(true).
    ReentrantLock has two constructors - the no-args one and the boolean one.
    The boolean constructor allows you to specify whether you want to apply fairness policy or not.
    In this case, either of the constructors is fine. There is no need to change.
    
    B. Move the call to lock.lock(); to before the try block.
    Although valid, this change is not required.
    
    C. Declare lock variable as private and final.
    Unless lock is private and final, it can be changed to point to some other object by another thread.
    In that case, the whole point of locking the critical section of the code using the same lock will be lost.
    
    D. Make the lock variable private, final, and static.
    Making it static will cause all Account object to use the same lock.
    This means only one Account object can be used at any time, which will drastically reduce performance and is not desired.
    
    E. Make the lock variable static.
    F. No change is required.
    
    Correct(C)

 */
class Account{
    private String id; private double balance;

    ReentrantLock lock = new ReentrantLock();
    
    public void withdraw(double amt){
        try{
            lock.lock();
            if(balance > amt) balance = balance - amt;
        }finally{
            lock.unlock();
        }
    }
}
