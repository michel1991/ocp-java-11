package nestedClass.accessMembers;

/**
 * Which of the following options can be inserted in Outer class?
     public class Outer
    {
        private double d = 10.0;
        //put inner class here.
    }
    
  A. class Inner
    {
        public void m1() {  this.d = 20.0;  }
    }
     It will not compile because of 'this.d'. To access d, you should either use d or Outer.this.d
     
    B.
      abstract class Inner
        {
            public void m1() {  d = 20.0;  }
        }
      
    C.
       final class Inner
        {
            public void m1() {  d = 20.0;  }
        }
        
    D.
        private class Inner
        {
            public void m1() {  d = 20.0;  }
        }
        
    //
      d is an instance member of Outer and is therefore accessible to all the other instance members
      of the class including a non-static inner class.
      You can access d from a static inner class by using a reference to an instance of Outer.
      
      Correct(B, C, D)
 */
public class Outer
{
    private double d = 10.0;
    //put inner class here.
    
    abstract class InnerResponseB
    {
        public void m1() {  d = 20.0;  }
    }
    
    final class InnerResponseC
    {
        public void m1() {  d = 20.0;  }
    }
    
    private class Inner
    {
        public void m1() {  d = 20.0;  }
    }
    
    
}
