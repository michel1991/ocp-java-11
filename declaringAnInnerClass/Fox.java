package declaringAnInnerClass;

public class Fox{
   private class Den(){

  }

  public void goHome(){
    new Den();
  }

  public static void visitFriend(){
     new Den(); // does not compile
  }

}
