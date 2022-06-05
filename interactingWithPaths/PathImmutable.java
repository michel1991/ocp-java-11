package interactingWithPaths;
import java.nio.file.*;

class PathImmutable{
  
  public static void main(String[] args){
   Path p = Path.of("whale");
   p.resolve("krill");
   System.out.println(p);
  }
}
