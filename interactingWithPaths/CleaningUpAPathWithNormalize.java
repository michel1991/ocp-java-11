package interactingWithPaths;
import java.nio.file.*;

class CleaningUpAPathWithNormalize{

   static void compareEquivalentPath(){
     var p1 =  Paths.get("/pony/../weather.txt");
     var p2 =  Paths.get("/weather.txt");
     System.out.println(p1.equals(p2));
     System.out.println(p1.normalize().equals(p2.normalize()));
   }
   public static void main(String... args){
     var p1 = Path.of("./armadillo/../shells.txt");
     System.out.println(p1.normalize());  // shells.txt

     var p2 = Path.of("/cats/../pather/food");
     System.out.println(p2.normalize());  // /pather/food

     var p3 = Path.of("../../fish.txt");
     System.out.println(p3.normalize());  // ../../fish.txt
     System.out.println();
     System.out.println("compare equivalent path ");
     compareEquivalentPath();
  }
}
