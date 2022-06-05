package interactingWithPaths;
import java.nio.file.*;

class ViewingThePath{
  
  public static void main(String[] args){
      Path path = Paths.get("/land/hippo/harry.happy");
       System.out.println("The Path name is: " +path);
      for (int i = 0; i<path.getNameCount(); i++){
          System.out.println(" Element "+ i + " is: "+ path.getName(i));
      }
   }
}
