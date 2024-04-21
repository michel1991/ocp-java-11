package garbage;

/**
 * Consider the following code snippet:
   What can be inserted at // 1, which will make the object referred to by obj eligible for garbage collection?
   
    A. obj.destroy();
    
    B. Runtime.getRuntime().gc();
        Execution of garbage collector doesn't make an object eligible for garbage collection.
        So even if you try to invoke the garbage collector, it will not destroy the object that is not eligible for garbage collection.
        Also remember that calling System.gc() or Runtime.getRuntime().gc() will not necessarily run the garbage collector.
        It only requests the JVM to perform garbage collection but there is no guarantee that the JVM will do it.
        
        By the way, System.gc() is equivalent to Runtime.getRuntime().gc().
        
    C. obj = null;
        This will make the object eligible for GC because there are no other references to it.
        
    D. obj.finalize()
    E. obj.name = null; as well as obj = null;
     You don't need to do obj.name=null;
     
     Correct(C)
     
     The official exam objectives now explicitly mention Garbage collection.  All you need to know is:
    
    1. An object can be made eligible for garbage collection by making sure there are no references pointing to that object.
    2. You cannot directly invoke the garbage collector. You can suggest the JVM to perform garbage collection by calling System.gc();
    
    Nothing can ensure that an object will definitely be destroyed by the garbage collector.
    You can at most make an object eligible for GC by making sure that there are no references to it.
 */
 class Test{ // public
    void test(){
            MyClass obj = new MyClass();
            obj.name = "jack";
            // 1 insert code here
    }
}

//In MyClass.java
class MyClass{ // public 
    int value;
    String name;
}


public class TestMyClass {
    
}