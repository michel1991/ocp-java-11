package multiCatchBlock;

class ProblematicMultiCatchBlock{
  public static void main(String[] args){
      try{
           System.out.println(Integer.parseInt(args[1]));
      } catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Missing or invalid input ");
      } catch(NumberFormatException e){
         System.out.println("Missing or invalid input ");
      }

   }
}
