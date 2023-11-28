package nestedClass.anonymous;

/**
 *  An anonymous class can be declared in a static method.
     A. True
     B. False
     
     (correct A)
     
     The following code shows how an anonymous class can be declared within a static method.

 */
abstract class SomeClass {   public abstract void m1(); }
class TestClass // comment modifier public 
    {
        public static SomeClass getSomeClass()  //note static
  {

      //The following statement declares as well as instantiates 
      //an anonymous class that extends SomeClass
      return new SomeClass() 
            {
                public void m1() { }
            };
  }
    }

public class CanBeDeclarerdInStaticMethod {
    
}