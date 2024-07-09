package inheritance.tricky.polymorphism;

/**
   Consider the following class hierarchy
   
   A. You cannot access class A's m1() from class C for the same object ( i.e. this).
   B. You can access class B's m1() using super.m1() from class C.
   
   C. You can access class A's m1() using ( (A) this ).m1() from class C.
      In the case of instance methods, which method is executed at runtime is determined by the actual class of the object pointed to by the reference.
      Since within class C, the this reference points to an object of class C,
      you will only be able invoke C's m1() by casting this to B or A. Therefore, this option will not work.
      
   D. You can access class A's m1() using super.super.m1() from class C.
   
   --------
   super.super is an invalid construct. So, there is no way you can access m1() of A from C.
   Correct(A, B)


 */
class A{
    public void m1() {   }
 }
 class B extends A{
    public void m1() {   }
 }
 class C extends B{
    public void m1(){
       /*  //1
       ... lot of code.
       */
    }
 }

public class CB {
    
}