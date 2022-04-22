package definingAFunctionalInterface;

public interface Sleep{
   private void snore(){

  }

   default int getZzz(){
      return 1;
   }
}
