public class LocalVariableComplexInitializationWithError{
     public void findAnswer(boolean check){
       int answer;
       int otherAnswer;
       int onlyOneBranch;
       if(check){
         onlyOneBranch = 1;
         answer = 1;
       } else{
        answer = 2;
       }
      System.out.println(onlyOneBranch); // does not compile
   }
  public static void main(String[] args){
   LocalVariableComplexInitializationWithError my = new LocalVariableComplexInitializationWithError();
   my.findAnswer(false);
  }
}
