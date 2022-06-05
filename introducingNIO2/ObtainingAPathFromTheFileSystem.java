package introducingNIO2;
import java.nio.*;
import java.nio.file.*;
import java.net.*;

class ObtainingAPathFromTheFileSystem{
  void obtaining(){
       Path path3 = FileSystems.getDefault().getPath("/home/users");
   }

 void connectToRemoteFileSystems() throws URISyntaxException{
     FileSystem fileSystem = FileSystems.getFileSystem(
         new URI("http://www.selikoff.net")
     );

     Path path = fileSystem.getPath("duck.txt");
  }

}
