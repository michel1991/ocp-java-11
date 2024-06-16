package annotations.meta.typeUse;
import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*; // note
import java.util.*;

/**
 Given:

    @Target(value={TYPE_USE,TYPE_PARAMETER})
    public @interface Interned{
    }
    
    and
    public class Account{
    }
    
    
    Identify correct usages.
    
    A.
      var str = "Hello"+ (@Interned) "World";
       ----
        The annotation can be applied on the type, not on the value. So, this is valid:
        var str = "Hello"+ (@Interned String) "World";
        
    B. var str = "Hello"+ (@Interned "World");

       
    C. @Interned Account acct = new Account();

    D. Account acct = new @Interned Account();

    E. Account acct = @Interned new Account();

    
    -----
    @Interned is not a standard Java annotation.

    Although this annotation is officially not in scope for the OCP Java 11 exam,
    we have seen questions on the exam that require basic knowledge about this annotation.
    It exists in Checker Framework https://checkerframework.org/manual/,
    which is referred in an Oracle blog: https://blogs.oracle.com/java-platform-group/java-8s-new-type-annotations
    
    It can be applied to a field, method parameter, or method return type.
    
    Package: org.checkerframework.checker.interning.qual
    
    @SubtypeOf(value=UnknownInterned.class)
    @Documented
    @Retention(value=RUNTIME)
    @Target(value={TYPE_USE,TYPE_PARAMETER})
    public @interface Interned
    
    Indicates that a variable has been interned, i.e., that the variable refers to the canonical representation of an object.
    To specify that all objects of a given type are interned, annotate the class declaration:
    
       public @Interned class MyInternedClass { ... }
    
    This is equivalent to annotating every use of MyInternedClass, in a declaration or elsewhere.
    For example, enum classes are implicitly so annotated.
    
     correct(C, D)
 */

@Target(value={TYPE_USE,TYPE_PARAMETER})
@interface Interned{
}

public class Account {
    public static void main(String... args){
        @Interned Account acctResponseC = new Account();
        Account acctResponseD = new @Interned Account();
        var str = "Hello"+ (@Interned String) "World";
    }
}