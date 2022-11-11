package advancedDesign;

/**
* If a class inherits an instance method, then it can only declare a method with the same signature if that method is also an instance method,
* making option A incorrect. Option B is correct, as it defines the effect of overriding a method in a subclass via polymorphism.
* Option C is incorrect as variables cannot be overridden. Option D is also incorrect. Polymorphism dictates that the calls to an overridden
* method will be replaced everywhere, regardless of the reference type used. Option E is incorrect, as abstract methods are often overridden,
* commonly in the first concrete subclass. Finally, option F is correct. Methods marked private cannot be overridden.
* They can still be declared in a subclass, but since they are not inherited in a subclass, this is not considered an overridden method.
 */
class Parent{
    public void hello(){
        System.out.println("denise");
    }
}

class Children extends Parent{
    public static void hello(){
        System.out.println("denise");
    }
}

public class ErrorOverrideMethodWithStatic {
  public static void main(String... args){

  }
}