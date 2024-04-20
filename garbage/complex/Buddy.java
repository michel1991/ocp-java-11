package garbage.complex;

/**
 *  Given:
    A. Object created at line //1 will be eligible for garbage collection after line //2.
     Observe that No, at //2 the variable upper variable refers to the method parameter
     and not the instance variable. Therefore, the reference to the Buddy object created at //1 is lost after //2.
    
    B. Object created at line //1 will be eligible for garbage collection after line //5.
    C. Object created at line //3 will be eligible for garbage collection after line //4.
    D. Object created at line //3 will be eligible for garbage collection after line //5.
    
    Correct(A, D)

 */
public class Buddy {
    Buddy upper;
    String name;
    public Buddy(){ }
    
    public Buddy(String name){
        this.name = name;
    }
    public Buddy(String name, Buddy upper){
        this.name =  name;
        Buddy b = new Buddy(upper.name);//1
        upper = b; //2
    }
    
    public static void main(String[] args) {
        Buddy b1 = new Buddy("A");     //3
        Buddy b2 = new Buddy("B", b1); //4
        System.out.println(b1); //5
    }
}