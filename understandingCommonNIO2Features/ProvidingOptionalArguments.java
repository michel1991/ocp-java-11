package understandingCommonNIO2Features;
import java.nio.file.*;

class ProvidingOptionalArguments{
  void sample(){
      Path path = Paths.get("schedule.xml");
      boolean exists = Files.exists(path, LinkOption.NOFOLLOW_LINKS);
   }

}
