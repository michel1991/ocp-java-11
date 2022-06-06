package improvingAttributeAccess;
import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;

class RetrievingAttributesWithReadAttribute{
    static void make() throws IOException{
       var path = Paths.get("turtles/sea.txt");
       BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);     
 
       System.out.println("Is a directory? " + data.isDirectory());
        System.out.println("Is a regular file? " + data.isRegularFile());
       System.out.println("Is a symbolic link? " + data.isSymbolicLink());
       System.out.println("Size (in bytes): " + data.size());
       System.out.println("Last modified: " + data.lastModifiedTime());
    }

}
