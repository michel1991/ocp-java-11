package commonIOStreamOperation.manipulatingInputStreams;
import java.io.*;

class MarkAndReset{
      public void readData(InputStream is) throws IOException{
         System.out.println( (char) is.read() ); // L
         if(is.markSupported()) {
               is.mark(100); // marks up to 100 bytes
              System.out.println( (char) is.read() ); //I
              System.out.println( (char) is.read() ); //O
              is.reset(); // Resets stream to position before I
          }
          System.out.println( (char) is.read() ); // I
          System.out.println( (char) is.read() ); // O
          System.out.println( (char) is.read() ); // N
     } 

     public static void main(String... args) throws IOException{
        BufferedInputStream bis = null;
        try{ 
	    String fullPath = System.getProperty("user.dir") + "/commonIOStreamOperation/manipulatingInputStreams"+ "/markAndResetData.txt";	
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
