public class CastingSuccessAutomaticPromotingWithoutCasting{
  public static void main(String[] args){
    short mouse = 10;
    short hamster = 3;
    short capybara =(short) (mouse * hamster);
    System.out.println("all done " + capybara);
  }
}
