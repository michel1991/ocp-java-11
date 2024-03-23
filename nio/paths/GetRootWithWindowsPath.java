package nio.paths;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * What will the following code print when run?
   A.  \
   B.  c:
   C.  c:\
   D.  It will print an empty string.

   Path getRoot()
    Returns the root component of this path as a Path object, or null if this path does not have a root component.
    
    Path getName(int index)
    Returns a name element of this path as a Path object.
    The index parameter is the index of the name element to return. The element that is closest
    to the root in the directory hierarchy has index 0. The element that is farthest from the root has index count-1.
    
    Parameters:
    index - the index of the element
    
    The following 4 points about Path.getName() method are good to know as well:
    
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
    
    Correct(B)
 */
class PathTest {
    static Path p1 = Paths.get("c:\\main\\project\\Starter.java");

    public static String getRoot(){
        String root = p1.getRoot().toString();
        return root;
    }

    public static void main(String[] args) {
        System.out.println(getRoot());
    }
}

public class GetRootWithWindowsPath {
    
}