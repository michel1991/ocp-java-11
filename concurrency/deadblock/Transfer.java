package concurrency.deadblock;
import java.util.concurrent.locks.*;
import java.util.concurrent.*;

/**
 Given the following class code:
    public class Transfer implements Runnable{
        Account from, to;
        double amount;
        public Transfer(Account from, Account to, double amount){
            this.from = from; this.to = to; this.amount = amount;
        }
        public void run(){
            synchronized(from){
                from.setBalance(from.getBalance()-amount);
                synchronized(to){
                    to.setBalance(to.getBalance()+amount);
                }
            }
        }
    }
    
    Relevant code for the Account class referred above is as follows:
    public class Account{
        private String id; private double balance;
        //constructor and accessor methods not shown,
    }
    
    
    What will happen when the following code is executed?
    
    
    var es = Executors.newCachedThreadPool();
    var a1 = new Account("A1", 1000);
    var a2 = new Account("A1", 1000);
    es.submit(new Transfer(a1, a2, 200));
    es.submit(new Transfer(a2, a1, 300));
    
    A. Code will run successfully without any problem.
    B. The code may enter a deadlock.
    C. The code may enter a livelock.
    D. The code may enter a starvation situation.
    
    This code illustrates how deadlock might occur when multiple threads try to acquire locks on multiple objects in different sequence.
    Consider the following situation -
    Thread1 tries to execute the first transfer and acquires the lock for account a1.
    It updates the balance of a1 but before it could acquire the lock for a2, thread2 executes and acquires the lock for account a2.
    Thread2 updates the balance and tries to acquire the lock of a1. It will now be stuck because a1's lock is already acquired by thread1.
    It will not proceed until thread1 releases a1's lock. At the same time, it will keep its own lock for a2 because it has not released it.
    Now, thread1 executes and tries to acquire the lock for a2, which is with thread2. So it cannot proceed further either.
    
    As you can see, both the threads are stuck. No one is executing any code.
    This situation, where none of the threads are able to execute any code for the want of locks acquired by each other, is called a deadlock.

 */
public class Transfer implements Runnable{
    Account from, to;
    double amount;
    public Transfer(Account from, Account to, double amount){
        this.from = from; this.to = to; this.amount = amount;
    }
    public void run(){
        synchronized(from){
            from.setBalance(from.getBalance()-amount);
            synchronized(to){
                to.setBalance(to.getBalance()+amount);
            }
        }
    }
    
    public static void main(String... args){
        var es = Executors.newCachedThreadPool();
        var a1 = new Account("A1", 1000);
        var a2 = new Account("A1", 1000);
        es.submit(new Transfer(a1, a2, 200));
        es.submit(new Transfer(a2, a1, 300));
    }
}

class Account{
    private String id; private double balance;
    //constructor and accessor methods not shown,
    public Account(String id, double balance){
        this.id = id;
        this.balance = balance;
    }
    
    String getId(){
        return null;
    }
    
    double getBalance(){
        return 0;
    }
    
    void setBalance(double balance){
        this.balance = balance;
    }
}



