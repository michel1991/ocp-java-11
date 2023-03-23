package preventingDenialofServiceAttacks;
import java.nio.file.*;
import java.util.stream.*;
import java.io.*;

public class ReadingVeryLargeResources {
    public void transform(Path in, Path out) throws IOException  {
        var list = Files.readAllLines(in);
        list.removeIf(s -> s.trim().isBlank());
        Files.write(out, list);
    }

}