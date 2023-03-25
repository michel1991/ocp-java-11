package advancedDesign;
import java.util.function.*;
import java.util.*;
import java.util.stream.*;
import java.lang.annotation.*;
import java.io.*;

public  class Testing {
    private static float number = 2F;
    private static double numbers;

  public static void main(String... arsg){
   System.out.println( 9.0 % 5.0);
    // FileNotFoundException fio = (FileNotFoundException)io;
    //FileNotFoundException fio =  new FileNotFoundException();
    //IOException ioBis = (IOException) fio;
      //Double double1 = new Double(4.0);
      //Long long3 = (Long)double1;
      String t = "";
      String java = null;
      StringBuilder b = new StringBuilder();
      System.out.println(numbers + " separator " +  number);
      assert 1 == 1 ? true: false;
      char  case1 = 1;
      final var one = 1;
       Predicate<String> equalsX = String::isEmpty;
      LinkedList<String> names = new LinkedList<>();

     names.add("Arnaud");
      names.offer("Landry");
      names.add("Martini");
      //System.out.println(names.poll());
      // NAA463GQXPMKUFLF
      // NAA46FC6A3T6XRPT
      //System.out.println(names.remove(2));
      System.out.println(names + " " + names.element() + " " + names.peek());
  }
}