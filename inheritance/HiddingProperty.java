package inheritance;

/*
   Which of the following complete the constructor so that this code prints out 50? (Choose all that apply.)
    A. numSpots = numSpots;
    B. numSpots = this.numSpots;
    C. this.numSpots = numSpots;
    D. numSpots = super.numSpots;
    E. super.numSpots = numSpots;
    F. The code does not compile, regardless of the code inserted into the constructor.
    G. None of the above
    
    The code compiles, making option F incorrect. An instance variable with the same name as an inherited instance variable is hidden,
    not overridden. This means that both variables exist, and the one that is used depends on the location and reference type.
    Because the main() method uses a reference type of Speedster to access the numSpots variable, the variable in
    the Speedster class, not the Cheetah class, must be set to 50. Option A is incorrect, as it reassigns the method parameter to itself.
    Option B is incorrect, as it assigns the method parameter the value of the instance variable in Cheetah, which is 0.
    Option C is incorrect, as it assigns the value to instance variable in Cheetah, not Speedster.
    Option D is incorrect, as it assigns the method parameter the value of the instance variable in Speedster, which is 0.
    Options A, B, C, and D all print 0 at runtime. Option E is the only correct answer, as it assigns the instance variable numSpots
    in the Speedster class a value of 50. The numSpots variable in the Speedster class is then correctly referenced in the main() method,
    printing 50 at runtime.
*
*/
public class HiddingProperty {
    static class Speedster {
        int numSpots;
    }

   static  class Cheetah extends Speedster {
        int numSpots;

        public Cheetah(int numSpots) {
            // INSERT CODE HERE
            super.numSpots = numSpots;
        }
    }

    public static void main(String[] args) {
        Speedster s = new Cheetah(50);
        System.out.print(s.numSpots);
    }
}