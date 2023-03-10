package nestedClass;

/**
  Given the following class structure, what is the proper way to create an instance of Spinner inside the bake() method? (Choose three.)

    A. var a = new Kitchen().new Mixer().new Spinner();
    B. Mixer.Spinner b = Mixer.new Spinner();
    C. var c = new Spinner();
    D. var d = new Mixer().new Spinner();
    E. Kitchen.Mixer.Spinner e = new Kitchen().new Mixer().new Spinner();
    F. Spinner f = new Kitchen().new Mixer().new Spinner();

    Mixer and Spinner are member inner classes that require an instance of Kitchen and Mixer,
    respectively, to instantiate. Since bake() is defined as an instance method of Kitchen,
    the Kitchen instance can be implied. For this reason, option D is correct.
    Options A and E are also correct and rely on a new instance of Kitchen rather than the implied one.
    Options B and C are incorrect because there is no instance of Mixer used.
    Option F is incorrect because the reference type Spinner is undefined without the names of the enclosing classes.
 */
class Kitchen {
    class Mixer {
        class Spinner {}
    }
    public void bake() {
        // INSERT CODE HERE
        var a = new Kitchen().new Mixer().new Spinner();
        var d = new Mixer().new Spinner();
        Kitchen.Mixer.Spinner e = new Kitchen().new Mixer().new Spinner();
    }
}

public class KitchenCreateInstance {
   public static void main(String... args){

   }
}