public class FollowingOrderOfExecution{
  {
    System.out.println("first initializer bloc ");
  }
  int order = 1;
  public static void main(String[] args) {
   System.out.println("method main");
     FollowingOrderOfExecution sample = new FollowingOrderOfExecution();
  }

  {
    order =2;
   System.out.println("I am 2 second instance initializer bloc modify the value of variable order after the value one give for first bloc  new is " +  2);
  }

}
