package nio.paths;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * What will the following code print when run?
   A.  \b : \b
   B.   b : b
   C.  b : b\c\
   D.  a : a\b
   E.  b : b\c
   
   Remember the following points about Path.subpath(int beginIndex, int endIndex)
    1. Indexing starts from 0.
    2. Root (i.e. c:\) is not considered as the beginning.
    3. name at beginIndex is included but name at endIndex is not.
    4. paths do not start or end with \.
    
    Thus, if your path is "c:\\a\\b\\c",
    
    subpath(1,1) will cause IllegalArgumentException to be thrown.
    subpath(1,2) will correspond to b.
    subpath(1,3) will correspond to b/c.
    
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
    
    Correct(B)
    
 */
public class PathTest {
    static Path p1 = Paths.get("c:\\a\\b\\c");

    public static String getValue(){
        String x = p1.getName(1).toString();
        String y = p1.subpath(1,2).toString();
        return x+" : "+y;
    }

    public static void main(String[] args) {
        System.out.println(getValue());
    }
}