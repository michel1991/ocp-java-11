package inheritance.constructorsOverload;
/**
   Given the following class definition:
    class A{
      protected int i;
      A(int i) {    this.i = i;    }
    
    }
    //1 : Insert code here
    
    
    Which of the following would be a valid class that can be inserted at //1 ?
    
    A. class B {}

    B. class B extends A {}
      --
       Since class B does not have any constructor, the compiler will try to insert the default constructor, which will look like this:
        B(){
        //Notice that it is trying to call the no args constructor of the super class, A.
            super();  
        }
        Since A doesn't have any no-args constructor, the above code will fail to compile.
        
    C.
       class B extends A {  B()  {  System.out.println("i = " + i); }  }
        ----
        It has the same problem as the one above.
        Since the first line of B's constructor is neither a call to any other constructor of B nor a call to a super class's constrcutor,
        the compiler automatically insert super(); as the first statement.
        However, A does not have a constructor that takes zero arguments, and so, super(); will fail to compile.

    D.  class B { B() {} }
    
    --------
      Notice that class A does not define a no-argument constructor.
      Also note that the class B does not define a constructor.
      Thus, class B relies on the default constructor B(). Class B's default constructor looks like this:
      
         B() {} //It is not public because class B is not public
        However, Constructors implicitly (if an explicit call to the superclass's constructor is not present) call their superclass's constructor super().
        So, class B's default constructor actually looks like this:
         B(){
          super();
        }
        Now, since class A does not define a no-argument constructor the above code will not compile.
        However, class B would be correct if changed to:
        class B extends A{
          B(){
            super(1); // pass it any integer
          }
          // or
          B(int number){
            super(number);
          }
        }
        You could also add a no-argument constructor to class A and leave class B as is.
        
      correct(A, D)
 */
public class A {
    protected int i;
    A(int i) {    this.i = i;    }
}
//1 : Insert code here

class B {} // response A

