package nio.resolve;
import java.nio.file.*;

/**
 What will the following code print?

   Path p1 = Paths.get("c:\\temp\\test.txt");
   Path p2 = Paths.get("c:\\temp\\report.pdf");
   System.out.println(p1.resolve(p2));
   
   A. ..\report.pdf
        This output will be produced by p1.relativize(p2).
        
   B.  temp\report.pdf
   C.  report.pdf
   D.  c:\temp\report.pdf
        When the argument to resolve starts with the root (such as c: or, on *nix, a /), the result is same as the argument.
   
   -------------------------
   Please go through the following description of Path.resolve() method as given in JavaDoc API:

    public Path resolve(Path other)
    
    Resolve the given path against this path.
    
    If the other parameter is an absolute path then this method trivially returns other.
    If other is an empty path then this method trivially returns this path.
    Otherwise this method considers this path to be a directory and resolves the given path against this path.
    In the simplest case, the given path does not have a root component,
    in which case this method joins the given path to this path and returns a resulting path that ends with the given path.
     Where the given path has a root component then resolution is highly implementation dependent and therefore unspecified.
    
    Parameters:
    other - the path to resolve against this path
    
    Returns:
    the resulting path
   Correct(D)

 */
public class PrintTempReport {
    public static void main(String... args){
        //Path p1 = Paths.get("c:\\temp\\test.txt");
        Path p1 = Paths.get("c/temp/test.txt");
        //Path p2 = Paths.get("c:\\temp\\report.pdf");
        Path p2 = Paths.get("/c/temp/report.pdf");
        System.out.println(p1.resolve(p2));
   }
}