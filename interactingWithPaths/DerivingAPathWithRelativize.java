package interactingWithPaths;
import java.nio.file.*;

class DerivingAPathWithRelativize{
  static void withAbsolutePath(){
     Path path3 = Paths.get("E:\\habitat");
     Path path4 = Paths.get("E:\\sanctuary\\raven\\poe.txt");
     System.out.println(path3.relativize(path4)); // ..\sanctuary\raven\poe.txt
    System.out.println(path4.relativize(path3)); // ..\..\..\habitat
  }

  public static void main(String... args){
     Path path1 = Path.of("fish.txt");
     Path path2 = Path.of("friendly/birds.txt");
     System.out.println(path1.relativize(path2));

    System.out.println(path2.relativize(path1));
  }
}
