public class CastingPromotingErrorUsingOperations{
  public static void main(String[] args){
      short mouse = 10;
     short hamster = 3;
     short capybara = (short) mouse * hamster; // does not compile
    short gerbil = 1 + (short) (mouse * hamster); // does not compile
     
   }
}
