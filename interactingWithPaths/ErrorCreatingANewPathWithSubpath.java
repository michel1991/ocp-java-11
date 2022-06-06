package interactingWithPaths;
import java.nio.file.*;

class ErrorCreatingANewPathWithSubpath{
   public static void main(String... args){
      Path p = Paths.get("/mammal/omnivore/raccoon.image");
      var q = p.subpath(0, 4); // IllegalArgumentException
       var x = p.subpath(1, 1); // IllegalArgumentException
   }
}
