package annotations.meta.retentionPolicy;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
  Given:

    @Retention(RetentionPolicy.RUNTIME)
    public @interface DebugInfo {
        String value() default "";
        String[] params();
        String date();
        int depth() default 10;
    }
    
    Which of the following options correctly uses the above annotation?
    A.
         @DebugInfo(date = "2019", params = "index")
            void applyLogic(int index){
        }
        ------
        The date element is defined as String. So, it doesn't really have to be a date. Any string value will be valid.
        params is defined as a String[].
        So, you can either use a single string such as used
        in this option or a String array such as params={"index"} or params={"index1", "whatever"} or even params={}.
        
        value and depth elements have default values so, the value for these elements can be omitted.
        
    B.
       @DebugInfo(date = "2019-1-1", params = { null })
            void applyLogic(int index){
        }
       ----
        You cannot set an annotation element (or its values, if it is an array) to null.

    C.
       @DebugInfo(depth = 10, date = "01/01/2019",
        params = {"index"}, value="applyLogic")    
        static final String s = null;
        ---------
        1. The order of values for the elements is not important.
        2. Since @Target annotation is not specified in the definition of @DebugInfo,
        it will be assumed that @DebugInfo is applicable to all places where annotations can be used
        
    D.
       @DebugInfo({"index"}, "01/01/2019")    
            void applyLogic(int index){
        }
        -----
        Names of the elements cannot be omitted when there are more than one values.
        Even when there is only one value, the name of the element can be omitted only if the name of the element is value.

    E.
      @DebugInfo("value", params={"index"}, date="01/01/2019")    
      void applyLogic(int index){
      }
        You cannot omit the name of any element, if you are specifying values for more than one element.
        So, you must write value="value" instead of just "value".
    
    Correct(A,C)
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface DebugInfo {
    String value() default "";
    String[] params();
    String date();
    int depth() default 10;
}