// in file Donkey.java
package inheritance.hide.useCase.p2;
import inheritance.hide.useCase.p1.Movable;
public class Donkey implements Movable{
    int location = 200;
    public void move(int by) {
        location = location+by;
    }
    public void moveBack(int by) {
        location = location-by;
    }
}