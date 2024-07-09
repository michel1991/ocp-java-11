package usingFieldAndMethods;
/**
    What would be the result of attempting to compile and run the following program?
    
    A.
      The program will fail to compile, since the static method main is trying to call the non-static method func.
      ------
        The concept here is that a non-static method (i.e. an instance method) can only be called on an instance of that class.
        Whether the caller itself is a static method or not, is immaterial.
        
        The main method is calling ref.func(); - this means the main method is calling a non-static method
        on an actual instance of the class TestClass (referred to by 'ref'). Hence, it is valid.
        It is not trying calling it directly such as func() or this.func(), in which case, it would have been invalid.
    
    B.
      The program will fail to compile, since the non-static method func cannot access the static member variable ref.
           --
            Non static methods can access static as well as non static methods of a class.
            
    C. The program will fail to compile, since the argument args passed to the static method main cannot be passed on to the non-static method func.
            It certainly can be.
            
    D. The program will fail to compile, since method func is trying to assign to the non-static member variable 'arguments' through the static member variable ref.

    E. The program will compile and run successfully.

    Correct(E)

 */
public class TestClass {
    static TestClass ref;
    String[] arguments;
    public static void main(String args[]){
       ref = new TestClass();
       ref.func(args);
    }
    public void func(String[] args){
       ref.arguments = args;
    }
}