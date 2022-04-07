package finallyBlock;

class SkipFinallyBlock{
  public static void main(String[] args){
      try{
         System.exit(0);
      }finally{
            System.out.println("Never going to get here");
       }
   }
}
