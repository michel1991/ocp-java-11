package commonIOStreamOperation.manipulatingInputStreams;
import java.io.*;

class MarkAndReset{
      public void readData(InputStream is) throws IOException{
         System.out.print( (char) is.read() ); // L
         if(is.markSupported()) {
               is.mark(100); // marks up to 100 bytes
              System.out.print( (char) is.read() ); //I
              System.out.print( (char) is.read() ); //O
              is.reset(); // Resets stream to position before I
          }
          System.out.print( (char) is.read() ); // I
          System.out.print( (char) is.read() ); // O
          System.out.print( (char) is.read() ); // N
     }    
}
