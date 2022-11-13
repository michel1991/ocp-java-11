package automatic;
import program.ChurchInTheMorning;
import java.util.*;

public class AutomaticHelper {
    public static void main(String... args){
       var church = new ChurchInTheMorning();
       System.out.println(Arrays.asList(church.priestName()));
   }
}