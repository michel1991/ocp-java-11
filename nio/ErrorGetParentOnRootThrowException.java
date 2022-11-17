package nio;
import java.nio.file.*;
/**
 * Question:  If the current working directory is /reef, then what is the output of the following code?
 *
* The code compiles without issue, so options D and E are incorrect.
* The code will throw an exception at runtime because of the chaining together of methods getRoot().getParent().
* The root path has no parent path, so this snippet will return null, and the operation resolve() will throw a NullPointerException at runtime;
* therefore, option F is correct.
 */
public interface ErrorGetParentOnRootThrowException {
   public static void main(String[] args){
       var u = Paths.get("/reef/../clown/fish").normalize();
       var p = u.getRoot().getParent().resolve("dolphin");
       System.out.println(p.toAbsolutePath());
   }
}