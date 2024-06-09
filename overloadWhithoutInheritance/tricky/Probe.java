package overloadWhithoutInheritance.tricky;

/**
 Consider the following class:
 
 What will it print when compiled and run?
 
   A. In Integer and In long
   B. In ... and In LONG, if //2 and //3 are commented out.
   C. In Integer and In ..., if //4 is commented out.
   D. It will not compile, if //1, //2, and //3 are commented out.
   E. In LONG and In long, if //1 and //2 are commented out.
   
   ----
   To answer this type of questions, you need to know the following rules:

    1. The compiler always tries to choose the most specific method available with least number of modifications to the arguments.
    
    2. Java designers have decided that old code should work exactly as it used to work before boxing-unboxing functionality became available.
    
    3. Widening is preferred to boxing/unboxing (because of rule 2), which in turn, is preferred over var-args.
    
    
    Thus,
    1.
    probe(Integer) will be bound to probe(Integer) (exact match).
    If that is not available, it will be bound to probe(long), and then with probe(int...) in that order of preference.
    probe(long) is preferred over probe(int...) because unboxing an Integer gives an int and in pre 1.5 code probe(long)
    is compatible with an int (Rule 2).
    
    It is never bound to probe(Long ) because Integer and Long are different object types and there is no IS-A relation between them.
    (This holds true for any two wrapper classes).
    It could, however, be bound to probe(Object ) (if it existed), because Integer IS-A Object.
    
    2.
    probe(int) is bound to probe(long) (because of Rule 2) , then to probe(Integer ) because boxing an int qives you an Integer,
    which matches exactly to probe(Integer), and then to probe(int...).
    
    It is never bound to probe(Long ) because int is not compatible with Long.
    
    We advise you to run this program and try out various combinations.
    The exam has questions on this pattern but they are not this tough. If you have a basic understanding, you should be ok.
    
   correct(A, D)

 */
class TestClass{
    void probe(int... x) { System.out.println("In ..."); }  //1
    
    void probe(Integer x) { System.out.println("In Integer"); } //2
    
    void probe(long x) { System.out.println("In long"); } //3 
    
    void probe(Long x) { System.out.println("In LONG"); } //4
    
    public static void main(String[] args){
        Integer a = 4; new TestClass().probe(a); //5
        int b = 4; new TestClass().probe(b); //6
    }
}
public class Probe {
    public static void main(String[] args){
       TestClass.main(args);
    }
}