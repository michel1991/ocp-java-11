package annotations.errors;
import java.lang.annotation.*; // 1:

/**
 *  How many lines of the following declaration contain a compiler error?
    A. None.
    B. One.
    C. Two.
    D. Three.
    E. Four.
    F. Five.
    
    Line 4 is missing a type for the element. If a compatible type, such as int,
    was added before alert(), it would compile.
    An annotation element type must be a primitive type,
    a String, a Class, an enum, another annotation,
    or an array of any of these types.
    For this reason, line 6 compiles, and line 7 does not.
    Since lines 4 and 7 are the only lines that do not compile,
    option C is correct.
    Notice that lines 5 and 8 use a lot of extra modifiers,
    like public and abstract, that are usually applied implicitly.

 */
 @Inherited // 2:
 @interface Panic { // 3: 
     public abstract  alert() default 10; //  4:  
    public final static int alarm_volume = 10; //    5: 
    String[] type() default {"test"}; //   6: 
    Long range(); //    7: 
    abstract boolean silent(); //   8:
 } //  9:

public class PanicFindErrors {
    
}