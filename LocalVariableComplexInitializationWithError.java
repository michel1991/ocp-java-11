public class LocalVariableComplexInitializationWithError{
     public void findAnswer(boolean check){
       int answer;
       int otherAnswer;
       int onlyOneBranch;
       if(check){
         answer = 1;
       } else{
        answer = 2;
       }
      System.out.println(onlyOneBranch);
   }
  public static void main(String[] args){
   LocalVariableComplexInitializationWithError my = new LocalVariableComplexInitializationWithError();
   my.findAnswer(true);
  }
}
