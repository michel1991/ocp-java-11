package uncheckedException.runtime;

 class SampleArrayIndexOutOfBoundsException{
   public static void main(String[] args){
      int[] countsOfMoose = new int[3];
     System.out.println(countsOfMoose[-1]);
   }

}
