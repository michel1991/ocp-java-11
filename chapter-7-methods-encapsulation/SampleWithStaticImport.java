import java.util.List;
import static java.util.Arrays.asList; // static import

public class SampleWithStaticImport{
   public static void main(String[] args){
     List<String> list = asList("one", "two");
     System.out.println("hey static using static import " + list);
   }
}
