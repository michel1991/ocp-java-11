package pond.swan;
import pond.duck.MotherDuck; // import another package
public class BadCygnet{
   public void makeNoise(){
     MotherDuck duck = new MotherDuck();
     duck.quack(); // default access
     System.out.println(duck.noise); // default access 
   }

   public static void main(String[] args){
      var sample = new BadCygnet();
      sample.makeNoise();
   }


}
