package nio.changeLocation;
import java.nio.file.*;
import java.io.*;
import nio.NioUtilities;

/**
 * Given:
     Path p1 = Paths.get("c:\\temp\\test1.txt");
     Path p2  = Paths.get("c:\\temp\\test2.txt");


        Which of the following code fragments moves the file test1.txt to test2.txt, even if test2.txt exists?
        
      A. Files.move(p1, p2);
        This will throw a java.nio.file.FileAlreadyExistsException if the file already exists.
        
      B. Files.move(p1, p2, StandardCopyOption.REPLACE_EXISTING);
      
      C. try(Files.move(p1, p2)){
    }
    Files.move returns a Path object (of the destination file), which is not a resource that can be closed because
    it does not implement AutoCloseable interface. So this will not compile.
    
    D. try(Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING)){
        Files.delete(p1);
    }
    This seems like a valid option but again, it will not compile for the same reason as above.
    
    E. Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
    Files.delete(p1);
    
    Correct(B, E)
    
    Files.copy method will copy the file test1.txt into test2.txt. If test2.txt doesn't exist, it will be created.
    However, Files.isSameFile method doesn't check the contents of the file.
    It is meant to check if the two path objects resolve to the same file or not. In this case, they are not, and so, it will return false.
    
    The following is a brief JavaDoc description for both the methods:
    
    public static Path copy(Path source, Path target, CopyOption... options)
    throws IOException
    Copy a file to a target file.
    This method copies a file to the target file with the options parameter specifying how the copy is performed.
    By default, the copy fails if the target file already exists or is a symbolic link,
    except if the source and target are the same file, in which case the method completes without copying the file.
    File attributes are not required to be copied to the target file.
    If symbolic links are supported, and the file is a symbolic link, then the final target of the link is copied.
    If the file is a directory then it creates an empty directory in the target location (entries in the directory are not copied).
    
    The options parameter may include any of the following:
    
    REPLACE_EXISTING     If the target file exists, then the target file is replaced if it is not a non-empty directory.
    If the target file exists and is a symbolic link, then the symbolic link itself, not the target of the link, is replaced.
    
    COPY_ATTRIBUTES     Attempts to copy the file attributes associated with this file to the target file.
    The exact file attributes that are copied is platform and file system dependent and therefore unspecified.
    Minimally, the last-modified-time is copied to the target file if supported by both the source and target file store.
    Copying of file timestamps may result in precision loss.
    
    NOFOLLOW_LINKS     Symbolic links are not followed.
    If the file is a symbolic link, then the symbolic link itself, not the target of the link, is copied.
    It is implementation specific if file attributes can be copied to the new link.
    In other words, the COPY_ATTRIBUTES option may be ignored when copying a symbolic link.
    An implementation of this interface may support additional implementation specific options.
    
    Copying a file is not an atomic operation.
    If an IOException is thrown then it possible that the target file is incomplete
    or some of its file attributes have not been copied from the source file.
    When the REPLACE_EXISTING option is specified and the target file exists, then the target file is replaced.
    The check for the existence of the file and the creation of the new file may not be atomic with respect to other file system activities.
    
    
    public static Path move(Path source,  Path target,    CopyOption... options)
    throws IOException
    Move or rename a file to a target file.
    By default, this method attempts to move the file to the target file, failing if the target file exists except
    if the source and target are the same file, in which case this method has no effect.
    If the file is a symbolic link then the symbolic link itself, not the target of the link, is moved.
    This method may be invoked to move an empty directory.
    In some implementations a directory has entries for special files or links that are created when the directory is created.
    In such implementations a directory is considered empty when only the special entries exist.
    When invoked to move a directory that is not empty then the directory is moved if it does not require moving the entries in the directory.
    For example, renaming a directory on the same FileStore will usually not require moving the entries in the directory.
    When moving a directory requires that its entries be moved then this method fails (by throwing an IOException).
    To move a file tree may involve copying rather than moving directories and
    this can be done using the copy method in conjunction with the Files.walkFileTree utility method.
    
    The options parameter may include any of the following:
    
    REPLACE_EXISTING     If the target file exists, then the target file is replaced if it is not a non-empty directory.
    If the target file exists and is a symbolic link, then the symbolic link itself, not the target of the link, is replaced.
    ATOMIC_MOVE     The move is performed as an atomic file system operation and all other options are ignored.
    If the target file exists then it is implementation specific if the existing file is replaced or this method fails by throwing an IOException.
    If the move cannot be performed as an atomic file system operation then AtomicMoveNotSupportedException is thrown.
    This can arise, for example, when the target location is on a different FileStore and would require that the file be copied,
    or target location is associated with a different provider to this object.
    An implementation of this interface may support additional implementation specific options.
    
    Where the move requires that the file be copied then the last-modified-time is copied to the new file.
    An implementation may also attempt to copy other file attributes but is not required to fail if the file attributes cannot be copied.
    When the move is performed as a non-atomic operation, and a IOException is thrown, then the state of the files is not defined.
    The original file and the target file may both exist, the target file may be incomplete or some of its file attributes
    may not been copied from the original file.
    
 */
public class MoveTest1ToTest2 {
    
    static void responseB() throws IOException{
        Path p1 = Paths.get("c:\\temp\\test1.txt");
        Path p2  = Paths.get("c:\\temp\\test2.txt");
        Files.move(p1, p2, StandardCopyOption.REPLACE_EXISTING);
        
    }
    
    static void responseE() throws IOException{
        Path p1 = Paths.get("c:\\temp\\test1.txt");
        Path p2  = Paths.get("c:\\temp\\test2.txt");
        
        Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
    }
     public static void main(String... args) throws Exception{
         
     }
}