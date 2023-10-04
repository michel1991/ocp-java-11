package annotations.errors.findErrors;
import java.lang.annotation.*;
import java.util.*;

/**
 *  How many lines of the following declarations contain a compiler error?
   A. None
    B. One
    C. Two
    D. Three
    E. Four
    F. Five
    
    Lines 3 and 8 do not compile because annotation elements must bepublic,
    implicitly or explicitly. Line 8 also does not compile because continue is a keyword in Java.
    Line 5 does not compile. While arrays are permitted as element types,
    collections like List are not. Line 6 does not compile
    because annotation elements cannot be marked final, as they are implicitly abstract.
    For these reasons, option E is correct. Line 4 compiles because an annotation can declare
    another annotation as the element type. Line 7 also compiles.
    While the public and abstract modifiers aren’t required for an annotation element, they can be specified.
 */
@interface Sword {} // 1:
public @interface Zelda { // 2: 
    private String game(); //    3: 
    Sword sword(); //  4: 
    java.util.List<Integer> gems; //  5: 
    final boolean hasBossKey(); //   6: 
    public abstract int level() default 99; //   7: 
    protected boolean continue(); //   8:
} //   9: