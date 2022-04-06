package uncheckedException.runtime;

 class ClassCastExceptionAtRuntime{
   public static void main(String[] args){
      String type = "moose";
      Object obj = type;
     Integer number = (Integer)obj; // does not compile
   }

}
