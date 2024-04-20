package security.guidelines;
import java.io.*;
/**
 * Which secure programming guideline does the following code violate?
  
   A. It exposes sensitive information by logging confidential data.
    Guideline 2-2 / CONFIDENTIAL-2: Do not log highly sensitive information
    Some information, such as Social Security numbers (SSNs) and passwords, is highly sensitive.
    This information should not be kept for longer than necessary nor where it may be seen, even by administrators.
    For instance, it should not be sent to log files and its presence should not be detectable through searches.
   
    B.  It exposes sensitive application specific information contained in exception message.
    Dumping exception messages without purging sensitive information such as File paths violates security guidelines for protecting confidential data.
    Guideline 2-1 / CONFIDENTIAL-1: Purge sensitive information from exceptions
   
    C. It affects application stability by not closing file handle properly.
    D. It violates input validation guidelines by not validating data and file arguments.
    E. It violates exception throwing guideline by throwing a broad exception.
     Although throwing more specific exceptions in the throws clause is generally preferred, it mostly depends on application design.
     
     Correct(A, B, D)
 */
public class SaveUserCredentials {
    public void saveUserCredentials(String data, String file) throws Exception {
            FileWriter fw = null;
            try{
                fw = new FileWriter(file);
                fw.write(data);
                fw.close();
            }catch(Exception e){
                System.err.println("Unable to save user data "+data+" to "+file);
                e.printStackTrace();
                throw e;
            }finally{
                if(fw != null) fw.close();
            }
        }
}