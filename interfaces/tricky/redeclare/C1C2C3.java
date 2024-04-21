
/**
 * Given the following definitions and reference declarations:
     interface I1 { }
    interface I2 { }
    class C1 implements I1 { }
    class C2 implements I2 { }
    class C3 extends C1 implements I2 { }
    C1 o1;
    C2 o2;
    C3 o3;
    
   A. class C4 extends C3 implements I1, I2 { }
    Although, the implements I1, I2 is redundant here because C3 already implements I1 and I2, it is not invalid.
    
   B. o3 = o1;
        superclass reference cannot be assigned to subclass reference without explicit cast.
       
   C. o3 = o2;
    There is no way a reference of class C2 (which is o2) can point to an object of class C3 because C2 and C3 have no inheritance relationship.
    So this assignment is rejected at compile time itself.
    
   D. I1 i1 = o3; I2 i2 = (I2) i1;
    This is valid because at run time i1 actually refers to an object that implements I2
    
   E. I1 b = o3;
    Because C3 extends C1 which implements I1.
    
    Correct(A,D, E)
 */

interface I1 { }
interface I2 { }
class C1 implements I1 { }
class C2 implements I2 { }
class C3 extends C1 implements I2 { }

public class C1C2C3 {
    C1 o1;
    C2 o2;
    C3 o3;
    
    public void responseD(){
        I1 i1 = o3; I2 i2 = (I2) i1;
    }
    
    public void responseE(){
        I1 b = o3;
    }
    
    public static void main(String... args){
       
    }
}

/**
 * response A
 */
class C4 extends C3 implements I1, I2 {
    
}

