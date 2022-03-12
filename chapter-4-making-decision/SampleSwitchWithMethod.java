public class SampleSwitchWithMethod{
   final int getCookies(){
    return 4;
  }

  void feedAnimals(){
     final int bananas = 1;
     int apples = 2;
     int numberOfAnimals = 3;
     final int cookies = getCookies();
     switch(numberOfAnimals){
         case bananas:
         case apples: // does not compiles
         case getCookies(): // does not compile
         case cookies:  // does not compile
         case 3 * 5:
     }
  }

  public static void main(String[] args){
     SampleSwitchWithMethod sample = new SampleSwitchWithMethod();
     sample.feedAnimals();
  }
}
