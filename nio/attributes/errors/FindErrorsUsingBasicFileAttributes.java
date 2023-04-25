package nio.attributes.errors;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.net.*;
import java.io.*;

public class FindErrorsUsingBasicFileAttributes {
    
    /**
     *  How many lines of the following code contain compiler errors?
        A. All of the lines compile
        B. One
        C. Two
        D. Three
        E. Four or more
        
        Line 15 is the first line to not compile, as relativize()
        is an instance method, not a static method.
        Line 16 also does not compile, as size(), not length(),
        should be used to retrieve a file size.
        Finally, line 17 does not compile because view is an attribute class,
        not an attribute view. For line 17 to compile, line 13–14
        would have to use Files.getFileAttributeView()
        with BasicFileAttributeView.class as the class.
        The rest of the lines do not contain any compiler errors, making option D correct.
     */
   static  void firstExample() throws Exception{
       var path = Paths.get(new URI("ice.cool")); // 12:
       var view = Files.readAttributes(path,  // 13: 
                                       BasicFileAttributes.class); // 14: 
       Files.createDirectories(Path.relativize(".backup")); //  15:
       if(view.length() > 0 && view.isDirectory()) // 16: 
           view.setTimes(null,null,null); //    17:
       System.out.println(Files.deleteIfExists(path)); //  18: 
   }  
}