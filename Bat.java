public class Bat extends Mammal{
   String type = "bat";
   public String getType(){
     return super.type + ":" + this.type;
   }

   public static void main(String... zoo){
      System.out.print(new Bat().getType());
   }

}
