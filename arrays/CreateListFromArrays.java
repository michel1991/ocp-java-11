package arrays;
import java.util.*;
public class CreateListFromArrays {

    /**
     *  Which of the following fill in the blank to print out true? (Choose two.)
        A. Arrays.asList(array)
        B. Arrays.asList("Natural History, Science")
        C. List.of(array)
        D. List.of("Natural History", "Science")
        E. new ArrayList˂String˃("Natural History", "Science")
        F. new List˂String˃("Natural History", "Science")

        Options E and F are incorrect because they do not compile.
        List is an interface and does not have a constructor.
        ArrayList has a constructor but not one that takes individual elements as parameters.
        Options C and D are incorrect because List.of() creates an immutable list.
        Trying to change one of its values causes an exception at runtime.
        Options A and B are correct. Since we are creating the list from an array,
        it is a fixed size. We are allowed to change elements.
        When successfully completing this code, museums is [Art, Science] for both solutions.
     */
    static void firstExample(){
        String[] array = {"Natural History", "Science"};
        var museums = Arrays.asList("Natural History, Science"); // _________________
        museums.set(0, "Art");
        System.out.println(museums.contains("Art"));
    }

    public static void main(String... args){

    }

}