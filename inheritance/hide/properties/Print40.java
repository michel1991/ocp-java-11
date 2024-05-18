package inheritance.hide.properties;
/**
   Which statement regarding the following code is correct?
   class A{
       public int i = 10;
        private int j = 20;
    
    }
    
    class B extends A{
        private int i = 30; //1
        public int k = 40;
    
    }
    
    class C extends B{
    }
    
    public class TestClass{
        public static void main(String args[]){
            C c = new C();
            System.out.println(c.i); //2
            System.out.println(c.j); //3
            System.out.println(c.k);
            }
    }

    A. The code will print 10 and 40 if //3 is commented out.
    B. The code will print 40 if //2 and //3 are commented out.
    C. The code will not compile because of //1.
    D. The code will compile if the line marked //2 is commented out.
        Just commenting out //2 is not enough. It will still fail compilation because of //3.
    E. None of these.
    
    Correct(B)
    You cannot access c.i because i is private in B. But you can access ( (A)c).i because i is public in A.
    Remember that member variables are hidden and not overridden.
    So, B's i hides A's i and since B's i is private, you can't access A's i unless you cast the reference to A.
    You cannot access c.j because j is private in A.

 */
class A{
    public int i = 10;
    private int j = 20;

}

class B extends A{
    private int i = 30; //1
    public int k = 40;

}

class C extends B{
}

class TestClass{ // public 
    public static void main(String args[]){
        C c = new C();
        //System.out.println(c.i); //2 original
        //System.out.println(c.j); //3 original
        System.out.println(c.k);
    }
}

public class Print40 {
    public static void main(String args[]){
        TestClass.main(args);
    }
}