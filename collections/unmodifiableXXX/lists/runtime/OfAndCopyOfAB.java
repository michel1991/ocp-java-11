package collections.unmodifiableXXX.lists.runtime;

import java.util.*;

/**
     What will the following code print when compiled and run?
     
     List<String> list1 = List.of("A", "B");
    List<String> list2 = List.copyOf(list1);
    list1.add("C"); //1
    list2.add("D"); //2
    System.out.println(list1+" "+list2);
    
    A. [A, B] [A, B]
    B. [A, B, C] [A, B]
    C. [A, B, C] [A, B, C, D]
    D. [A, B, C, D] [A, B, C, D]
    E. Line marked //1 will cause an exception at run time.
    F. Both the lines marked //1 and //2 will cause an exception at run time.
    
    -----
    
      
      Unmodifiable collections using of/copyOf and Collections.unmodifiableXXX methods

    java.util.List and java.util.Set have of and copyOf static factory methods that provide a convenient way to create unmodifiable lists/sets.
    
    The of methods accept either an array or multiple individual parameters.
    If you pass it a collection, it will be treated as a regular object i.e. it will return a list/set containing
    the same collection object instead of returning a list/set containing the objects that the passed collection contains.
    
    The copyOf, on the other hand, accepts only a Collection.
    It iterates through the passed Collection and adds all the elements of that Collection in the returned list/set.
    
    Here are a few important points about these methods:
    1. They return unmodifiable copies of the original List/Set.
    Thus, any operation that tries to modify the returned list throws an java.lang.UnsupportedOperationException.
    2. The list/set returned by the of/copyOf methods is completely independent of the original collection.
    Thus, if you modify the original collection after passing it to of/copyOf methods,
    those changes will not be reflected in the list returned by the of/copyOf methods.
    3. They do not support null elements.
    Thus, if your array contains a null and if you try to create a List using List.of, it will throw a NullPointerException.
    
    Collections.unmodifiableXXX methods
    
    java.utils.Collections class also has several variations of unmodifiableXXX
    static methods (such as unmodifiableList(List ), unmodifiableSet(Set ), and unmodifiableMap(Map ) ).
    These method return an unmodifiable view of the underlying collection.
    The fundamental difference between Collections.unmodifiableXXX and List.of/copyOf methods is that Collections.unmodifiableList
    returns a view (instead of a copy) into the underlying list.
    Which means, if you make any changes to the underlying list after creating the view, those changes will be visible in the view.
    Further, Collections.unmodifiableList has no problem with nulls.
    
    The word unmodifiable in unmodifiableXXX method name refers to the fact that you cannot modify the view using a reference to view.
    
      Correct(F)

 */
public class OfAndCopyOfAB {
    public static void main(String... args){
        List<String> list1 = List.of("A", "B");
        List<String> list2 = List.copyOf(list1);
        list1.add("C"); //1
        list2.add("D"); //2
        System.out.println(list1+" "+list2);
    }
}