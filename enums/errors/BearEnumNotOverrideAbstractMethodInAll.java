package enums.errors;

/**
* Which of the following are printed by the Bear program? (Choose all that apply.)
    A. insects
    B. INSECTS
    C. 0
    D. 1
    E. false
    F. true
    G. The code does not compile.

   The isHealthy() method is marked abstract in the enum; therefore, it must be implemented in each enum value declaration.
   Since only INSECTS implements it, the code does not compile, making option G correct.
   If the code were fixed to implement the isHealthy() method in each enum value, then the first three values printed would be INSECTS, 1, and true,
   with the fourth being determined by the implementation of COOKIES.isHealthy().
 */
public class BearEnumNotOverrideAbstractMethodInAll{
    enum FOOD {
        BERRIES, INSECTS {
            public boolean isHealthy() { return true; }
        },
        FISH, ROOTS, COOKIES, HONEY;
        public abstract boolean isHealthy();
    }
    public static void main(String[] args) {
        System.out.print(FOOD.INSECTS);
        System.out.print(FOOD.INSECTS.ordinal());
        System.out.print(FOOD.INSECTS.isHealthy());
        System.out.print(FOOD.COOKIES.isHealthy());
    }
}