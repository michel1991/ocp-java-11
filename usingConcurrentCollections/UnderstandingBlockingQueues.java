package usingConcurrentCollections;
import java.util.concurrent.*;
import java.time.*;

class UnderstandingBlockingQueues{
  static void basicExample(){
     try{
           var blockingQueue = new LinkedBlockingQueue<Integer>();
           blockingQueue.offer(39);
           blockingQueue.offer(3, 4, TimeUnit.SECONDS);
           System.out.println(blockingQueue.poll());
            System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));
      }catch(InterruptedException e){
        //Handle interruption
      }
  }

  public static void main(String[] args){
    basicExample();
  }

}
