package inheritance.changeToMake;
/**
  Given the following source code, which of the lines that are commented out may be reinserted without introducing errors?

    abstract class Bang{
    // abstract void f();  // LINE 0
        final    void g(){}
    // final    void h(){} // LINE 1
        protected static int i;
        private int j;
    }
    
    final class BigBang extends Bang{
    // BigBang(int n) { m = n; } // LINE 2
        public static void main(String args[]){
            Bang mc = new BigBang();
        }
    // @Override // LINE 3
        void h(){}
    // void k(){ i++; } // LINE 4
    // void l(){ j++; } // LINE 5
        int m;
    }
    
    Consider each line independently.
    
    A. abstract void f( ) ;  //(0)
        If this line is inserted, then either the class BigBang will have to be declared abstract or it has to implement method f().
        
    B. final void h( ) { } //(1)
        It will fail because BigBang will try to override a final method.
        
    C. BigBang(int n) { m = n; }  //(2)
        It will fail since BigBang will no longer have a default constructor that is used in the main( ) method.
     
    D. @Override //(3)
        Since there is no h() method in the superclass, @Override is invalid here.
        
    E. void k( ) { i++; }   //(4)
    
    F. void l( ) { j++; }  //(5)
        It will fail since the method will try to access a private member 'j' of the superclass.

   ----
     Default constructor (having no arguments) is automatically created only if the class does not define any constructors.
     So as soon as //2 is inserted the default constructor will not be created.
    Correct(E)



 */
abstract class Bang{
// abstract void f();  // LINE 0
    final    void g(){}
// final    void h(){} // LINE 1
    protected static int i;
    private int j;
}
    
final class BigBang extends Bang{
// BigBang(int n) { m = n; } // LINE 2
    public static void main(String args[]){
        Bang mc = new BigBang();
    }
// @Override // LINE 3
    void h(){}
 void k(){ i++; } // LINE 4
// void l(){ j++; } // LINE 5
    int m;
}