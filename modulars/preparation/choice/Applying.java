package choice;
import program.ChurchInTheMorning;
import java.util.*;
public class Applying {
   public static void main(String... args){
     System.out.println("entry points necessary to go to church");
     var church = new ChurchInTheMorning();
     System.out.println(Arrays.asList(church.priestName()));
   }
}