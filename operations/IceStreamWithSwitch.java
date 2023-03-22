package operations;

 /**
    What is the output of the following application?
    A. 1
    B. 2
    C. 3
    D. The code does not compile because var cannot be used in a switch statement.
    E. The code does not compile for another reason.
    F. None of the above.

    The code compiles without issue, so options D and E are incorrect.
    A var can be used in a switch statement, provided the underlying type resolves
    to a supported switch type. Next, notice there are no break statements.
    Once the matching case statement, 30, is reached, all remaining case statements will be executed.
    The variable eaten is increased by 1, then 2, then reduced by 1, resulting
    in a final value of 2, making option B the correct answer.
  */
class IceCream {
    public final static void main(String... args) {
        var flavors = 30;
        int eaten = 0;
        switch(flavors) {
            case 30: eaten++;
            case 40: eaten+=2;
            default: eaten--;
        }
        System.out.print(eaten);
    }
}

public class IceStreamWithSwitch {
    public final static void main(String... args) {
        IceCream.main(args);
    }
}