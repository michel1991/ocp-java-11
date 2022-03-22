package pond.goose;
import pond.shore.Bird;

public class Gosling extends Bird{
  public void swim(){
     floatInWater(); // calling protected member
    System.out.println(text); // accessing protected member
  }

 public static void main(String[] args){
     var gosling = new Gosling();
    gosling.swim();
 }


}
