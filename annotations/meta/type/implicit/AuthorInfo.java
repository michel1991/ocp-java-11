
/**
 * Identify correct usages of the following annotation:
   A.  @AuthorInfo("bob")
    class A{
    }
    You can omit the element name while specifying a value only when the name of the element is value.
    Otherwise, you must specify the name of the element for which you are passing the value.
    Here, the name of the annotation element is name, so, you must use name="bob" instead of just "bob".
    
    B.
     class A{
        @AuthorInfo
        String x = "";
     }

    C.
      class A{
            @AuthorInfo("bob")
            void m1(){ };
        }
      This has the same problem as option 1
      
     D. interface I{    
            @AuthorInfo(name="bob")
            String x = "";
        }
        
     E. @AuthorInfo("bob")
        interface I{
        }
     
     F. class A{
            void m1(@AuthorInfo int x){ }
        }
        
     Since the given annotation does not specify the retention policy explicitly using the @Target meta-annotation,
     it can be used on any program element on which annotations can be specified. The @Target annotation can take the following values:
    
    ElementType.ANNOTATION_TYPE
    ElementType.CONSTRUCTOR
    ElementType.FIELD
    ElementType.LOCAL_VARIABLE
    ElementType.METHOD
    ElementType.PACKAGE
    ElementType.PARAMETER
    ElementType.TYPE
    
    Correct(B, D, F)
 */
public @interface AuthorInfo {
    String name() default "";
}

class A{
    @AuthorInfo
    String x = "";
}

interface I{    
    @AuthorInfo(name="bob")
    String x = "";
}