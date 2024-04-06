package interfaces.staticMethods;
//What will the following code print when compiled and run?




interface Pow{
    static void wow(){
        System.out.println("In Pow.wow");    
    }
}

abstract class Wow{

    static void wow(){  // LINE 9
        System.out.println("In Wow.wow");    
    }    
}

/**
 * A. In Wow.wow
    Observe that f is reference variable of type Powwow. Since Powwow extends Wow, Powwow inherits the static method wow() from Wow.
    Java allows a static method of a class to be invoked using a reference variable and so f.wow() invoke's Wow's wow().

    Static methods of a interface are not inherited in the same way by an implementing class. Therefore, the static method wow()
    defined in the interface Pow, cannot be accessed through a reference variable. It can only be accessed using the name of the interface i.e.
    using Pow.wow().
   
   B. In Pow.wow
   
   C. It will print In Pow.wow if f.wow() is replaced with ((Pow)f).wow();
    It will not compile if you make this change because it is illegal to invoke a static method of an interface using a reference variable.
    If you want to invoke a static method of an interface, you need to use the name of the interface. For example, Pow.wow();

    You can use a reference variable to invoke a static method of a class or super class though.
    So this is valid: ((Wow)f).wow(); even though it is not a good practice to use a reference to invoke a static method.
    
    D. It will not compile as is.
    
    E. It will not compile if the line marked //LINE 9 is replaced with:
    @Override
    static void wow(){
    Remember that static methods can never be overridden. Therefore, @Override annotation doesn't apply to static methods.
    
   Correct(A, E)
 */
public class Powwow extends Wow implements Pow {
    public static void main(String[] args) {
        Powwow f = new Powwow();
        f.wow();
    }
}