package pond.duck;
public class GoodDuckling{
   public void makeNoise(){
     MotherDuck duck = new MotherDuck();
     duck.quack(); // default access
     System.out.println(duck.noise); // defaut access 
   }

   public static void main(String[] args){
      var goodDuckling = new GoodDuckling();
      goodDuckling.makeNoise();
   }


}
