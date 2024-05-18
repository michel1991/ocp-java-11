package nio.paths;
import java.nio.file.*;


/**
 Which of the following statements will print /test.txt when executed on a *nix system?

    A. System.out.println(Path.get("/test.txt"));
       Path is an interface. There is no static method named get in Path.
      
    B. System.out.println(new Path("/test.txt"));
        Since Path is an interface, it cannot be instantiated.
        
    C. System.out.println(Paths.get("/", "test.txt"));
        Note that this will throw an exception on Windows.
        It is not clear if the exam explicitly mentions the platform on which
        the code is run in the problem statement of questions that depend on platform specifics.
        In case it does not, our recommendation is to assume that the code is run on a *nix system unless
        the paths used in the code are clearly for a windows system (such as paths starting with c:\> ).
        
    D. System.out.println(Path.toPath("/test.txt"));
        There is no toPath method in Path. There is a toFile method, which returns a File object.
        
    E. System.out.println(Paths.toPath("/test.txt"));
        There is no toPath method in Paths.
        
    ---------------------
       You should go through the JavaDoc API description of Paths.get
       method http://docs.oracle.com/javase/8/docs/api/java/nio/file/Paths.html#get-java.lang.String-java.lang.String...-.
        Here are the details for your convenience:
        
        public static Path get(String first,  String... more)
        
        Converts a path string, or a sequence of strings that when joined form a path string, to a Path.
        If more does not specify any elements then the value of the first parameter is the path string to convert.
        If more specifies one or more elements then each non-empty string, including first,
        is considered to be a sequence of name elements (see Path) and is joined to form a path string.
        The details as to how the Strings are joined is provider specific but typically they will be joined using the name-separator as the separator.
        For example, if the name separator is "/" and getPath("/foo","bar","gus")
        is invoked, then the path string "/foo/bar/gus" is converted to a Path.
        A Path representing an empty path is returned if first is the empty string and more does not contain any non-empty strings.
        The Path is obtained by invoking the getPath method of the default FileSystem.
        
        Note that while this method is very convenient, using it will imply an assumed reference
        to the default FileSystem and limit the utility of the calling code. Hence it should not be used in library code intended for flexible reuse.
        A more flexible alternative is to use an existing Path instance as an anchor, such as:
        
            Path dir = ...
            Path path = dir.resolve("file");
      Correct(C)
      
 */
public class PrintTest {
    public static void main(String... args){
        System.out.println(Paths.get("/", "test.txt"));
    }
}