package multiCatchBlock;

class BasicApplyingMultiCatchBlock{
  public static void main(String[] args){
      try{
           System.out.println(Integer.parseInt(args[1]));
      } catch(ArrayIndexOutOfBoundsException | NumberFormatException  e){
         System.out.println("Missing or invalid input ");
      }

   }
}
