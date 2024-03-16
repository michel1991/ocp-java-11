package nio.changeLocation;
import java.nio.file.*;
import java.io.*;

/**
  Given that test1.txt exists but test2.txt doesn't exist, consider the following code?
   Which file attributes will be copied over to test2.txt?
   
    A. hidden
    B. readonly
    C. archive
    D. Copying of the attributes is platform and system dependent.
        From the JavaDoc API documentation for Files.copy: Attempts to copy
        the file attributes associated with source file to the target file.
        The exact file attributes that are copied is platform and file system dependent and therefore unspecified.
        Minimally, the last-modified-time is copied to the target file if supported by both the source and target file store.
        Copying of file timestamps may result in precision loss.
    E. It will print unable to copy file and test2.txt will not be created.
    
   Files.copy method will copy the file test1.txt into test2.txt. If test2.txt doesn't exist, it will be created.
    The following is a brief JavaDoc description for this method:
    
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
    
    NOFOLLOW_LINKS     Symbolic links are not followed. If the file is a symbolic link, then the symbolic link itself,
    not the target of the link, is copied. It is implementation specific if file attributes can be copied to the new link.
    In other words, the COPY_ATTRIBUTES option may be ignored when copying a symbolic link.
    An implementation of this interface may support additional implementation specific options.
    
    Copying a file is not an atomic operation.
    If an IOException is thrown then it possible that the target file is incomplete or some
    of its file attributes have not been copied from the source file. When the REPLACE_EXISTING option
    is specified and the target file exists, then the target file is replaced.
    The check for the existence of the file and the creation of the new file may not be atomic with respect to other file system activities.
    
    
    FYI: Although no relevant to this question, remember that Files.isSameFile method to doesn't check the contents of the file.
    It is meant to check if the two path objects resolve to the same file or not.
    Therefore, in this case, if you try to do Files.isSameFile(p1, p2), it will return false.

    Correct(D)

 */
public class FileCopier {
    public static void copy1(Path p1, Path p2) throws Exception {
        Files.copy(p1, p2, StandardCopyOption.COPY_ATTRIBUTES);
    }


    public static void main(String[] args) throws Exception {
        Path p1 = Paths.get("c:\\temp\\test1.txt");
        Path p2  = Paths.get("c:\\temp\\test2.txt");
        copy1(p1, p2);
    }
}