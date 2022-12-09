package list;
import java.util.*;

/**
* What is true of the following code?
*   A. There is a compiler error on line 4.
    B. There is a compiler error on line 6.
    C. Values can be added to exceptions.
    D. Values can be added to names.
    E. None of the above.

  The code compiles.
  Line 4 uses an unbounded wildcard, which means that we cannot add any objects to the list, making option D incorrect.
  Line 6 infers the type to be Object based on the diamond operator. Any subclass of Object can be added to exceptions, making option C correct.
 */
class School { // 2:
    private List<Object> exceptions; //  3:
    private List<?> names = new ArrayList<Object>(); //  4:
    public School() { //   5:
        exceptions = new LinkedList<>(); //  6:
    } //  7:
} //  8:

public class SchoolListImutableAndMutable {

}