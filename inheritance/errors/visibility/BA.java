package inheritance.errors.visibility;
/**
 
    Consider the following classes in one file named A.java...

    abstract class A{
        protected int m1(){ return 0; }
    }
    class B extends A{
        @Override
        int m1(){ return 1; }
    }
    
    Which of the following statements are correct.
    
    A.
      The code will not compile as you cannot have more than one class in one file.
           ----
            You can define any number of types (class/interface/enums) in a single file but only one of the types can be public.
            
    B. The code will not compile because class B does not override the method m1() correctly.
        Method m1() in super class A is more accessible than the overriding method in subclass B.
        An overriding method is not allowed to decrease accessibility.
        
    C. The code will not compile as A is an abstract class but does not have any abstract method.
            An abstract class does not necessarily have to have an abstract method.
            
    D. The code will not compile because @Override annotation is used incorrectly.
        There is nothing wrong with it.
        
        
    E. The code will compile fine.
   ---------------------------
    The concept here is that an overriding method cannot make the overridden method more private.
    The access hierarchy in increasing levels of accessibility is:
    private->'no modifier'->protected->public ( public is accessible to all and private is accessible to none except itself.)
    Here, class B has no modifier for m1() so it is trying to reduce the accessibility of protected to default.
    'protected' means the method will be accessible to all the classes in the same package and all the subclasses
    (even if the subclass is in a different package).
    No modifier (which is the default level) means the method will be accessible only to all the classes in the same package.
    (i.e. not even to the subclass if the subclass is in a different package.)
    Correct(B)
 */

abstract class A{
    protected int m1(){ return 0; }
}
class B extends A{
    @Override
    int m1(){ return 1; }
}
public class BA {
    
}