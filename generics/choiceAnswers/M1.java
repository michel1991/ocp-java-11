package generics.choiceAnswers;
import java.util.*;

/**
   Replace XXX with a declaration such that the following code will compile without any error or warning.

    public void m1(XXX list)
    {
       Number n = list.get(0);
    }
    
    A. List<? super Number>
       ----
        Read it aloud like this: A List containing instances of Number or its super class(es).
        Thus, this will allow you to do list.add(new Integer(10));
        because Integer can be assigned to a variable of type Number or its super class,
        but it will not allow you to retrieve anything other than Object: Object obj = list.get(i);
        because the compiler doesn't know the exact class of objects contained by list.
        
    B.  List<?>
        ------
        This is same as List<? extends Object>. Read it aloud like this: A List containing instances of some class that extends Object class.
        Thus, this will not allow you to add anything to it because the compiler doesn't know the exact class of objects contained by the list.
        So, it cannot check whether whatever you are adding is eligible to be added to the list or not.
        Further, this will only allow you to do this: Object o = list.get(index);
         because all the compiler knows is that this list contains objects.
         
   C. List<? extends Number>
    Read it aloud like this: A List containing instances of Number or its subclass(es).
     This will allow you to retrieve Number objects because the compiler knows that this list contains objects
     that can be assigned to a variable of class Number.
     However, you cannot add any object to the list because the compiler doesn't know
     the exact class of objects contained by the list so it cannot check whether whatever you are adding is eligible to be added to the list or not.
     
    D. List<Number extends ?>
         Bad syntax.
    E. List<Number super ?>
        Bad syntax.
        
       Correct(C)

 */
public class M1 {
    public void m1(List<? extends Number> list)
    {
        Number n = list.get(0);
    }
}