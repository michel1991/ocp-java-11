package generics.errors;
import java.util.*;
import java.io.*;

public class ListGetExceptionsUpperGenerics {

    /**
     * Which of the following fills in the blank so this code compiles?
     *  A. ?
        B. ? extends RuntimeException
        C. ? super RuntimeException
        D. None of the above

        Option A is incorrect because coll could be any type,
        which doesn’t necessarily allow exceptions to be added.
        Option B is incorrect because neither add() method compiles.
        We could have Collection<IllegalStateException> as a parameter.
        That would not allow either type to be added.
        Finally, option C is incorrect as the second add() method does not compile because broader
        types than the generic allows are a problem when adding to coll.
        Therefore, option D is the answer.

        My explication, i add ?super RuntimeException means that list can be
        (List<RuntimeException>, List<Exception>, List<Object>), so any instance
        must be insert into all list above, but instance of exception cannot be insert
        into List<RuntimeException>. Because it is inheritance be carefull
     */
    public static void getExceptions(Collection<? super RuntimeException> coll) { // __________
        coll.add(new RuntimeException());
        coll.add(new Exception());

    }

    public static void main(String... args){
    }

}