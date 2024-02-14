package collections.lists.remove;
import java.util.*;
import java.util.function.*;

public class StringThatLengthIsLessThanTen {
    /**
       What is the result of the following?
        A. 1
        B. 2
        C. 3
        D. None of the above

        On a stream, the filter() method only keeps values matching the lambda.
        The removeIf() does the reverse on a Collection and keeps
        the elements that do not match. In this case, that is Austin and Boston, so option B is correct.
     */
    static void removeItemStringThatLengthIsLessThanTen(){
        System.out.println("begin  removeItemStringThatLengthIsLessThanTen");
        var list = new ArrayList<String>();
        list.add("Austin");
        list.add("Boston");
        list.add("San Francisco");

        list.removeIf(a -> a.length() > 10);
        System.out.println(list.size());
        System.out.println("end  removeItemStringThatLengthIsLessThanTen");

    }

    public static void main(String... args){
        removeItemStringThatLengthIsLessThanTen();
    }
}