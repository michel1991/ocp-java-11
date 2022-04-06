package uncheckedException.runtime;

 class SampleIllegalArgumentException{
   public static void main(String[] args){
      Swan swan = new Swan();
      swan.setNumberEggs(-2);
   }

}
