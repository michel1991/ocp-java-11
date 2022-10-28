package advancedDesign;

/**
* The MagicWand class is an inner class that requires an instance of the outer class Wizard to instantiate.
* Option A is incorrect, as DarkWizard declares a local class but does not create an instance of the local class.
* Options B and F both correctly create an inner class instance from an outer class instance, printing Poof! at runtime.
* Options C and E are incorrect, as they each require an instance of the outer class. Remember,
* MagicWand is not a static nested class. Finally, option D is correct, as it creates an anonymous class of MagicWand.
* The method declared in the anonymous class is never called, though, since it is an overload of the original method
* with a different signature, not an override. In this manner, Poof! is still printed at runtime. For more information,
* see Chapter 1.
 */
class Wizard {
    private enum Hat {
        BIG, SMALL
    }
    protected class MagicWand {
        void abracadabra() {
            System.out.print("Poof!");
        }
    }
}

public class AnonymousWithInheritance {
    public static void main(String[] args) {
        var w = new Wizard();
        w.new MagicWand().abracadabra();
        w.new MagicWand(){
            void abracadabra(int spell) {
                System.out.print("Oops!");
            }
        }.abracadabra();

    }
}