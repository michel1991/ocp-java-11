package operations.errors;

/**
  What is output by the following code? (Choose all that apply.)
    A. 4 1
    B. 5
    C. 5 tuna
    D. 5tuna
    E. 51tuna
    F. The code does not compile.

     Line 5 does not compile. This question is checking to see whether you are paying attention to the types.
     numFish is an int, and 1 is an int. Therefore, we use numeric addition and get 5.
     The problem is that we can’t store an int in a String variable.
     Supposing line 5 said String anotherFish = numFish + 1 + "";. In that case,
     the answer would be option A and option C.
     The variable defined on line 5 would be the string "5", and both output statements would use concatenation.
 */
 class Fish { // 1:
    public static void main(String[] args) { //    2:
        int numFish = 4; //     3:
        String fishType = "tuna"; //  4:
        String anotherFish = numFish + 1; //    5:
        System.out.println(anotherFish + " " + fishType); //     6:
        System.out.println(numFish + " " + 1); //    7:
    } } //  8:

public class FishAffectNumberToString {

}