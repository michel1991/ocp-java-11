package commonIOStreamOperation.manipulatingInputStreams;
import java.io.*;

class Skip{
      // Example of input TIGERS
      public void readData(InputStream is) throws IOException{
         System.out.print( (char) is.read() ); // T
         is.skip(2); // Skips I and G
         is.read(); // Reads E but doesn't output it
          System.out.print( (char) is.read() ); // R
          System.out.print( (char) is.read() ); // S

     }

     public static void main(String... args) throws IOException{


         BufferedInputStream bis = null;
        try{ 
            String fullPath = System.getProperty("user.dir") + "/commonIOStreamOperation/manipulatingInputStreams"+ "/skipData.txt";    
            File file = new File(fullPath);
            
             bis = new BufferedInputStream(new FileInputStream( file ));
             MarkAndReset sample = new MarkAndReset();
             sample.readData(bis);
        } catch(IOException ex){
         ex.printStackTrace();
        } finally{
                if( bis != null ){
                   bis.close();
                }

        }
     }
}
