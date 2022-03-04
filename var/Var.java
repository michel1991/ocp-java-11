package var;
public class Var{
   public void var(){
      var var = "var";
      System.out.println("var using name of variable and method");
   }
  public void  Var(){
    Var var = new Var();
    System.out.println("create instance of class using with Var in uppercase and method name is Var");
  }
  public static void main(String[] args){
    Var sample = new Var();
    sample.var();
    sample.Var();
  }
}
