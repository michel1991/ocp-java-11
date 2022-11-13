package modulars.unamed;
import program.ChurchInTheMorning;
import java.util.*;

public class Testing {
  public static void main(String... args){
      var church = new ChurchInTheMorning();
      System.out.println(Arrays.asList(church.priestName()));
  }
}