package throwingAdditionalExceptions;

class TryToCatchManyException{
   public void exceptions(){
        StringBuilder result = new StringBuilder();
       String v = null;
      
          try{
             result.append("before_");
             v.length();
             result.append("after_");

          }catch(NullPointerException e){
              result.append("catch_");
	      System.out.println("catch null pointer exception");
              throw new IllegalArgumentException();
         } catch(IllegalArgumentException e){
              result.append("catch_illegal");
	      System.out.println("catch_illegal");
              throw new RuntimeException();
         }   
	 finally{
             result.append("finally_");
	      System.out.println("finally_");
             throw new ArithmeticException();
         }
      

      // return result.toString();
   }

   public static void main(String... args){

     var sample = new  TryToCatchManyException();
     sample.exceptions();
      // System.out.println(result);
    }

}
