package  introducingNIO2;
import java.nio.*;
import java.net.*;
import java.nio.file.*;

class  ObtainingAPathWithaURIClass{
  static void obtaining() throws URISyntaxException{
     URI a = new URI("file://icecream.txt");
     Path b = Path.of(a);
     Path c = Paths.get(a);
     URI d = b.toUri();
  }
}
