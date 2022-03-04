public class LocalVariableWithError{
  public int notValid(){
   int y = 10;
   int x;
   int reply = x + y; // does not compile
   return reply;
  }

 public static void main(String[] args){
   LocalVariableWithError myLocal = new LocalVariableWithError();
   System.out.println(myLocal.notValid()); 
 }
}
