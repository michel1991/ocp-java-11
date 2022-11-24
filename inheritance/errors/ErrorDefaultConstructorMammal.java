package inheritance.errors;

/**
* What is the output of the following program?
  A. Platypus
  B. Mammal
  C. PlatypusMammal
  D. MammalPlatypus
  E. The code will compile if line 7 is changed.
  F. The code will compile if line 9 is changed.
  The code will not compile as is, because the parent class Mammal does not define a no-argument constructor.
  For this reason, the first line of a Platypus constructor should be an explicit call to super(int), making option F the correct answer.
  Option E is incorrect, as line 7 compiles without issue.
  The sneeze() method in the Mammal class is marked private, meaning it is not inherited and therefore is not overridden in the Platypus class.
  For this reason, the sneeze() method in the Platypus class is free to define the same method with any return type.
 */
class Mammal {
   private void sneeze() {

   }
   public Mammal(int age) {
       System.out.print("Mammal");
        }
}

 class Platypus extends Mammal {
    int sneeze() {
        return 1;
    }
    public Platypus() {
        System.out.print("Platypus");

    }

}
public class ErrorDefaultConstructorMammal {
    public static void main(String[] args) {
        new Mammal(5);
    }
}