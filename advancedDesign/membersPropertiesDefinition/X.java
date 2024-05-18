package advancedDesign.membersPropertiesDefinition;

/**
 * Which of the following are valid at line 1?
   A. var s;
    -----
        Cannot use 'var' on variable without initializer.
        In other words, a var declaration must assign a value to the variable.
        Further, var declaration can only be used for variables with a local scope
        (i.e. variables defined within a method or within static or instance code blocks.)
        It cannot be used for instance or static fields or method parameters.
        
   B.  String s = 'asdf';
        A string must be enclosed in double quotes ".
        
   C.  String s = 'a';
        'a' is a char. "a" is a String
        
   D. String s = this.toString();
    Since every class directly or indirectly extends Object class and since Object class has a toString()
    method, that toString() method will be invoked and the String that it returns will be assigned to s.
    
   E.
     String s = asdf;
    there is no variable asdf defined in the given class
    
   F. String s;

   G. var al;
        al = new ArrayList<>();
        The statement var al; will not compile because a var declaration must initialize the variable.
        
     Correct(D, F)

 */

public class X{
    //line 1: insert code here.
    String s = this.toString();
}