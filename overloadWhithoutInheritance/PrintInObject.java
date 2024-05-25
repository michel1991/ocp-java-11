package overloadWhithoutInheritance;

/**
   Consider the following class...
       class TestClass{
        void probe(Integer x) { System.out.println("In Integer"); } //2
        
        void probe(Object x) { System.out.println("In Object"); } //3 
        
        void probe(Long x) { System.out.println("In Long"); } //4
        
        public static void main(String[] args){
            String a = "hello"; 
            new TestClass().probe(a); 
        }
    }
    What will be printed?
    
    A. In Integer
    B. In Object
    C. In Long
    D. It will not compile
    
    ---------------
    Here, we have three overloaded probe methods but there is no probe method that takes a String parameter.
    The only one that is able to accept a String is the one that takes Object as a parameter. So that method will be called.

    A String cannot be assigned to a variable of class Integer or Long variable, but it can be assigned to a variable of class Object.
     Correct (B)
     

    
 */
class TestClass{
    void probe(Integer x) { System.out.println("In Integer"); } //2
    
    void probe(Object x) { System.out.println("In Object"); } //3 
    
    void probe(Long x) { System.out.println("In Long"); } //4
    
    public static void main(String[] args){
        String a = "hello"; 
        new TestClass().probe(a); 
    }
}

public class PrintInObject {
    public static void main(String[] args){
        TestClass.main(args);
    }
}