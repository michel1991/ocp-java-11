package nio.relativizes;
import java.nio.file.*;

public class YellowStone {
    /**
       What will the following code print?

           Path p1 = Paths.get("/photos/vacation");
        Path p2 = Paths.get("/yellowstone");
        System.out.println(p1.resolve(p2)+"  "+p1.relativize(p2));
       
       A. yellowstone  ../../yellowstone
       B. /yellowstone  ../../yellowstone
            1. Since the argument to resolve starts with /,
               it is an absolute path (on a Unix based file system) and so the result will be the same as the argument.
               If the argument doesn't start with a / and it doesn't start with a root such as c:,
               the output is the result on appending the argument to the path on which the method is invoked.
            
            2. To arrive at /yellowstone from /photos/vacation, you have to first go two directories up and then down to yellowstone.
              Therefore, p1.relativize(p2) will be ../../yellowstone
              
       C. /yellowstone  /yellowstone
       D. /yellowstone  yellowstone
       
       ------------------------
       Please go through the following description of Path.resolve() method as given in JavaDoc API:

        public Path resolve(Path other)
        
        Resolve the given path against this path.
        
        If the other parameter is an absolute path then this method trivially returns other.
        If other is an empty path then this method trivially returns this path.
        Otherwise this method considers this path to be a directory and resolves the given path against this path.
        In the simplest case, the given path does not have a root component, in which case this method
        joins the given path to this path and returns a resulting path that ends with the given path.
        Where the given path has a root component then resolution is highly implementation dependent and therefore unspecified.
        
        Parameters:
        other - the path to resolve against this path
        
        Returns:
        the resulting path
        
        Correct(B)


     */
    public static void main(String... args){
        Path p1 = Paths.get("/photos/vacation");
        Path p2 = Paths.get("/yellowstone");
        System.out.println(p1.resolve(p2)+"  "+p1.relativize(p2));
    }
}