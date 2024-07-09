package generics.choiceAnswers;
import java.util.*;

/**
 The signature of a method in a class is as follows:

    public static <E extends CharSequence> List<? super E> doIt(List<E> nums)
    
    This method is being called in the following code:
    
    result = doIt(in);
    
    Given that String implements CharSequence interface, what should be the reference type of 'in' and 'result' variables?
    
    A.
        ArrayList<String> in;
        List<CharSequence> result;
    
    B. 
        List<String> in;
        List<Object> result;
    
    C. 
        ArrayList<String> in;
        List result;
    
    D. 
        List<CharSequence> in;
        List<CharSequence> result;
        
    E.
        ArrayList<Object> in;
        List<CharSequence> result;
    
    F. None of these.
    
    ----------------
    
    
    The input parameter has been specified as List<E>, where E has to be some class that extends CharSequence.
    So ArrayList<String>, List<String>, or List<CharSequence> are all valid as reference types for 'in'.
    
    The output type of the method has been specified as List<? super E> ,
    which means that it is a List that contains objects of some class that is a super class of E.
    Here, E will be typed to whatever is being used for 'in'. For example, if you declare ArrayList<String> in, E will be String.
    
    The important concept here once the method returns, there is no way to know what is the exact class of objects stored in the returned List.
    So you cannot declare out in a way that ties it to any particular class, not even Object.
    
    Thus, the only way to accomplish this is to either use non-typed reference type, such as:
    List result; or use the same type as the return type mentioned in the method signature i.e. List<? super String>
    (because E will be bound to String in this case.)
    
    Correct(C)
    
 */
public class DoIt {
    public static <E extends CharSequence> List<? super E> doIt(List<E> nums){
        return null;
    }
}