package annotations;

import java.lang.annotation.*;

@Target(ElementType.TYPE_USE)
@interface Valid {

}

/**
 Given the following declaration for @Valid, which statements allow the following program to compile?
    A. String a = @Valid "mail"
    B. int b = @Valid 10
    C. boolean c = @Valid true
    D. char d = @Valid 'a'
    E. long e = @Valid 39L
    F. None of the above

    Trick question! Annotations are applied to declarations, not values.
    They can be applied to almost any type declaration in Java including classes,
    interfaces, enums, methods, constructors, variables (member, static, and local),
    parameters, cast operations, etc. They cannot be applied to a value or expression,
     except as a cast operation. When used in a cast operation, a type is required such as int b = (@Valid int) 10.
 */
class Tester {
    void test() {
        int age = (@Valid int) 1; //________________________________
    }
}



public class AnnotationTypeUse {
   public static void main(String... args){
       new Tester().test();
   }
}