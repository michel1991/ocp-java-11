package internationalization;
import java.util.*;

/**
* Java will use Dolphins_fr.properties as the matching resource bundle on line 7 because it is an exact match on the language of the requested locale.
* Line 8 finds a matching key in this file. Line 9 does not find a match in that file; therefore, it has to look higher up in the hierarchy.
* Once a bundle is chosen, only resources in that hierarchy are allowed.
* It cannot use the default locale anymore, but it can use the default resource bundle specified by Dolphins.properties.
 */
public class LoadCorrectDolphins {
  public static void main(String... args){
      var fr = new Locale("fr");
      Locale.setDefault(new Locale("en", "US"));
      var b = ResourceBundle.getBundle("internationalization.Dolphins", fr);
      b.getString("name");
      b.getString("age");
      System.out.println(" name : " +   b.getString("name") + " age : " +  b.getString("age"));
  }
}