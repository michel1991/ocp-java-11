import static java.util.Arrays.asList;
public class StaticImportRecreateMethod{
  public static void asList(){
    System.out.println("Hello my custom method as list");
  }

  public static void main(String... args){
       asList();
   }
}
