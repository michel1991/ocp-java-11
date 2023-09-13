package inheritance.errors.finalNotAllow;

/**
* Trick question—the code does not compile! The Spirit class is marked final,
* so it cannot be extended. The main() method uses an anonymous inner class that inherits from Spirit,
* which is not allowed. If Spirit was not marked final, then options C and F would be correct.
* Option A would print Booo!!!, while options B, D, and E would not compile for various reasons.
 */
public class AnnonymousClassWithInheritance {
    static class Ghost {
        public static void boo() {
            System.out.println("Not scared");
        }
    protected final class Spirit {
            public void boo() {
                System.out.println("Booo!!!");
            }
        }
    }

    public static void main(String... haunt) {
        var g = new Ghost().new Spirit() {};
    }
}