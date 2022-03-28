package creatingFinalMethods;

public class Penguin extends Bird{
 public final boolean hasFeathers(){ // does not compile
    return false;
  }

  public final static void flyAway(){ // does not compile
  }

}
