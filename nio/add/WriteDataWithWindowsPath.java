package nio.isSame;
import java.nio.file.*;
/**
  consider the following code:
   what will be printed when the method writeData() is executed?
   
   A.  \temp\records\clients false
   B.  temp\records\clients.dat false
   C.  \temp\records\clients.dat false
   D. temp\records\clients.dat true
   E.  clients.dat false
   F. \clients.dat false
   
   Correct(C)
   p2 will be set to \temp\records\clients.dat. Since it starts with \temp and not with temp, the method isValid will return false.

 */
public class WriteDataWithWindowsPath {
    public static boolean isValid(Path p){

        return p.startsWith("temp") && p.endsWith("clients.dat");
    }

    public static void writeData() {
        var p1 = Paths.get("\\temp\\records");
        var p2 = p1.resolve("clients.dat");
        System.out.println(p2+" "+isValid(p2));

    }
}