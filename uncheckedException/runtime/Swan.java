package uncheckedException.runtime;
class Swan{
   private int numberEggs;

  public void setNumberEggs(int numberEggs){
      if(numberEggs < 0)
        throw new IllegalArgumentException("# eggs must not be negative ");
      this.numberEggs = numberEggs;
   }
}
