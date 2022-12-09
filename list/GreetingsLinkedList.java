package list;
import java.util.*;

public class GreetingsLinkedList {
    /**
    * What is the result of the following statements?
        A. hello
        B. hellohi
        C. hellohiola
        D. hiola
        E. ola
        F. The code does not compile.
        G. An exception is thrown.

      This is a FIFO (first-in, first-out) queue. On line 7, we remove the first element added, which is "hello".
      On line 8, we look at the new first element ("hi") but don’t remove it.
      On lines 9 and 10, we remove each element in turn until no elements are left, printing hi and ola together.
      Note that we don’t use an Iterator to loop through the LinkedList to avoid concurrent modification issues.
      The order in which the elements are stored internally is not part of the API contract.
     */
  static  void removeAndAdd(){
      var greetings = new LinkedList<String>(); // 3:
      greetings.offer("hello"); // 4:
      greetings.offer("hi"); //  5:
      greetings.offer("ola"); //  6:
      greetings.pop(); //  7:
      greetings.peek();  //  8:
      while (greetings.peek() != null) //  9:
          System.out.print(greetings.pop()); //  10:

  }

    public static void main(String... args){
        removeAndAdd();
    }
}