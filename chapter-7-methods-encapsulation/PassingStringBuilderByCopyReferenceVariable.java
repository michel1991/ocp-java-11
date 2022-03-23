public class PassingStringBuilderByCopyReferenceVariable{

  public static void speak(StringBuilder s){
     s.append("Webby");
     System.out.println("inside passing  value after changing value " + s);
  }

  public static void main(String[] args){
    StringBuilder name = new StringBuilder();
    speak(name);
    System.out.println("original value " + name);
  }
}
