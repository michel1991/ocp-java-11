//in file TestClass.java
package inheritance.hide.useCase.px;
import inheritance.hide.useCase.p1.Movable;
import inheritance.hide.useCase.p2.Donkey;

/**
  Given:
    //in file Movable.java
    package p1;
    public interface Movable {
        int location = 0;
        void move(int by);
        public void moveBack(int by);
    }
    
    
    //in file Donkey.java
    package p2;
    import p1.Movable;
    public class Donkey implements Movable{
        int location = 200;
        public void move(int by) {
            location = location+by;
        }
        public void moveBack(int by) {
            location = location-by;
        }
    }
    
    
    //in file TestClass.java
    package px;
    import p1.Movable;
    import p2.Donkey;
    public class TestClass {
        public static void main(String[] args) {
            Movable m = new Donkey();
            m.move(10);
            m.moveBack(20);
            System.out.println(m.location);
        }
    }
    Identify the correct statement(s).
    
    A. Donkey.java will not compile.
    B. TestClass.java will not compile.
    C. Movable.java will not compile.
    D. It will print 190 when TestClass is run.
    E. It will print 0 when TestClass is run.
    
    -------------------
     correct(D)
     
     There is no problem with the code. All variables in an interface are implicitly public, static, and final.
     All methods in an interface are public. There is no need to define them so explicitly.
     Therefore, the location variable in Movable is public and static and the move() method is public.
    
    Now, when you call m.move(10) and m.moveBack(20), the instance member location of Donkey is updated to 190 because
    the reference m refers to a Donkey at run time and so move and moveBack methods of Donkey are invoked at runtime.
    However, when you print m.location, it is the Movable's location (which is never updated) that is printed.
    
 */
public class TestClass {
    public static void main(String[] args) {
        Movable m = new Donkey();
        m.move(10);
        m.moveBack(20);
        System.out.println(m.location);
    }
}