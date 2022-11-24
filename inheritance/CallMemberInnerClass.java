package inheritance;


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

/**
* Given the following program, what can be inserted into the blank line that would allow it to compile and print Poof! at runtime? (Choose all that apply.)
* A. class DarkWizard extends Wizard {}.new MagicWand()
* B. new Wizard().new MagicWand()
* C.  Wizard.new MagicWand()
* D. w.new MagicWand(){void abracadabra(int spell) {System.out.print("Oops!"); } }
* E. new MagicWand()
* F. w.new MagicWand()
* G. None of the above, as the code does not compile
*
* The MagicWand class is an inner class that requires an instance of the outer class Wizard to instantiate.
* Option A is incorrect, as DarkWizard declares a local class but does not create an instance of the local class.
* Options B and F both correctly create an inner class instance from an outer class instance, printing Poof! at runtime.
* Options C and E are incorrect, as they each require an instance of the outer class.
* Remember, MagicWand is not a static nested class. Finally, option D is correct, as it creates an anonymous class of MagicWand.
* The method declared in the anonymous class is never called, though, since it is an overload of the original method with a different signature, not an override.
*  In this manner, Poof! is still printed at runtime. For more information, see Chapter 1.
*/
class CastSpells {

    static Wizard.MagicWand createWithInheritance(){
        var w = new Wizard();
        return w.new MagicWand(){
            void abracadabra(int spell) {
                System.out.print("Oops!!");
            }
        };
    }

    static Wizard.MagicWand createWithNewOnReference(){
        var w = new Wizard();
        return w.new MagicWand();
    }

    static Wizard.MagicWand createWithNewOnReferenceSingleLine(){
        return new Wizard().new MagicWand();
    }

    public static void callMethodOfWizard() {
        var list = new Wizard.MagicWand[]{createWithInheritance(), createWithNewOnReference(), createWithNewOnReferenceSingleLine()};
        for(var w : list){
            w.abracadabra();  // ____________________
        }
    }
}


public class CallMemberInnerClass {
    public static void main(String[] args) {
        CastSpells.callMethodOfWizard();
    }
}