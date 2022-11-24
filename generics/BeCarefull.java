package generics;

/**
* Which of the following lines can be inserted to make the code compile? (Choose all that apply.)
*
  A. W w1 = new W();
  B. W w2 = new X();
  C. W w3 = new Y();
  D. Y y1 = new W();
  E. Y y2 = new X();
  F. Y y1 = new Y();

  Y is both a class and a type parameter. This means that within the class Z, when we refer to Y, it uses the type parameter.
  All of the choices that mention class Y are incorrect because it no longer means the class Y.
 */
class W {}
class X extends W {}
class Y extends X {}
class Z<Y> {
    // INSERT CODE HERE
}

public class BeCarefull {
  public static void main(String... args){
      System.out.println("amazing generics");
  }
}