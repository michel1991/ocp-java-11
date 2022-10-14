package nio;
import java.nio.file.*;

class ExtractPath{
   public static void extractPath(){
  	   
      Path path = Paths.get("/zoo/animals/bear/koala/food.txt");
      System.out.println(" initial path " + path);
      System.out.println(path.subpath(1, 3).getName(1).toAbsolutePath());
   }

   public static void main(String... args){
      extractPath();
   }
}
