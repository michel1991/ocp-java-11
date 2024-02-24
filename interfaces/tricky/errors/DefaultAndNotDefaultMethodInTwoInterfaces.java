package interfaces.tricky.errors;

/**
  Which statement(s) about the following code are correct?
  A. Code for class HomeOffice will cause compilation to fail at //1.
        If this code is permitted, the HomeOffice class would inherit two versions
        of lockTheGates methods - one from the Office interface (which is default), and one from
        the House interface (which is abstract). But Java does not permit a class to inherit
        multiple versions of the same method from multiple unrelated interfaces (even if the method
        is abstract in one of the interfaces). Java forces the class to provide its own implementation
        for that method so that there is no ambiguity about which implementation of the method should be invoked at run time.
        
   B.  Lines at //3 and //5 will cause compilation to fail.
   C.  Line at //4 will cause compilation to fail.
   D. There will no compilation error. The code will print Locking House twice.
    The only way class HomeOffice can implement both the interfaces is when provides its own implementation of the lockTheDoors method
    
    Correct(A)
 */
interface House{
    public default void lockTheGates(){
        System.out.println("Locking House");
    }
}

interface Office {
    public void lockTheGates();
}

class HomeOffice implements House, Office{ //1
}

class TestClass {

    public static void main(String[] args) {
        Office off = new HomeOffice();  //2
        off.lockTheGates(); //3
        House home = (House) off; //4
        home.lockTheGates(); //5
    }
}

public class DefaultAndNotDefaultMethodInTwoInterfaces {
    
}