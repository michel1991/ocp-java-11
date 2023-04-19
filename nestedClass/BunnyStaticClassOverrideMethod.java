package nestedClass;

/**
 * What is the output of the following code?
    A. hophop
    B. HOPhop
    C. hopHOP
    D. HOPHOP
    E. The code does not compile.
    
    This example deals with polymorphism since the methods are being called on the object instance.
    Since both objects are of type FlemishRabbit, HOP is printed twice, and option D is the correct answer.
 */
 class Bunny {
    static class Rabbit {
        void hop() {
            System.out.print("hop");
        }
    }
    static class FlemishRabbit extends Rabbit {
        void hop() {
            System.out.print("HOP");
        }
    }
    public static void main(String[] args) {
        Rabbit r1 = new FlemishRabbit();
        FlemishRabbit r2 = new FlemishRabbit();
        r1.hop();
        r2.hop();
    }
}


public class BunnyStaticClassOverrideMethod {
  
}