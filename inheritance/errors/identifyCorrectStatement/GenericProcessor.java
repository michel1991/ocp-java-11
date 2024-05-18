package inheritance.errors.findErrors.identifyCorrectStatement;
import java.util.*;

/**
 * Identify correct statements about the following code:
   A. ItemProcessor fails compilation because it does not override the process method correctly.
   -------------------
    Since Collection interface extends Iterable interface, it is valid for ItemProcessor to override process method with a return type of Collection.
    This satisfies the rule of "covariant returns", which states that an overriding method
    is allowed to return a sub type of the return type defined in the overridden method.
    
   B. WordProcessor fails compilation because it does not override the process method correctly.
   ------------------------
    String is not a sub type of Iterable, and thus, is not covariant with Iterable.
    
   C. GenericProcessor fails compilation because it inherits two process methods with incompatible return types.
   D. GenericProcessor fails compilation because it extends from more than one interface.
         An interface can extend from any number of interfaces.
   E. WordProcessor will compile without errors if @Override annotation is applied on its process method.
   
   -----------------------------------------------------------------------
       The @Override annotation is an optional annotation that can be applied to an overriding method.
       This annotation ensures that the method really does override a super class's (or interface's) method.
    
    If there is a mistake in the name of the subclass's method or if the parameters
    don't match the overridden method, then it would become an entirely new method instead of an override.
    In absence of this annotation, the compiler has no way of knowing whether your intention was to actually create
    a new method or to override the super type's method and this may cause unexpected behavior at run time, which is difficult to trace.
    When the compiler sees this annotation, it cross checks with the super type and verifies that your method actually does override a super type's method. If the method does not correctly override any method, then the compiler raises an error. Thus, it is a good practice to apply this annotation to make your intention clear.
   Correct(B,C)

 */
interface Processor {
    Iterable process();
}

interface ItemProcessor extends Processor{
    Collection process();
}

interface WordProcessor extends Processor{
    String process();
}

interface GenericProcessor extends ItemProcessor, WordProcessor{
    
}
