package advancedDesign;


/**
* A default interface method may be overridden by a class implementing the interface.
* To call the default interface method when it is overridden, though, you have to use the interface name, such as Tool.super.use().
* Therefore, the line super.use() in the Screwdriver class does not compile, making option F the correct answer.
 */
interface Tool {
    default void use() {
        throw new RuntimeException("Failed!");
    }
}
class Screwdriver implements Tool {
    @Override
    public void use() {
        super.use();
        System.out.print("Twist");
    }
}
 class ElectricScrewdriver extends Screwdriver {
    @Override public void use() {
        System.out.print("Bzz");
        super.use();
    }

    public static void main(String[] a) {
        new ElectricScrewdriver().use();
    }
}

public class ErrorSuperWithInterface {
   public static void main(String... args){

   }
}