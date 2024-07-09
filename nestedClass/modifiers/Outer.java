package nestedClass.modifiers;

/**
   Which statements regarding the following code are correct?
   A. This code will not compile.
   B. Constructor for Outer is public.
   C. Constructor for Outer is private.
   D.  Constructor for Inner is public.
   E.  Constructor for Inner is protected.
   
    1. Putting a return type makes private void Outer() { } a method and not a constructor.
    2. When a programmer does not define ANY constructor, the compiler inserts one automatically,
    the access modifier of which is same as that of the class.

    For example, compile the given  code and run javap on the class file. This is what you should see:
    
   class Outer extends java.lang.Object {
    Outer(); //*Notice this: compiler added it. It has no access modifier.
    //It is the same as the class.
    private void Outer(); // Our private method.
    protected class Outer. Inner extends java.lang.Object
    //  ACC_SUPER bit NOT set
    {
        private final Outer this$0;
            protected Outer.Inner(Outer); //**Notice this: compiler added it.
    //It has protected access modifier, which is the same as the class.
        }
    }
    
   Correct(E)

 */
public class Outer {
    private void Outer() { }
    protected class Inner
    {
    }
}