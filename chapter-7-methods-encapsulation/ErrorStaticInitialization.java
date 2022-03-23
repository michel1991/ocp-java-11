public class ErrorStaticInitialization{
   private static int one;
   private static final int two;
   private static final int three = 3;
   private static final int four; // does not compile forget to initialize in static bloc

   static{
     one = 1;
     two = 2;
     three = 3;
     two = 4;
  }

  public static void main(String... main){

  }

}
