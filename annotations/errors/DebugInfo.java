
package annotations.errors;
import java.lang.annotation.*;

/**
  Given:
 
   Which line(s) will cause compilation failure?
   
   A.
      //1
      
   B. //2
       ----
        @Target is not a repeatable annotation, which means, it can be used only once
        
   C. //3
   
   D. //4
   
   E. //5
     ----------
    default="" is not the correct way to specify a default value.
    The correct ways are:  
    String name() default"";
    String[] params() default { "a", "b" };
    int value() default 10;
    
   F. //6
     -------------------
       You cannot have just about any type as an element of an annotation. The only types that are supported are:
        1. A primitive type
        2. String
        3. Class or an invocation of Class (not important for the OCP exam)
        4. An enum type (not important for the OCP exam)
        5. An annotation type (not important for the OCP exam)
        6. An array type whose component type is one of the preceding types.
        
        Thus, String[][], Integer, and Date. are invalid.
   
    G.
    
     ------------
       Correct(B, E,F, G)
 */
@Target({ElementType.LOCAL_VARIABLE, ElementType.FIELD, ElementType.METHOD}) //1
@Target({ElementType.TYPE})//2
@Retention(RetentionPolicy.RUNTIME)//3
public @interface DebugInfo { //4
    String name() default=""; //5
    String[][] params();//6
    java.util.Date entryTime();//7
}

