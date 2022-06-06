package  interactingWithPaths;
import java.nio.file.*;

class  AccessingPathElementsWith{
  public static void printPathInformation(Path path){
     System.out.println("Filename is: "+ path.getFileName());
     System.out.println(" Root is: " + path.getRoot());
     Path currentParent = path;
     while( (currentParent = currentParent.getParent()) != null ){
        System.out.println(" Current parent is: " + currentParent);
     }
  }

  public static void main(String... args){
     printPathInformation(Path.of("zoo"));
     printPathInformation(Path.of("/zoo/armadillo/shells.txt"));
     printPathInformation(Path.of("./armadillo/../shells.txt"));
  }

}
