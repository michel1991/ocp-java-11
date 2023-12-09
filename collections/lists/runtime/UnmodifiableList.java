package collections.lists.runtime;

import java.util.*;

public class UnmodifiableList {
    /**
      What will the following code print when compiled and run?
       A. It will not compile.
       B. An exception will be thrown at run time.
            The of and copyOf methods do not support null elements. Thus, a NullPointerException will be thrown at line marked //2.
       C. [1, null, 3] [1, 2, 3]
       D. [1, null, 3] [1, null, 3]
       E. [1, 2, 3] [1, 2, 3]
       (Correct B)
       
Unmodifiable collections using of/copyOf and Collections.unmodifiableXXX methods
 java.util.List and java.util.Set have of and copyOf static factory methods that provide a convenient way to create unmodifiable lists/sets.

    The of methods accept either an array or multiple individual parameters.
    If you pass it a collection, it will be treated as a regular object i.e.
    it will return a list/set containing the same collection object instead of returning a
    list/set containing the objects that the passed collection contains.

The copyOf, on the other hand, accepts only a Collection. It iterates through the
passed Collection and adds all the elements of that Collection in the returned list/set.

Here are a few important points about these methods:
1. They return unmodifiable copies of the original List/Set.
Thus, any operation that tries to modify the returned list throws an java.lang.UnsupportedOperationException.
2. The list/set returned by the of/copyOf methods is completely independent
of the original collection. Thus, if you modify the original collection after passing
it to of/copyOf methods, those changes will not be reflected in the list returned by the of/copyOf methods.
3. They do not support null elements. Thus, if your array contains a null and if you
try to create a List using List.of, it will throw a NullPointerException.

Collections.unmodifiableXXX methods
java.utils.Collections class also has several variations of unmodifiableXXX
static methods (such as unmodifiableList(List ), unmodifiableSet(Set ), and unmodifiableMap(Map ) ).
These method return an unmodifiable view of the underlying collection. The fundamental difference
between Collections.unmodifiableXXX and List.of/copyOf methods is that Collections.unmodifiableList
returns a view (instead of a copy) into the underlying list. Which means, if you make any changes
to the underlying list after creating the view, those changes will be visible in the view. Further,
Collections.unmodifiableList has no problem with nulls.

The word unmodifiable in unmodifiableXXX method name refers to the fact
that you cannot modify the view using a reference to view.
Correct (B)

     */
    public static void main(String... args){
        var numA = new Integer[]{1, null, 3}; //1
        var list1 = List.of(numA); //2
        var list2 = Collections.unmodifiableList(list1); //3
        numA[1] = 2; //4
        System.out.println(list1+" "+list2);
    }
}