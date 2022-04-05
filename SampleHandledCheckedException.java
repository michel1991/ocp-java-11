import java.io.IOException;

public class SampleHandledCheckedException{
   void fall (int distance){
    try{
     if(distance > 10){
         throw new IOException();
      }
    }catch(Exception e){
        e.printStackTrace();
     }
   }
}
