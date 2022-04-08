package throwingAdditionalExceptions;

class FinallyClauseHideExecptionInCatch{
   public static void hideException() throws Exception{
      try{
         throw new RuntimeException();
       }catch(RuntimeException e){
          throw new RuntimeException();
       }finally{
          throw new Exception();
       }
   }

   public static void main(String... args) throws Exception{
       hideException();
   }

}
