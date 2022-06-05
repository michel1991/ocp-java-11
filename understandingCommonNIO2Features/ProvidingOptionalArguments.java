package understandingCommonNIO2Features;
import java.nio.file.*;

class ProvidingOptionalArguments{
  void sample(){
      Path path = Paths.get("schedule.xml");
      boolean exists = Files.exists(path, LinkOption.NOFOLLOW_LINKS);
   }

   void copy(Path source, Path target) throws IOException{
     Files.move(
       source, 
       target,
       LinkOption.NOFOLLOW_LINKS,
       StandardCopyOption.ATOMIC_MOVE
      );
  
  }

}
