package interactingWithPaths;
import java.nio.file.*;

class ErrorDerivingAPathWithRelativizeAllPathMustBeInSameDrive{
  public static void main(String... args){
    Path path1 = Paths.get("c:\\primate\\chimpanzee");
    Path path2 = Paths.get("d:\\storage\\bananas.txt");
    path1.relativize(path2); // IllegalArgumentException
  }

}
