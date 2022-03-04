public class LocalVariableFollowingByInitialization{
  public int notValid(){
   int y = 10;
   int x;
    x = 3;
   int reply = x + y; // does not compile
   return reply;
  }

 public static void main(String[] args){
   LocalVariableFollowingByInitialization myLocal = new LocalVariableFollowingByInitialization();
   System.out.println(myLocal.notValid()); 
 }
}
