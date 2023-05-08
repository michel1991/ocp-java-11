package generics.errors;
 import java.util.*; // 1:

/**
  How many of the following variable declarations compile?
    A. None.
    B. One.
    C. Two.
    D. Three.
    E. Four.
    F. Five.

 Lines 9–13 do not compile because neither the class nor method defines a generic type T.
 The declaration on lines 5–6 does not compile because ? extends RuntimeException
 cannot have a broader type. This leaves us with two declarations that do compile,
 making option C the correct answer.
 Line 4 compiles, since any type of generic list can go in List<?>.
 The declaration on lines 7–8 also
 compiles because ? super RuntimeException does allow a broader exception type.
 */
class ListOfList { // 2: 
     public void create() { //  3: 
         List<?> n = new ArrayList<>(); //  4:    
         List<? extends RuntimeException> o //  5:  
       = new ArrayList<Exception>(); // 6:    
         List<? super RuntimeException> p //  7: 
         = new ArrayList<Exception>(); // 8:  
         List<T> q = new ArrayList<?>(); //  9: 
         List<T extends RuntimeException> r //  10: 
       = new ArrayList<Exception>(); // 11:   
         List<T super RuntimeException> s //   12:
        = new ArrayList<Exception>(); // 13:  
     } } //   14: 

public class ListOfListFindErrors {
    
}