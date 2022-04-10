package declaringFinalLocalVariables;

class PrintZooInfo{
  private void printZooInfo(boolean isWeekend){
    final int giraffe = 5;
   final long lemur;
   if(isWeekend) 
     lemur = 5;
  else 
    lemur = 10;
   System.out.println(giraffe + " " + lemur); 

  }

  public static void main(String... args){
       var sample = new PrintZooInfo();
       sample.printZooInfo(false);
  }
}
