package writingALocalClass;

public class ErrorLocalClassWithReassignedEffectivelyFinalVaraiable{
   public void processData(){
     final int length = 5;
     int  width = 10;
     int height = 2;
   
     class VolumeCalculator{
         public int multiply(){
            return length * width * height; // does not compile
         }
     }
     width = 2;
   }
}
