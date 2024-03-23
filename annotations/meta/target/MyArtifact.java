package annotations.meta.target;

/**
 * Given:
   Which of the following are correct usages of the above annotation?
   
   A. @MyArtifact("method")    
        void someMethod(int index){
        }
        
       You can omit the element name while specifying a value only when the name of the element is value.
       Otherwise, you must specify the name of the element for which you are passing the value.
        Here, the name of the annotation element is name, so, you must use name="method" instead of just "method".
        
    B. void someMethod(@MyArtifact(name="param") int index){
        }
        Since @Target annotation is not specified in the definition of @MyArtifact, it will be assumed that @MyArtifact is applicable
        to all places where annotations can be used.
        
     C. @MyArtifact("")
         public class TestClass{
        }
        his has the same problem as option 1.
        
     D. @MyArtifact
        public class TestClass{
        }
        Since the name element does not have a default value, it must be provided while using the annotation.
        
     E. @MyArtifact(id=10, name="class")
          public class TestClass{
         }
     The order of values for the elements is not important
     
     Correct(B, E)   
 */
public @interface MyArtifact {
    int id() default 0;
    String name();
}
