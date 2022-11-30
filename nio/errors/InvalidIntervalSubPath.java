package nio.errors;
import java.nio.file.*;

/**
* Path instances are immutable, so the normalize() operation (which simplifies the path to /sunday) is lost since the variable
* p is not reassigned. For this reason, options C and E are not possible. Option C would be correct if the proper indices were used.
*  Calling getName(i) returns an equivalent path as subpath(i,i+1). Since subpath(i,i) was used, though, an IllegalArgumentException
* will be thrown at runtime, making option B correct. With subpath(), the first parameter is inclusive, and the second parameter is exclusive.
 */
public class InvalidIntervalSubPath {
  static void displayPath(){
      Path p = Paths.get("/chocolate/./../sunday");
      p.normalize();
      System.out.println( p.normalize());
      for(int i=0; i<p.getNameCount(); i++) {
          System.out.println(p.getName(i).equals(p.subpath(i, i)));
      }
  }

    public static void main(String... args){
      displayPath();
  }
}