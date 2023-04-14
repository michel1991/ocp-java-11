package identifyingThreadingProblems.understandingLiveness.deadlock;
import java.util.concurrent.*;

class Food{

}

class Water{

}

public class FixFoxByOrderingDemand {
    public void eatAndDrink(Food food, Water water){
        synchronized(food){
            System.out.println("Got Food!");
            move();
            System.out.println("Got Water!");
        }
    } // end method
   

    public void move(){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            //Handle exception

        }
    }

    public static void main(String[] args){
        // Create participants and resources
        var  foxy = new FixFoxByOrderingDemand();
        var  tails = new FixFoxByOrderingDemand();
        Food food = new Food();
        Water water = new Water();

        //process data
        ExecutorService service = null;
        try{
            service = Executors.newScheduledThreadPool(10);
            service.submit( 
                    () -> foxy.eatAndDrink(food, water)
            );

            service.submit(
                    () -> tails.eatAndDrink(food, water)
            );
        }finally{
            if(service !=null)
                service.shutdown(); 
        }

    }
}