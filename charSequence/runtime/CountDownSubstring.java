package charSequence.runtime;
/**
 *  What is the output of the following class?

    A. 2
    B. 3
    C. 4
    D. None of the above

    Line 4 creates a String of length 5. Since String is immutable,
    line 5 creates a new String with the value 1 and assigns it to builder.
    Remember that indexes in Java begin with zero,
    so the substring() method is taking the values from the fifth element through the end.
    Since the first element is the last element, there’s only one character in there.
    Then line 6 tries to retrieve the second indexed element.
    Since there is only one element, this gives a StringIndexOutOfBoundsException, and option D is correct.

 */

// 1: package rocket;
 class Countdown { // 2:
    public static void main(String[] args) { //  3:
        var builder = "54321"; //  4:
        builder = builder.substring(4); //   5:
        System.out.println(builder.charAt(2)); //    6:
    } //  7:
} //     8:

public class CountDownSubstring {
     public static void main(String[] args) {
         Countdown.main(args);
     }
}