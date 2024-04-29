package annotations.meta.type.implicit;
import java.lang.annotation.*;

/**
 Given:

    public class Account {
    
        @JSONField(name="acctid")
        private String id;
    
        @JSONField
        private String name;
    
        @JSONField(name="address")
        public String getAddress(){
            //valid code
        }
        //other valid code not shown
    }
    
    Which of the following would be valid definitions of JSONField annotation?
    
    A.
       @Retention(RetentionPolicy.RUNTIME)
        @Target(ElementType.FIELD)
        public @interface JSONField {
            public String name() default "";
        }
        Since the given code uses the annotation on a field as well as a method,
        the JSONField annotation definition must include both ElementType.FIELD and ElementType.METHOD.
        (or leave the @Target annotation altogether, which implies that it can be used anywhere.)
    
    B.
       @Retention(RetentionPolicy.RUNTIME)
        @Target({ElementType.FIELD, ElementType.METHOD})
        public @interface JSONField {
            public String name();
        }
        The given code uses:
        @JSONField
        private String name;
        
        This implies that the annotation can be used without specifing a value for the name parameter.
        Thus, the JSONField annotation must define a default value for the name parameter.
       
     C.
      @Retention(RetentionPolicy.RUNTIME)
        @Target({ElementType.FIELD, ElementType.METHOD})
        public @interface JSONField {
            public String value() default "";
        }
        The name of the parameter used in the given code is "name". So, the annotation must define an attribute named "name" instead of "value".
        
        Note that while applying the annotation, you can omit the name
        of the element while specifying a value only when the name of the element is value and only
        when you are specifying just one value. In other words, if you are specifying values for more multiple elements,
        you need to use the elementName=elementValue format for each element. The order of the elements is not important.
        Thus, if the JSCONField annotation is defined as given in this option, you can use it like this:
        
        @JSONField("") //or @JSONField() or @JSONField(value="")
        String id;
        
   D.
       @Retention(RetentionPolicy.RUNTIME)
        @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
        public @interface JSONField {
            public String name() = "";
            public String format();
        }
        The given code uses:
        @JSONField
        private String name;
        
        This implies that the JSONField annotation can be used without specifing any arguments.
        Thus, if the definition of the JSONField annotation has name and format attributes,
        then the definition must also include a default value for each of them. For example:
        
        @Retention(RetentionPolicy.RUNTIME)
        @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
        public @interface JSONField {
            public String name() default "";
            public String format() default "whatever";
        }
       
     E.
        @Retention(RetentionPolicy.RUNTIME)
        public @interface JSONField {
            public String name() default "";
        }
        If the @Target is absent, then it implies that the annotation can be used on all applicable positions
        (i.e. class, field, method, constructor, parameter, local variable)
       
      -----------
        Correct(E)
        You can omit the element name while specifying a value only when the name of the element is value and only
        when you are specifying just one value. In other words, if you are specifying values for more than one elements,
        you need to use the elementName=elementValue format for each element. The order of the elements is not important
        
 */

@Retention(RetentionPolicy.RUNTIME)
@interface JSONField { // public 
    public String name() default "";
}

class Account { // public 

    @JSONField(name="acctid")
    private String id;

    @JSONField
    private String name;

    @JSONField(name="address")
    public String getAddress(){
    //valid code
        return null; // me 
    }
    //other valid code not shown
}
public class AccountJSONField {
    
}