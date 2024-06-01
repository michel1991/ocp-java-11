
package security.prevents.denial;
import java.io.*;
import java.nio.file.*;
/**
 Given the following interface:

    interface InputStreamHandler {
        public long read(InputStream in) throws IOException;
    }
    
    and the following code in some other class:
    
    public long getTotal(String file) throws IOException{
        long sum = readFileBuffered(file,
                (InputStream in) -> {
                long current = 0;
                for (;;) {
                    int b = in.read();
                    if (b == -1) {
                        return current;
                    }
                    current += b;
                }
            });
        return sum;
    }
    
    public  long readFileBuffered(String file, InputStreamHandler handler)
                    throws IOException {
        try (final InputStream in = Files.newInputStream(Paths.get(file))) {
            return handler.read(new BufferedInputStream(in));
        }
    }
    
    
    Identify correct statements.
    
    A. This code prevents one category of denial of service attacks.
         This code implements the "Execute Around Method" pattern highlighted in Guideline 1-2 / DOS-2: Release resources in all cases.
    B. This code implements secure coding guidelines for mutability.
    C. This code implements secure coding guidelines for Accessibility and Extensibility.
    D. This code implements secure coding guidelines Data Integrity.
    
    --------------------------
      correct(A)

 */

interface InputStreamHandler {
    public long read(InputStream in) throws IOException;
}

public class TestInputStreamHandler {
    public long getTotal(String file) throws IOException{
        long sum = readFileBuffered(file,
                (InputStream in) -> {
                long current = 0;
                for (;;) {
                    int b = in.read();
                    if (b == -1) {
                        return current;
                    }
                    current += b;
                }
            });
        return sum;
    }
    
    public  long readFileBuffered(String file, InputStreamHandler handler)
            throws IOException {
        try (final InputStream in = Files.newInputStream(Paths.get(file))) {
        return handler.read(new BufferedInputStream(in));
        }
    }
}