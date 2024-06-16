package inheritance.hide.useCase.p2;
import inheritance.hide.useCase.p1.*;

/**
 In file B.java:

    package p2;
    import p1.*;
    public class B extends A{
      public String name = "B";
      public B(){ super(); }
    }

 */
public class B extends A{
    public String name = "B";
    public B(){ super(); }
  }