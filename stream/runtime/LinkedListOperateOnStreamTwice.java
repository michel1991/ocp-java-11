package stream.runtime;

import java.util.*;
import java.util.stream.*;

public class LinkedListOperateOnStreamTwice {

    /**
     * What is the result of executing the following?
        A. The code runs without exception and prints two lines.
        B. The code runs without exception and prints four lines.
        C. The code does not compile due to line w.
        D. The code does not compile due to another line.
        E. The code compiles but throws an exception at runtime.

        Since no generic type is specified, list is a LinkedList˂Object˃.
        Line w compiles because no generic type is specified.
        However, Java only allows you to operate on a stream once.
        The final line of code throws an IllegalStateException because
        the stream has already been used up, making option D correct.
     */
    static void addItem(){
        var list = new LinkedList<>();
        list.add("Archie");
        list.add("X-Men");
        Stream s = list.stream();  // line w
        s.forEach(System.out::println);
        s.forEach(System.out::println);

    }

    public static void main(String... args){
        addItem();
    }
}