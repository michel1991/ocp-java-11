package operations;
public class Overflow {
    /**
    * What is the result of executing the following code snippet? (Choose all that apply.)
    *   A. start is 0
        B. start is -128
        C. start is 127
        D. end is 8
        E. end is 11
        F. end is 12
        G. The code does not compile.
        H. The code compiles but throws an exception at runtime

        The code compiles and runs successfully, so options G and H are incorrect.
        On line 5, the pre-increment operator is executed first, so start is incremented to 8, and the new value is returned as the right side of the expression.
        The value of end is computed by adding 8 to the original value of 4, leaving a new value of 12 for end, and making option F a correct answer.
        On line 6, we are incrementing one past the maximum byte value.
        Due to overflow, this will result in a negative number, making option B the correct answer.
        Even if you didn’t know the maximum value of byte, you should have known the code compiles and runs and looked for the answer for start with a negative number.
     */
    static void calculate(){
        int start = 7; //  3:
        int end = 4; // 4:
        end += ++start; //  5:
        start = (byte)(Byte.MAX_VALUE + 1); //   6:
        System.out.println(" start is " +start);
        System.out.println(" end is " +end);
    }

    public static void main(String... args){
        calculate();
    }
}