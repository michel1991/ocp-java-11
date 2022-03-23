public class PassingStringByValue{

  public static void speak(String name){
     name = "Sparky";
     System.out.println("inside passing copy value after changing value " + name);
  }

  public static void main(String[] args){
    String name = "Webby";
    speak(name);
    System.out.println("original value " + name);
  }
}
