package improvingAttributeAccess;
import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;

class RetrievingAttributesWithReadAttributes{
    static void make() throws IOException{
     String mainDirectory = "folderRetrievingAttributes";
     String fullPathSource = System.getProperty("user.dir") + "/improvingAttributeAccess"  + "/" + mainDirectory ;	    
       var path = Paths.get(fullPathSource, "turtles", "sea.txt");
       BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);     
       System.out.println(" path source " + path  + " attribute below ");
       System.out.println("Is a directory? " + data.isDirectory());
        System.out.println("Is a regular file? " + data.isRegularFile());
       System.out.println("Is a symbolic link? " + data.isSymbolicLink());
       System.out.println("Size (in bytes): " + data.size());
       System.out.println("Last modified: " + data.lastModifiedTime());
    }

    public static void main(String... args) throws IOException{
       make();
    }
}
