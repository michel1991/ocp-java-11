package interactingWithPaths;
import java.nio.file.*;

class CleaningUpAPathWithNormalize{
   public static void main(String... args){
     var p1 = Path.of("./armadillo/../shells.txt");
     System.out.println(p1.normalize());  // shells.txt

     var p2 = Path.of("/cats/../pather/food");
     System.out.println(p2.normalize());  // /pather/food

     var p3 = Path.of("../../fish.txt");
     System.out.println(p3.normalize());  // ../../fish.txt
  }
}
