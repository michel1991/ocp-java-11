package polymorphism.casting;

public class Capybara{
  public static void main(String[] args){
      Rodent rodent = new Rodent();
      Capybara  capybara = (Capybara)rodent; // ClassCastException
  }

}
