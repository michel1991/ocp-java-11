package inheritance.withGenerics.override;
import java.util.*;


/**
 Given:

        class A{
            public List<? extends Number> getList(){
                    //valid code
            };
        }
        class B extends A{
            @Override
            *INSERT CODE HERE*
                    //valid code
            };
    }
    
    What can be inserted in the above code?
    
    A.
      public List<? extends Integer> getList(){
        ----
        Since A<? extends S> is a subtype of A<? extends T>, List<? extends Integer> is a subtype of List<? extends Number>.
        
    B. public List<? super Integer> getList(){

    C. public ArrayList<? extends Number> getList(){

    D.
      public ArrayList<? extends Integer> getList(){
      ---
        Since A<? extends S> is a subtype of A<? extends T>, List<? extends Integer> is a subtype of List<? extends Number>
        
    E. public ArrayList<Integer> getList(){
        Since List<Integer> is a subtype of List<? extends Integer> and  List<? extends Integer>  is a subtype of
         List<? extends Number>, this means List<Integer> is a subtype of List<? extends Number>.

    
   ----------
   Rule of Covariant Returns
    An overriding method (i.e. a sub class's method) is allowed to return a sub-type of the type returned by the overridden method
    (i.e. super class's method).
    
    So, first check whether the return type of the overriding method is a subtype.
    For example, if the overridden method returns List, the overriding method can return ArrayList but not Object.
    
    Next, you need to check the type specification of generic types. This is a bit complicated.
    To determine this, you must remember the following hierarchy of subtypes.
    Assuming that S is a sub type of T and <<< means "is a subtype of", here are the two hierarchies:
    
    Hierarchy 1 : A<S> <<< A<? extends S> <<< A<? extends T>
    Example: Since Integer is a subtype of Number, List<Integer> is a subtype of List<? extends Integer>
    and List<? extends Integer> is a subtype of List<? extends Number>.
    Thus, if an overridden method returns List<? extends Integer>, the overriding method
    can return List<Integer> but not List<Number> or List<? extends Number>.
    
    
    Hierarchy 2 : A<T> <<< A<? super T> <<< A<? super S>
    Example: List<Number> is a subtype of List<? super Number> and List<? super Number> is a subtype of List<? super Integer>
    Thus, if an overridden method returns List<? super Number>, the overriding method
    can return List<Number> but not List<Integer> or List<? super Integer>.
    
    
    It is important to understand that List<Integer> is not a subtype of List<Number> even though Integer is a subtype of Number.
    Correct(A, C, D, E, F)
    
 */

class A{
    public List<? extends Number> getList(){
            //valid code
        return null;
    };
}
class B extends A{
    @Override
    public List<? extends Integer> getList(){ //*INSERT CODE HERE*
            //valid code
        return null;
    };
}

public class BA {
    
}