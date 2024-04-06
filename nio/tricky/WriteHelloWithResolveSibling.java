package nio.tricky;
import java.nio.file.*;
import java.io.*;


public class WriteHelloWithResolveSibling {
    /**
       Consider the directory structure and its contents shown in the figure.
        (c:\temp is a directory that contains two text files - test1.txt and text2.txt)
        
        What should be inserted at //Line 10 in the following code so that it will write "hello" to text2.txt?
        
        A.
         p1.resolve("text2.txt");
            This will return "c:\temp\test1.txt\text2.txt", which is not what you want. The following is  how resolve(String other) works:
            If the other parameter is an absolute path then this method trivially returns other.
            If other is an empty path then this method trivially returns this path.
            Otherwise this method considers this path to be a directory and resolves the given path against this path.
            In the simplest case, the given path does not have a root component, in which case this method
            joins the given path to this path and returns a resulting path that ends with the given path.
            Where the given path has a root component then resolution is highly implementation dependent and therefore unspecified.
            
        B.
          p1.relativize("c:\\temp\\text2.txt");
        This is wrong for two reasons -
        1. relativize method does not take a String as an argument. It takes a Path object.
        2. relativize method is meant to convert an absolute path into a relative path. But here,
        we want to convert a relative path to an absolute path.
        For example, p2 = p1.relativize(Paths.get("c:\\temp\\text2.txt")); will produce "..\text2.txt"
        
       C.  p1.resolveSibling("text2.txt");
       
       D. p1.relativize(Paths.get("text2.txt"));
            This will thrown an IllegalArgumentException saying 'other' is different type of Path.
            This is because a relative path cannot be constructed if only one of the paths is an absolute path.
             Here, p1 is an absolute path (because it starts with a root) and p2 is a relative path.
             
      
    You already have the absolute path to test1.txt in p1. Further, it is given that test1.txt is in the same directory as text2.txt i.e.
    both the files are siblings.

    To open test2.txt, you need to determine the absolute path for text2.txt using the absolute path for test1.txt.
    In other words, you are trying to get the absolute path for a file that exists in the same directory as the original file.
    The method resolveSibling is meant exactly for this purpose.  
    
    This will set p2 to c:\temp\text2.txt, which can then be used to create File object.
    
    You should go through the following JavaDoc API description for resolveSibling method.
    
    public Path resolveSibling(String other) or public Path resolveSibling(Path other) :-
    
    Resolves the given path against this path's parent path. This is useful where a file name needs to be replaced with another file name.
    For example, suppose that the name separator is "/" and a path represents "dir1/dir2/foo",
    then invoking this method with the Path "bar" will result in the Path "dir1/dir2/bar".
     If this path does not have a parent path, or other is absolute, then this method returns other.
     If other is an empty path then this method returns this path's parent, or where this path doesn't have a parent, the empty path.
     
     Correct(C)

     */
    public static void writeData() throws Exception{
        var p1 = Paths.get("c:\\temp\\test1.txt");
        var p2 = p1.resolveSibling("text2.txt"); //LINE 10 - INSERT CODE HERE
        var bw = new BufferedWriter(new FileWriter(p2.toFile()));
        bw.write("hello");
        bw.close();
    }
    
    public static void main(String... args) throws Exception {
        writeData();
    }
}