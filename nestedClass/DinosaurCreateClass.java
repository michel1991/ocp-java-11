package nestedClass;

/**
   Given the following class structures,
   which lines can be inserted into the blank independently
   that would allow the class to compile? (Choose two.)
   
    A. dino.Pterodactyl()
    B. Dinosaur.new Pterodactyl()
    C. dino.new Pterodactyl()
    D. new Dino().new Pterodactyl()
    E. new Dinosaur().Pterodactyl()
    F. new Dinosaur.Pterodactyl()
   
   Options A and E are incorrect because the new keyword before
   Pterodactyl is required to create an instance of the member
   inner class Pterodactyl using a member of the outer class Dinosaur.
   Option B is incorrect, as this is not a valid way to instantiate a member inner class.
   Option C is correct and relies on the dino instance variable for the outer class instance.
   Option D would be correct if Dino was changed to the correct class name, Dinosaur.
   Finally, option F is correct and relies on the fact that roar() is an instance method,
   which means there’s an implicit instance of the outer class Dinosaur available.
   The Dinosaur. prefix is optional, though.
 */
 class Dinosaur {
    class Pterodactyl extends Dinosaur {}
    public void roar() {
        var dino = new Dinosaur();
        dino.new Pterodactyl(); // _______________________
    }
}

public class DinosaurCreateClass {
   public static void main(String... args){
       var di = new Dinosaur();
       di.roar();
   }
}