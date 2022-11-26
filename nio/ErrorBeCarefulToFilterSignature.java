package nio;
import java.nio.file.*;
import java.io.*;

public class ErrorBeCarefulToFilterSignature {

    /**
    * Assume that the directory /animals exists and is empty. What is the result of executing the following code?
    * The filter() operation applied to a Stream<Path> takes only one parameter, not two, so the code does not compile, and option C is correct.
    * If the code was rewritten to use the Files.
    * find() method with the BiPredicate as input (along with a maxDepth value), then the output would be option B, Has Sub, since the directory is given to be empty.
    * For fun, we reversed the expected output of the ternary operation.
     */
    static void badFilterSignature() throws IOException{
        var rootPath = System.getProperty("user.dir");
        Path path = Path.of(rootPath, "nio","/animals");
        try (var z = Files.walk(path)) {
            boolean b = z
                        .filter((p,a) -> a.isDirectory() && !path.equals(p)) // x
                        .findFirst().isPresent();  // y
            System.out.println(b);
            System.out.println(b ? "No Sub": "Has Sub");
        }
    }

    public static void main(String... args) throws IOException{
        badFilterSignature();
    }

}