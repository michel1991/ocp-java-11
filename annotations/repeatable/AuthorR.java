package annotations.repeatable;
import java.lang.annotation.*;
/**
 *  Given:
 *
 * Identify correct usages of the above annotations.


 */

 @interface Authors{ // correct public
    Author[] value();
}
@Repeatable(Authors.class)
@interface Author { // correct public
    int id() default 0;
    String value();
}

public class AuthorR{
    
    /**
      A. 
        @Author(1, "bob")
            @Author(2, "alice")
            public class Sample{
        }
        Must use name=value format for element values because more than one values are being specified.
     */
    
    /**
     * B. 
     */
    @Authors(@Author("bob"))
        void someMethod(int index){
    }
    //To make it easy to repeat annotations, Java does not require you to use the container annotation.
    // You can just write @Author("bob") but, internally, Java converts it to @Authors(@Author("bob")).
    
    /**
       C. 
        @Authors(@Author("bob"))
        @Authors(@Author("alice"))
        void someMethod(int index){
        }
        The @Author annotation is repeatable, @Authors is not!

   */
    
    /**
     * D.  (correct)
     */
    @Author("bob")
    @Authors(@Author("alice"))
        void someMethodD(int index){ // correct someMethod
    }
    
    /**
     * E.
         @Author("bob")
         @Author(1)
         void someMethod(int index){
        }
        The two annotations are different. Their values are not additive.
        So, while @Author("bob") is valid @Author(1) is not because it does not include a value for the value element.

     */
    
    /**
       F
        @Author("bob")
        @Author(id=1, value=null)
           void someMethod(int index){
        }
        @Author(id=1, value=null) is invalid because you cannot set an element value to null. The value must be a constant non-null value.
     */
    
    
}



