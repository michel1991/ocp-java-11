package commonIOStreamOperation;
import java.io.*;

class ClosingWrappedStreams{
  static void useCloseOnTheTopmostObjectResultIsThreeSeparateClose() throws IOException, FileNotFoundException{
      try ( 
      var fis = new FileOutputStream("zoo-banner.txt"); // Unnecessary
      var bis = new BufferedOutputStream(fis);
      var ois = new ObjectOutputStream(bis)

    ) {
        ois.writeObject("Hello");
     }
    
  }

  static void relyOnObjectOutputStreamToCloseStream() throws IOException, FileNotFoundException {

     try (
            var ois = new ObjectOutputStream(
                  new BufferedOutputStream(
                      new FileOutputStream( "zoo-banner.txt" )
                 )

            )
            
      ) {
          ois.writeObject("Hello");
      }

   }
}
