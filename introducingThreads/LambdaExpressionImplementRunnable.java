package introducingThreads;

class LambdaExpressionImplementRunnable{
   public static void main(String[] args){
       Runnable sloth = () -> System.out.println("Hello world");
       Runnable snake = () -> {
          int i = 10; 
         i++;
       };
       Runnable beaver =  () -> {
          return ;
       };
      
      Runnable coyote = () -> {};
      
   }
}
