public class AccassingStaticVariableOrMethod{
  public static void main(String... args){
    System.out.println(" accessing using class name before the name of property: "+ Koala.count);
    Koala k = new Koala(); // k is a koala
    System.out.println("Accessing using instance of class " + k.count);
    k = null;
    System.out.println("accessing after make that the reference varaiable point to null " + k.count); // k is still a koala
  }
}
