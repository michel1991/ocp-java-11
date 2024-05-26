package nio.paths;
import java.nio.file.*;

public class RootInotIncludeInPath {
    /**
     Given:
        Path p1 = Paths.get("c:\\a\\b\\c.java");
        
        What will p1.getName(2).toString() return?
        
        A. a
        B. b
        C. c
        D. c.java
        
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
    public static void main(String... args){
        //Path p1 = Paths.get("c:\\a\\b\\c.java"); // originla
        Path p1 = Paths.get("/a/b/c.java");
        var result = p1.getName(2).toString();
        System.out.println(result);
    }
}