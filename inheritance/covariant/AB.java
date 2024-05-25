package inheritance.covariant;
import java.util.*;

/**
   class A{
    public List<Number> getList(){
            //valid code
    };
   }
     class B extends A{
        @Override
        *INSERT CODE HERE*
                //valid code
        };
    }   
 */
class A{
    public List<Number> getList(){
            //valid code
        return null;
    };
}
class B extends A{
    @Override
    public ArrayList<Number> getList(){
        return null;
    };
}

/**
   A.  public List<? extends Integer> getList(){
   B. public List<? super Integer> getList(){
   C.  public ArrayList<? extends Number> getList(){
   D.  public ArrayList<? super Number> getList(){
   E. public ArrayList<Number> getList(){
   
   -------------------
   Rule of Covariant Returns
    An overriding method (i.e. a sub class's method) is allowed to return a sub-type of the type returned
    by the overridden method (i.e. super class's method).
    
    So, first check whether the return type of the overriding method is a subtype.
    For example, if the overridden method returns List, the overriding method can return ArrayList but not Object.
    
    Next, you need to check the type specification of generic types. This is a bit complicated.
    To determine this, you must remember the following hierarchy of subtypes.
    Assuming that S is a sub type of T and <<< means "is a subtype of", here are the two hierarchies:
    
    Hierarchy 1 : A<S> <<< A<? extends S> <<< A<? extends T>
    Example: Since Integer is a subtype of Number, List<Integer> is a subtype of List<? extends Integer> and List<? extends Integer>
    is a subtype of List<? extends Number>.
    Thus, if an overridden method returns List<? extends Integer>, the overriding method can return List<Integer>
    but not List<Number> or List<? extends Number>.
    
    
    Hierarchy 2 : A<T> <<< A<? super T> <<< A<? super S>
    Example: List<Number> is a subtype of List<? super Number> and List<? super Number> is a subtype of List<? super Integer>
    Thus, if an overridden method returns List<? super Number>, the overriding method can return List<Number> but not List<Integer>
    or List<? super Integer>.
    
    
    It is important to understand that List<Integer> is not a subtype of List<Number> even though Integer is a subtype of Number.
   Correct(E)

 */
public class AB {
    
}