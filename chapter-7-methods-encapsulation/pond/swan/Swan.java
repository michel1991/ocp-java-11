package pond.swan;
import pond.shore.Bird;  // in different package than Bird

public class Swan extends Bird{ // but subclass of bird
   public void swim(){
      floatInWater(); // subclass access to superclass
      System.out.println(text); // subclass access to superclass
   }

   public void helpOtherSwanSwim(){
      Swan other = new Swan();
       other.floatInWater(); // subclass access to superclass
       System.out.println(other.text); // subclass access to superclass
   }

   public void helpOtherBirdSwim(){
     Bird other = new Bird();
     other.floatInWater(); // does not compile
     System.out.println(other.text); // does not complie
  }

}
