package annotations.meta.type;
import java.lang.annotation.*;

/**
 * Given:
 
   A.
     interface A{    
        @DBField(type="string")
        String name = "";
    }
    Since the target of this annotation is ElementType.FIELD, it can be used on any field including a field of an interface.
    
   B. 
    public class Person{
        @DBField
        String name = "";
    }
    Since the type element does not have a default value, its value must be specified in type="somevalue" format.
    
    C.
       public class Person{
        @DBField(type="string", "")
        String name = "";
    }
    
    D.
      public class Person{
        @DBField(type="string", "", intValue=10)
        String name = "";
    }
    
    Must use elementName=elementValue format for every element while specifying element
    values because you are specifying values for more than one element.
    
    There are two rules that you need to remember while specifying values for annotation elements:
    1. You can omit the element name while specifying a value only when the name of the element
    is value and only when you are specifying just one value. In other words,
    if you are specifying values for more than one element, you need to use the element name i.e.
    in elementName=elementValue format. The order of the elements is not important.
    
    2. If an element expects an array, you can specify the values by enclosing them in { }.
    But if you want to specify an array of length 1, you may omit the { }.
    
    Correct(A)
 */

@Target(ElementType.FIELD)
public @interface DBField {
    public String type();
    public String value() default "";
    public int invalue() default 0;
}

interface A{    
    @DBField(type="string")
    String name = "";
}