public class CastingErrorAutomaticPromotingWithoutCasting{
  public static void main(String[] args){
    short mouse = 10;
    short hamster = 3;
    short capybara = mouse * hamster; // does not compile
  }
}
