package annotations;

import java.lang.annotation.*;

@Target(ElementType.TYPE_USE)
@interface Valid {

}

class Tester {
    void test() {
        int age = (@Valid int) 1;
    }
}


/**
* Trick question! Annotations are applied to declarations, not values.
* They can be applied to almost any type declaration in Java including classes,
* interfaces, enums, methods, constructors, variables (member, static, and local),
* parameters, cast operations, etc. They cannot be applied to a value or expression,
* except as a cast operation. When used in a cast operation, a type is required such as int b = (@Valid int) 10.
 */
public class AnnotationTypeUse {
   public static void main(String... args){
       new Tester().test();
   }
}