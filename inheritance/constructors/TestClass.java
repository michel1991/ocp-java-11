package inheritance.constructors;

/**
 * What can be inserted at //1 and //2 in the code below so that it can compile without errors:
 
    A. this("unknown"); at 1 and super(nm); at 2
    B. super("unknown"); at 1 and super(nm); at 2
    C. super(); at 1 and super(nm); at 2
        super(); at 1 will not compile because super class Doll does not have a no args constructor.
    D. super(); at 1 and Doll(nm); at 2
      super(); at 1 will not compile because super class Doll does not have a no args constructor. Doll(nm);
      at 2 is an invalid syntax for calling the super class's constructor.
    E. super("unknown"); at 1 and this(nm); at 2
        this(nm); at 2 will not compile because it is a recursive call to the same constructor.
    F. Doll(); at 1 and Doll(nm); at 2
       Both are using invalid syntax for calling the super class's constructor.
       
     Correct(A, B)
    Since the super class Doll explicitly defines a constructor,
    compiler will not provide the default no-args constructor. Therefore, each of Barbie's constructors
    must directly or indirectly call Doll's string argument constructor, otherwise it will not compile.
    Although not relevant for this question, it is interesting to know that super(name);
    at //1 or //2, would not be valid because name is defined in the superclass
    and so it cannot be used by a subclass until super class's constructor has executed.
    For the same reason, this(name); cannot be used either.

 */
class Doll{
    String name;
    Doll(String nm){
        this.name = nm;
    }
}

class Barbie extends Doll{
    Barbie(){
        //1
        this("unknown");
    }
    Barbie(String nm){
        //2
        super(nm);
    }
}
  public class TestClass {
    public static void main(String[] args) {
        Barbie b = new Barbie("mydoll");
    }
}