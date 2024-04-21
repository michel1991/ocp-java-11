package collections.sorts;
import java.util.*;

public class AscendingUpperCase {
    /**
      What is the output of the following code?

        A. [leo, Olivia]
        B. [Olivia, leo]
        C. The code does not compile because of line X.
        D. The code does not compile for another reason.
        E. A runtime exception is thrown.

        This code has a double negative.
        The code c2.compareTo(c1) sorts in descending order.
        However,the negative sign before it switches to ascending order.
        Since uppercase sorts before lowercase, option B is correct.
     */
    public static void main(String... args){
        List<String> cats = new ArrayList<>();
        cats.add("leo");
        cats.add("Olivia");

        cats.sort((c1, c2) -> -c2.compareTo(c1)); // line X
        System.out.println(cats);
    }
}