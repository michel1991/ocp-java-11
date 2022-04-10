package declaringFinalLocalVariables;

class ErrorPrintZooInfo{
  private void printZooInfo(boolean isWeekend){
    final int giraffe = 5;
   final long lemur;
   if(isWeekend) 
     lemur = 5;
   giraffe = 3;
   System.out.println(giraffe + " " + lemur); 

  }

  public static void main(String... args){
       var sample = new ErrorPrintZooInfo();
       sample.printZooInfo(false);
  }
}
