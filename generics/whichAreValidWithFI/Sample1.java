package generics.whichAreValidWithFI;

import java.util.*;
import java.util.function.*;

/**
    Which of the following are valid?

    (Assume the method bodies are valid.)
    
    Note: The topic of generics is not mentioned in exam objectives.
    However, we have seen candidates getting questions that expect basic idea of generics.
    It is possible that such questions are unscored (i.e. your answer to these questions are not considered while computing your final score.)
    
    A. BiFunction<Integer, Integer, Double> bf = (a, b)->a/b;
        An integral mathematical operation (i.e. when both the operands of a mathematical operation such as multiplication or division,
        are integral values) then the result will be an int.
        Therefore, here, a/b will result in an int. An int cannot be boxed into a Double. Therefore, the given statement will not compile.
        The following are valid though:
        BiFunction<Integer, Integer, Double> bf = (a, b)->(double)a/b;
        BiFunction<Integer, Integer, Integer> bf = (a, b)->a/b;
       
    B.  public BiFunction<Integer, String, Double> getBF(){ ...  }
    
    C. class Transformer<T>{
          public BiFunction<T, T, T> getMethod(){ ... }
       }
       The class declares a type variable T. The BiFunction uses the same type variable. This is ok.
    
        But note that if getMethod were a static method, it would not compile.
        Because the type variable T is available only for instances of Transformer.
        You type the instances of class Transformer, not the Transformer class itself. For example:
        Transformer<String> tS;
        Transformer<Integer> tI;
        
        Here, the Transformer instance referred to by tS is typed to String and the Transformer instance referred to by tI is typed to Integer.
        
    D. BiFunction<int, int, int> bf = (a, b)->a/b;
      You can't use primitive types as type specification
      
    E. <A, B, C> BiFunction<A, B, C> predicate(Function<A, B> f){ ... }
    
    ----------------------------------------------------------------------------------------------------------------------
    A BiFunction is similar to a Function. A Function takes an argument of one type and returns the result of another type.
    A BiFunction takes two arguments of two types and returns the result of a third type.
    
    Note that the type parameters need not necessarily be different.
    Having three different type parameter names ( i.e. A B C or T U V)
    just means that the type of the two arguments and the type of the result can all be different.
    It is ok to use the same type parameter for arguments and/or result.
    Having same type parameters is just a special case of three type parameters where all three type parameters are the same.
    
    Correct(B,C,E)

 */

class Transformer<T>{
    public BiFunction<T, T, T> getMethod(){
        return null;
    }
}
public class Sample1 {
    public BiFunction<Integer, String, Double> getBF(){
         return null;
    }
    
    <A, B, C> BiFunction<A, B, C> predicate(Function<A, B> f){
        return null;
    }
}