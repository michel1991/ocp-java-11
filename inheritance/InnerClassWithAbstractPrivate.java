package inheritance;
abstract class Elephant {
    abstract static private class SleepsAlot {
        abstract int sleep();
    }

    /* abstract static private class RunAlot extends SleepsAlot{
        abstract int sleep();
     }*/

    private class EatAlot  extends SleepsAlot{
         int sleep() {
            return 0;
        };
    }
}

public class InnerClassWithAbstractPrivate {
  public static void main(String... args){

  }
}