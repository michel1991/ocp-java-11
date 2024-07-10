package nio.noCommon;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;
import nio.NioUtilities;
import java.nio.charset.Charset;
import java.util.*;


public class WriteData {
    
    /**
       You have a file named customers.dat in c:\company\records directory.
       You want to copy all the lines in this file to another file named clients.dat in the
       same directory and you have the following code to do it:
       
       Which of the following options can be inserted independent of each other at //LINE 20 to make it work?
        Assume that the current directory for the program when it runs is c:\code.
        
        A. 
             Path p2 = p1.resolveSibling("\\clients.dat");
                 This will set p2 to c:\clients.dat, which is not what you want.
        B.
             Path p2 = p1.resolveSibling("clients.dat");
             -------
             You already have the absolute path to customers.dat in p1.
             Further, it is given that you want to copy the data to a file in the same directory i.e.
             both the files - old and new, are siblings.
        
            So, to open clients.dat, you need to determine the absolute path for clients.dat
            using the absolute path for customers.dat.
            In other words, you are trying to get the absolute path for a file that exists in the same directory as the original file.
            The method resolveSibling is meant exactly for this purpose.
            
       C.
            Path p2 = p1.relativize("clients.dat");
       D.
            Path p2 = Paths.get("c:", p1.subpath(0, 2).toString(), "clients.dat");
               ---
              This is very straight forward. You should go through the JavaDoc API description for Path.subpath and Paths.get methods.
       
       E. Path p2 = Paths.get("c:", p1.subpath(1, 2).toString(), "clients.dat");
             -----
            p1.subpath(1, 2) will return "records", so the full path will be "c:\records\clients.dat", which is not what you want.
            
        Correct(B, D)

     */
    public static void writeData() {
        
        var resourcePath = Path.of(
                NioUtilities.getResourcePath().toString(),
                "noCommon",
                "writeData",
                "c",
                "company",
                "records"
        );
        
        //Path p1 = Paths.get("c:\\company\\records\\customers.dat");
        Path p1 = Paths.get(resourcePath.toString(), "customers.dat");
        

        //LINE 20  - INSERT CODE HERE
       // Path p2 = p1.resolveSibling("clients.dat");
        Path p2 = p1.resolveSibling(resourcePath.resolve("clients.dat").toString());
        

        try (
                var br = new BufferedReader(new FileReader(p1.toFile()));
                var bw = new BufferedWriter(new FileWriter(p2.toFile()))) {
            String line = null;
            while ((line = br.readLine()) != null) {

                bw.write(line);
                bw.newLine();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}