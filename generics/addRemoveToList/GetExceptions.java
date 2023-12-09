package generics.addRemoveToList;
import java.util.*;
import java.io.*;

public class GetExceptions {
    /**
       Which of the following fills in the blank so this code compiles?
        A. ?
        B. ? extends Exception
        C. ? super Exception
        D. None of the above

        Option C is correct because all the types
        being added are of type Exception or direct subclasses.

     */
    public static void getExceptions(Collection<? super Exception> coll) { // getExceptions(Collection<__________> coll)
        coll.add(new RuntimeException());
        coll.add(new Exception());
    }
    
    public static void main(String... args){
        List<Exception> withException = new ArrayList<>();
        getExceptions(withException);
        List<Object> withObjects = new ArrayList<>();
        getExceptions(withObjects);
    }
}