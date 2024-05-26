package inheritance.errors.findErrors.multipleRules;

/**
   The following are complete contents of TestClass.java:
   A. //1 and //2
   B.  //2 and //5
   C.  //1 //2 and //5
   D.  //1 and //5
   E.  //1 and //3
   F.  //1 //3 and //4
   
   Which lines will cause compilation to fail?

   ------------------------------------------------------------------------------------------
    
     //1 is ok. Remember that variables are not overridden. They are hidden or shadowed and it is ok
     for a subclass to hide a variable defined in the base class.
    Note that if you do System.out.println(o1.pages); it will print 100. But if you do System.out.println(((Encyclopedia)o1).pages);
    it will not compile because pages has private access in Encyclopedia.
    For the same reason, if you have Encyclopedia o3 = new Encyclopedia(); and if you do System.out.println(o3.pages);
    it will not compile. But  System.out.println(((Book)o3).pages); will compile fine and print 100;.
    
    //2 will fail because you cannot override a final method.
    
    //3 is ok. Encyclopedia is-a Book, so you can assign an Encyclopedia object to a Book reference.
    
    //4 is ok because Book does have method mA.
    
    //5 will fail because of the declared type of reference o1 is Book. Book doesn't have method mB.
    Since the complier only checks the declared type of a reference to see if a method call is valid, it will complain.
    
     correct(B)

 */
class Book{
    protected final int pages = 100;
    final void mA(){
        System.out.println("In B.mA "+pages);
    }
}
    
class Encyclopedia extends Book{
    private int pages = 200; //1
    void mB(){
        System.out.println("In E.mB "+pages);       
    }
    void mA(){ //2
        System.out.println("In E.mA "+pages);
    }
}
public class EncyclopediaTestClass {
    public static void main(String[] args) {
        Book o1 = new Encyclopedia (); //3
        Book o2 = new Book();
        o1.mA(); //4
        o1.mB(); //5
        o2.mA();
    }
        
}