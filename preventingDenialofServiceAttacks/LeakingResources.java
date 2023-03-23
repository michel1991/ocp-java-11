package preventingDenialofServiceAttacks;
import java.nio.file.*;
import java.util.stream.*;
import java.io.*;

public class LeakingResources {
    /**
     * Risk of Leaking resource
     */
    public long countLines(Path path) throws IOException  {
        return Files.lines(path).count();
    }

    /**
     * Correction

       Le hacker Harry aime cette méthode.
       Il peut l'appeler dans une boucle.
       Comme la méthode ouvre une ressource du système de fichiers et ne la ferme jamais,
       il y a une fuite de ressources (resource leak).
       Après que le pirate Harry ait appelé la méthode suffisamment de fois,
       le programme s'arrête parce qu'il n'y a plus de gestionnaires
       de fichiers disponibles (because there are no more file handles available).

     */
    public long avoidCountLines(Path path) throws IOException  {
        try (var stream = Files.lines(path)) {
            return stream.count();   }
    }
}