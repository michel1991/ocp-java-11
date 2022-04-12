package declaringAnInnerClass;

public class Outer{
  private String greeting = "Hi";

 protected class Inner{
    public int repeat = 3;
    public void go(){
        for (int i = 0; i < repeat; i++){
          System.out.println(greeting);
        }
    }
 }

  public void callInner(){
     Inner inner = new Inner();
     inner.go();
  }

 public static void anotherWayToInstantiateInner(){
    System.out.println();
    System.out.println("Another way to instantiate inner ");
    Outer outer = new Outer();
    Inner inner = outer.new Inner();
   inner.go();
 }

 public static void main(String[] args){
   Outer outer = new Outer();
   outer.callInner();

  anotherWayToInstantiateInner();
 }

 


}
