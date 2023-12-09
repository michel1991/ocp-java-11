package concurrency;
import java.util.concurrent.*;
import java.io.*;

/**
 * Which of the following options correctly makes use of java.util.concurrent.Callable?
    A. public static class MyTask implements Callable<String>{
        public String call(){
            try {
              //do something
            } catch (Exception ex) {
              ex.printStackTrace();
            }
           return new Future<String>("Data from callable");
       }
    }
    Since MyTask binds Callable to String, the return value of call() must be a String. Further,
    since Future is an interface, new Future("Data from callable") will not compile either.
    
    B. public static class MyTask implements Callable<String>{
        public String call() throws Exception {
              //do something
           return "Data from callable";
       }
    }
    
    C. public static class MyTask extends Callable<String>{
        public String call(){
           return "Data from callable";
       }
    }
    Callable is an interface and not a class.
    
    D. public class MyTask implements Callable{
        Future result;
        public void call(){
           result = new Future<String>("Data from callable");
       }
    }
    
    Return type of the method call() cannot be void because Callable interface declares this method as :
        public interface Callable<V>{   
          V call() throws Exception; 
        }
    Note that if you put Future as the return type of the call method, it would be technically
    a valid implementation. But it would not be appropriate.
    A Callable should return actual data object instead of wrapping the data into a Future.
    It is the job of ExecutorService.submit() method to return a Future that wraps the data returned by Callable.call(). For example:
    Future result = Executors.newSingleThreadExecutor().submit(new MyTask()); Further,
    since Future is an interface, new Future("Data from callable") will not compile either.
    
You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/d2pE1Znp3lA
Correct(B)
    
 */



public class CallableImplementation {
   public  static class MyTask implements Callable<String>{ // public
       public String call() throws Exception {
            //do something
            return "Data from callable";
        }
    }
}