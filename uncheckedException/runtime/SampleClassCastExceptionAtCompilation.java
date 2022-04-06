package uncheckedException.runtime;

 class SampleClassCastExceptionAtCompilation{
   public static void main(String[] args){
      String type = "moose";
     Integer number = (Integer)type; // does not compile
   }

}
