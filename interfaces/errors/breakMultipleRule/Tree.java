package interfaces.errors.breakMultipleRule;

/**
   What is the output of the following application?
   
    A. Grow!
    B. Super Growing!
    C. It does not compile because of line m1.
    D. It does not compile because of line m2.
    E. It does not compile because of line m3.
    F. None of the above.
    
    A class can inherit two default interfaces with the same signature,
    so long as it correctly overrides them, which Tree does.
    It can also call an inherited version of the default method within an instance method,
    provided it uses the proper syntax. In this case, it does not.
    The correct syntax is Plant.super.grow(), not super.Plant.grow().
    For this reason, this line does not compile.
    Since it is the only line that does not compile, option F is correct.
 */
interface Plant {
    default String grow() { return "Grow!"; }
}
interface Living {
    public default String grow() { return "Super Growing!"; }
}
public class Tree implements Plant, Living {  // m1
    public String grow() { return super.Plant.grow(); }
    public static void main(String[] leaves) {
        Plant p = new Tree();                   // m2
        System.out.print(((Living)p).grow());   // m3
    }
}