package nio.cleanPathAndNotCleanPath;
import java.nio.file.*;

/**
 What will the following code fragment print?

        Path p1 = Paths.get("c:\\personal\\.\\photos\\..\\readme.txt");
        Path p2 = p1.normalize();
        System.out.println(p2);
        
        A. readme.txt
        B. c:\personal\photos\readme.txt
        C. c:\personal\readme.txt
            ---------------
            Notice that . is always redundant and is removed by itself, while .. and the
            preceding directory cancel each other out because .. means parent directory.
            For example, a/b/.. is same as a.
            
        D. c:\photos\readme.txt
        
       ----------------------------
       The following is the complete JavaDoc API description of this method:

        public Path normalize()
        
        Returns a path that is this path with redundant name elements eliminated.
        
        The precise definition of this method is implementation dependent but in general it derives from this path,
        a path that does not contain redundant name elements. In many file systems, the "." and ".." are
         special names used to indicate the current directory and parent directory.
         In such file systems all occurrences of "." are considered redundant.
         If a ".." is preceded by a non-".." name then both names are considered redundant
         (the process to identify such names is repeated until is it no longer applicable).
        
        This method does not access the file system; the path may not locate a file that exists. Eliminating ".."
        and a preceding name from a path may result in the path that locates a different file than the original path.
        This can arise when the preceding name is a symbolic link.
        
        Returns:
        the resulting path or this path if it does not contain redundant name elements;
        an empty path is returned if this path does have a root component and all name elements are redundant
         Correct C)

 */
public class PrintPersonalReadme {
     public static void main(String... args){
         Path p1 = Paths.get("c:\\personal\\.\\photos\\..\\readme.txt");
         Path p2 = p1.normalize();
        System.out.println(p2);
     }
}