package nio.delete;
import java.nio.file.*;
public class PrintTrue {
    /**
     * Given:
      Identify correct statements.
     
      A. It will print "c:\temp\out" if the file referred to by p is not deleted for any reason.
        The Files.deleteIfExists method returns a boolean - true if the file is deleted and false otherwise.
        
      B.  It will print an exception stack trace if p refers to a directory instead of a file.
        It can delete a directory also. However, a java.nio.file.DirectoryNotEmptyException will be thrown if the directory is not empty.
        
      C.  It will print an exception stack trace if p refers to an empty file or a non-empty directory.
        Size of the file is immaterial. It can delete an empty file also. But not a non-empty directory.
        
      D.  It will print an exception stack trace the file referred to by p cannot be deleted due to lack of appropriate file permissions.
      
       F.  It will not throw any exception in that case. It will just return false.
       
       
       (Correct F)
       
       public static boolean deleteIfExists(Path path) throws IOException
        Deletes a file if it exists.
        
        As with the delete(Path) method, an implementation may need to examine the file to determine if the file is a directory.
        Consequently this method may not be atomic with respect to other file system operations.
        If the file is a symbolic link, then the symbolic link itself, not the final target of the link, is deleted.
        
        If the file is a directory then the directory must be empty.
        In some implementations a directory has entries for special files or links that are created when the directory is created.
        In such implementations a directory is considered empty when only the special entries exist.
        
        On some operating systems it may not be possible to remove a file when it is open and in use by this Java virtual machine or other programs.
        
        Parameters:
        path - the path to the file to delete
        
        Returns:
        true if the file was deleted by this method; false if the file could not be deleted because it did not exist
        
        Throws:
        DirectoryNotEmptyException - if the file is a directory and could not otherwise be deleted because
        the directory is not empty (optional specific exception)
        
        IOException - if an I/O error occurs
        SecurityException - In the case of the default provider, and a security manager is installed,
        the SecurityManager.checkDelete(String) method is invoked to check delete access to the file.
     */
    public static void main(String... args) {
        Path p  = Paths.get("c:\\temp\\out");
        try{
            var b = Files.deleteIfExists(p);
            System.out.println(b);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}