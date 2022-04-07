package finallyBlock;
class ReturnWithFinally{
   int getHome(){
      try{
        // optionally throw an exception here
        System.out.print("1");

         return -1;
       } catch(Exception e){
          System.out.print("2");
          return -2;
       }finally{ 
          System.out.print("3");
          return -3;
       }
    
    }

  public static void main(String[] args){
     var sample = new ReturnWithFinally();
    var result = sample.getHome();
    System.out.println("the final result is " + result);

  }

}
