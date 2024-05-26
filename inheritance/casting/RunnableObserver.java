package inheritance.casting;
/**
    Consider the following classes:
    class A implements Runnable{ ...}
    class B extends A implements Observer { ...}
    (Assume that Observer has no relation to Runnable.)
    
    and the declarations :
    
        A a = new A() ;
        B b = new B();
    
    Which of the following Java code fragments will compile and execute without throwing exceptions?
    
    A. 
    Object o = a; Runnable r = o;
    ______________________________________________
        The declared class of o is Object while the declared type of the target of the assignment i.e. r is Runnable.
        Although, at run time, o does point to a Runnable, the compiler doesn't know about it and so it can't let
        you assign o to r unless you assure the compiler that o will point to a Runnable object at run time.
        You can do so by putting an explicit cast. i.e.
        Object o = a; Runnable r = (Runnable) o;
    B.
      Object o = a; Runnable r = (Runnable) o;
      -------------------------------
        Here you are explicitly telling the compiler that o refers to an object that is Runnable.
        
    C.
      Object o = a; Observer ob = (Observer) o ;
      ---------------------------
        It will compile but will fail at run time as at runtime 'a' does not refer to an object that is an Observer.

    D. Object o = b; Observer o2 = o;
      ------------------------
        This has the same problem as option 1.

    E.  Object o = b; Runnable r = (Runnable) b;
        --------------------------
        Since b is declared of a type that indirectly implements Runnable,
        the compiler can figure out that b will always point to an object that is assignable to a Runnable.
        Therefore, explicit cast is not required here. It will still work fine with the explicit cast though.
        
     -----------------------------------------------------------------------------------------------------------------------------------------
     Although you know that o will refer to an object that is a Runnable at runtime, the compiler doesn't know about it.
      That is why, you have to do: Runnable r = (Runnable) o;
        You can assign a subclass object reference to superclass reference without a cast but to assign
        a super class object reference to a subclass (or interface) reference you need an explicit cast as in option 2.
     Correct(B, E)

 */

class A implements Runnable{
    public void run(){
        
    }
}

interface Observer{ // add by me
    
}
class B extends A implements Observer {
    public void run(){
        
    }
}
public class RunnableObserver {
    public static void main(String... args){
        A a = new A() ;
        B b = new B();
        
        Object o = a; Runnable r = (Runnable) o; // response B
        Object oResponseE = b; Runnable rResponseE = (Runnable) b;
    }
}