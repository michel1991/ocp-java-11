public class EqualityUsingPoolStringWithInternMethod{
   public static void main(String[] args){
      String name = "Hello World";
      String name2 = new String("Hello World").intern();
      System.out.println( name == name2); 
   }
}
