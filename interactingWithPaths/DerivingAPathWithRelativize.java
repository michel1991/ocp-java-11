package interactingWithPaths;
import java.nio.file.*;

class DerivingAPathWithRelativize{
  public static void main(String... args){
     Path path1 = Path.of("fish.txt");
     Path path2 = Path.of("friendly/birds.txt");
     System.out.println(path1.relativize(path2));

    System.out.println(path2.relativize(path1));
  }
}
