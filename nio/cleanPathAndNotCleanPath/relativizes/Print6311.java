package nio.cleanPathAndNotCleanPath.relativizes;
import java.nio.file.*;

/**
 *  What will the following code fragment print?
 
    A. 7 4 11 10
    B. 7 3 8 9
    C. 6 3 1 1
    D. 6 3 1 1
    
    1. p1 has 6 components and so p1.getNameCount() will return 6.
    2. normalize applies all the .. and . contained in the path to the path. Therefore, p2 contains beaches\calangute\a.txt, that is 3 components.
    3. p3 contains an an empty path because both paths are equal after normalization.
    4. p4 contains an an empty path because both paths are equal after normalization.
    
    NOTE: Implementation for relativize method has changed in Java 11. It normalizes the paths before relativizing.
     That is why, for Java 11, it prints 6 3 1 1, while on Java 8, it prints 6 3 9 9
     
     You need to understand how relativize works for the purpose of the exam.
     The basic idea of relativize is to determine a path, which, when applied to the original path will give you the path that was passed.
     For example, "a/b" relativize "c/d" is "../../c/d"
     because if you are in directory b, you have to go two steps back and then one step forward to c and another step forward to d to be in d.
     However, "a/c" relativize "a/b" is "../b" because you have to go only one step back to a and then one step forward to b.

    Please go through the following description of relativize() method, which explains how it works in more detail.
    
    public Path relativize(Path other)
    Constructs a relative path between this path and a given path.
    Relativization is the inverse of resolution.
    This method attempts to construct a relative path that when resolved against this path,
    yields a path that locates the same file as the given path.
    For example, on UNIX, if this path is "/a/b" and the given path is "/a/b/c/d"
    then the resulting relative path would be "c/d".
    Where this path and the given path do not have a root component, then a relative path can be constructed.
    A relative path cannot be constructed if only one of the paths have a root component.
    Where both paths have a root component then it is implementation dependent if a relative path can be constructed.
    If this path and the given path are equal then an empty path is returned.
    
    For any two normalized paths p and q, where q does not have a root component,
    
    p.relativize(p .resolve(q)).equals(q)
    When symbolic links are supported, then whether the resulting path, when resolved against this path,
    yields a path that can be used to locate the same file as other is implementation dependent.
    For example, if this path is "/a/b" and the given path is "/a/x" then the resulting relative path may be "../x".
    If "b" is a symbolic link then is implementation dependent if "a/b/../x" would locate the same file as "/a/x".
    
    Parameters:
    other - the path to relativize against this path
    Returns:
    the resulting relative path, or an empty path if both paths are equal
    
    Correct(D)
 */
public class Print6311 {
    public static void main(String... arg){
        Path p1 = Paths.get("photos\\..\\beaches\\.\\calangute\\a.txt");
        Path p2 = p1.normalize();
        Path p3 = p1.relativize(p2);
        Path p4 = p2.relativize(p1);

        System.out.println(
                p1.getNameCount()+" "+p2.getNameCount()+" "+
                p3.getNameCount()+" "+p4.getNameCount());
    }
}