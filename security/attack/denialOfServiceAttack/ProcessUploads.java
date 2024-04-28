package security.attack.denialOfServiceAttack;

import java.io.*;
import java.util.*;

/**
 * Identify correct statements about the following code:
    A. It can be a target of a denial of service attack.
    The given code can be affected by a denial of service attack because it does not check the number
    of files that it is going to open in this method call.
    If the caller supplies it a file that contains a million file names, this method may crash.
    
    To fix this, it should limit the number of files that can be opened by checking the size of listOfFilesFile.
    
    The loadXML method may also suffer from the same problem but since its code is not given, it is not possible to comment on it.
    
    B. It violates secure coding guidelines by not validating inputs.
    C. It violates secure coding guidelines for preventing confidential information from getting exposed.
    D. It violates secure coding guidelines for managing mutable data.
   -----------------------
    correct(A)
    Opening and reading files has potential to be a target of denial of service attacks because of the size of the files.
    A malicious user could supply file names that refer to large media files whose size may be in giga bytes.
    If a program expects to load and interpret character data such as xml from an input file,
    then even a small sized file could blow up into a huge file due to expansion of entity references.
    Similarly, a highly compressed file could blow up into a huge file.
    
    All these cases may cause a program to fail due to lack of system resources.
    
 */
public class ProcessUploads {
    static void loadXML(BufferedReader fbfr){
        
    }
    
    public void processUploads(String listOfFilesFile) throws IOException{
        File f = new File(listOfFilesFile);
        List<BufferedReader> al = new ArrayList<BufferedReader>();
        try(BufferedReader bfr = new BufferedReader(new FileReader(f))){
            String uploadedFileName = null;
            while( (uploadedFileName=bfr.readLine()) != null ){
                BufferedReader fbfr = new BufferedReader(
                new FileReader(uploadedFileName));
                al.add(fbfr);
                loadXML(fbfr);
            }
        }finally{
            for(BufferedReader openReader : al){
                try{ openReader.close(); }catch(Exception e)
                { e.printStackTrace();}
            }
    
        }
    }
    
}