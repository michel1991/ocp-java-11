
package nio.paths;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * What will the following code print when run?
   A. IllegalArgumentException
   B.  ArrayIndexOutOfBoundsException
   C.  c:\
   D.  c:
   E.  main
   
   Remember the following 4 points about Path.getName() method :

    1. Indices for path names start from 0.
    2. Root (i.e. c:\) is not included in path names.
    3. \ is NOT a part of a path name.
    4. If you pass a negative index or a value greater than or equal to the number of elements,
    or this path has zero name elements, java.lang.IllegalArgumentException is thrown. It DOES NOT return null.
    
    Thus, for example, If your Path is "c:\\code\\java\\PathTest.java",
    
    p1.getRoot()  is c:\  ((For Unix based environments, the root is usually / ).
    p1.getName(0)  is code
    p1.getName(1)  is java
    p1.getName(2)  is PathTest.java
    p1.getName(3)  will cause IllegalArgumentException to be thrown.

 */
class PathTest {
    static Path p1 = Paths.get("c:\\main\\project\\Starter.java");

    public static String getData(){
        String data = p1.getName(0).toString();
        return data;
    }

    public static void main(String[] args) {
        System.out.println(getData());
    }
}

public class PickMain {
    public static void main(String[] args) {
        PathTest.main(args);
    }
}