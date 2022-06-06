package interactingWithPaths;
import java.nio.file.*;

class ErrorDerivingAPathWithRelativizeAllPathMustBeAbsoluteOrRelative{
  public static void main(String... args){
    Path path1 = Paths.get("/primate/chimpanzee");
    Path path2 = Paths.get("bananas.txt");
    path1.relativize(path2); // IllegalArgumentException
  }

}
