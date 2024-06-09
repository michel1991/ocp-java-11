package io.tricky;
import java.io.*;
import io.PathUtility;
import static io.PathUtility.*;
import java.nio.file.*;

/**
 Assume that the following directory exists:

    c:\a\b\c
    
    A File object is created as follows:
    
    var f = new File("c:\\a\\b\\c\\d\\e");
    
    Given that directories d and e do not exist under c, which of the following statements are correct?
    
    A. The given line of code will throw an exception at run time.
        A file or directory need not exist to create a File object.
        
    B. f.mkdir(); will create directory d under c and directory e under d.
        mkdir() can only create the last component of a path. It cannot create a directory structure. For that you must use mkdirs().
        
    C.
        f.mkdirs(); will create directory d under c and directory e under d.
        ---
        public boolean mkdirs()
        Creates the directory named by this abstract pathname, including any necessary but nonexistent parent directories.
        Note that if this operation fails it may have succeeded in creating some of the necessary parent directories.
        
        Returns: true if and only if the directory was created, along with all necessary parent directories; false otherwise
      
    D. f.getParentFile() will return a File Object representing c:\a\b\c\d
        ---
        getParent() returns a String and getParentFile() returns a File object.
       
    E. None of these.


     --------
       correct(C, D)

 */
public class MkDirsAndGetParentFile {
    public static void main(String... args) throws Exception{
        Path filleWithPath = Path.of(getResourcePath().toString(), "c", "d", "e");
        // var f = new File("c:\\a\\b\\c\\d\\e");
        var f = filleWithPath.toFile();
        f.delete();
        var fo = new  FileOutputStream(f);
        var bytes = new byte[]{'t', 'e', 's', 't'};
        fo.write(bytes);
    }
}