package enums;

/**
  What is true of the following code?
    A. It prints 20 20 20
    B. It prints 20 20 75
    C. It prints 20 21 75
    D. It prints 21 21 75
    E. It does not compile due to setNumDays().
    F. It does not compile for another reason.

    While it is not recommended to change the value of an enum after it is created, it is legal.
    Each enum value has its own copy of numDays.
    This means the setter changes it for CHICKEN, but not for PENGUIN.
    Therefore, option B is correct.
    Both calls on CHICKEN print the updated value of 20, while PENGUIN retains the original 75.
 */
 class Eggs {
    enum Animal {
        CHICKEN(21), PENGUIN(75);

        private int numDays;
        private Animal(int numDays) {
            this.numDays = numDays;
        }
    public int getNumDays() {
            return numDays;
        }
    public void setNumDays(int numDays) {
            this.numDays = numDays;
        }
    }
    public static void main(String[] args) {
        Animal chicken = Animal.CHICKEN;
        chicken.setNumDays(20);

        System.out.print(chicken.getNumDays());
        System.out.print(" ");
        System.out.print(Animal.CHICKEN.getNumDays());
        System.out.print(" ");
        System.out.print(Animal.PENGUIN.getNumDays());
    }
}


public class EggsChangeValueAfterCreationNotRecommended {
    public static void main(String[] args) {
        Eggs.main(args);
    }
}