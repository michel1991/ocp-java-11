package nio.runtime;
import java.io.*;

/**
 *  Assuming the current working directory is /home, then what is the output of the following program?
    A. /home/tricks
    B. /home
    C. tricks
    D. The code does not compile.
    E. The code compiles but prints an exception at runtime.
    F. None of the above.

    The code compiles without issue. Even though tricks would be dropped
    in the normalized path /bag/of/disappear.txt, there is no normalize() call,
    so path.subpath(2,3) returns tricks on line 5.
    On line 6, the call to getName() throws an IllegalArgumentException at runtime.
    Since getName() is zero-indexed and contains only one element,
    the call on line 6 throws an IllegalArgumentException,
    making option E the correct answer.
    If getName(0) had been used instead of getName(1),
    then the program would run without issue and print /home/tricks.
 */
import java.nio.file.*; // 2:
class Magician { // 3:
     public String doTrick(Path path) { //  4:
         return path.subpath(2,3) //   5:
             .getName(1) //  6:
              .toAbsolutePath() // 7:
            .toString(); //  8:
     } //  9:
    public static void main(String... cards) { //   10:
         final Magician m = new Magician(); //   11:
        System.out.print(m.doTrick( // 12:
                Paths.get("/bag/of/tricks/.././disappear.txt"))); //   13:
     } } //   14:
public class MagicianInvalideIndexOfPath {

     public static void main(String... cards) {
         Magician.main(cards);
     }

}