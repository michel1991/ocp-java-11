package enums.errors;

/**
 * What is the output of the following application?
    A. 1
    B. 2
    C. 12
    D. The code does not compile.
    E. The code compiles but throws an exception at runtime.
    F. None of the above.
    
 The case statements incorrectly use the enum name as well as the value,
 such as DaysOff.ValentinesDay. Since the type of the enum is determined
 by the value of the variable in the switch statement, the enum name is
 not allowed and causes a compilation error when used. For this reason, option D is correct.
 If the enum name DaysOff was removed, the application would output 12,
since the lack of any break statements causes multiple blocks to be reached,
 and option C would have been the correct answer
 */
enum DaysOff {
    Thanksgiving, PresidentsDay, ValentinesDay
}
public class Vacation {
    public static void main(String... unused) {
        final DaysOff input = DaysOff.Thanksgiving;
        switch(input) {
            default:
                case DaysOff.ValentinesDay:
                    System.out.print("1");
                    case DaysOff.PresidentsDay:
                        System.out.print("2");
        }
    }
}
