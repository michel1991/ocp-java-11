import java.io.IOException;

public class SampleCheckedException{
   void fall (int distance) throws IOException{
     if(distance > 10){
         throw new IOException();
      }
   }
}
