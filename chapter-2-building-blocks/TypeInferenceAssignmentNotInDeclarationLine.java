public class TypeInferenceAssignmentNotInDeclarationLine{
     public void doesThisCompile(boolean check){
       var question;
       question = 1;
       var answer;
       if(check){
         answer = 2;
       } else{
        answer = 3;
       }
      System.out.println(answer);
   }
  public static void main(String[] args){
   TypeInferenceAssignmentNotInDeclarationLine  my = new TypeInferenceAssignmentNotInDeclarationLine();
   my.doesThisCompile(false);
  }
}
