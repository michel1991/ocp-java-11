package collections.protectContent;
import java.util.*;
public class GetList {
    /**
     * Given:
     *
     * What can be inserted in the above code?
     *
       A. return new ArrayList<Integer>();
       B. return new ArrayList<Number>();
       C. return new ArrayList<Object>();
       D. return new ArrayList();
       E. return new List<Number>();
       F. List cannot be instantiated because is an interface.

      A method can only return an object of a type that satisfies the "is-a" test with respect to the
      type specified as the return type of the method. "? extends Number" means "a type that extends Number".
      Integer and Number classes satisfy this condition. Object does not.

       It is ok to return a non-typed ArrayList because, ultimately, all type information is removed from the generated class anyway.
       (Correct A, B, D)
     */
    public List<? extends Number> getList(){
        //*INSERT CODE HERE* // //
        return new ArrayList();
    }
    
}