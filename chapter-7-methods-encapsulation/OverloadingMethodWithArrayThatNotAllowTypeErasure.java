public class OverloadingMethodWithArrayThatNotAllowTypeErasure{
   public static void walk(int[] ints){
     System.out.println("walk without wrapper class of int ");
   }

  public static void walk(Integer[] integers){
     System.out.println("walk with wrapper class of int");
  }

  public static void main(String[] args){
      walk(new int[] {1, 3});
      walk(new Integer[]{1, 3});
   }

}
