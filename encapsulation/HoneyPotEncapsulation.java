package encapsulation;

class Bee{
    Honey getHoney(){
      return null;
    }
}

class Honey{
    public void add(Honey honey){

    }
}

/**
 Which are the minimum changes must be made to the following code for it to properly exhibit encapsulation?
  (Choose all that apply.)

   A. Make the variable on line 2 private.
    B. Make the variable on line 2 public.
    C. Make the method on line 4 private.
    D. Make the method on line 5 private.
    E. Remove line 4.
    F. Remove lines 5 through 7.

    Encapsulation is usually implemented with private instance variables and public methods.
    Calls are allowed to make changes to the instance variables as long as they do so through methods.
 */
class HoneyPot { // 1:
    private Honey honey;  //  2: Honey honey
    public Honey getHoney() { return honey; } // 3:
    public void setHoney(Honey h) { honey = h; } //  4:
    public void depositHoney(Bee bee) { //  5:
        honey.add(bee.getHoney()); //  6:
    } //   7:
} //  8:

public class HoneyPotEncapsulation {

}