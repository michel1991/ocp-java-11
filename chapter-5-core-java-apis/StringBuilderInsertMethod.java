public class StringBuilderInsertMethod{
   public static void main(String[] args){
      StringBuilder sb  = new StringBuilder("animals");
      sb.insert(7, "-");
      System.out.println("first insert tiret after invisible index in this case 7 "+ sb);
      sb.insert(0, "-");
      System.out.println("second insert at index 0 " + sb);
      sb.insert(4, "-");
      System.out.println("third insert at index 4 " + sb);
      
   }
}
