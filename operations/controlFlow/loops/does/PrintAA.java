package operations.controlFlow.loops.does;
public class PrintAA {
    /**
    * Which statements, when inserted into the blank in the following code snippet, cause the code to print AA? (Choose all that apply.)
        A. break MOUNTAIN;
        B. break HILL;
        C. continue MOUNTAIN;
        D. continue HILL;
        E. The code does not compile because of line 9.
        F. The code does not compile because of line 16.
        G. None of the above as the code always produces an infinite loop at runtime

      The code compiles and does not produce an infinite loop at runtime, so options E, F, and G are incorrect.
      The s variable is appended with A as soon as it starts. The first time the if statement is executed, p is 0 and q is 1, so it evaluates to true.
      In this case, breaking the inner loop HILL is the same as if we continue the outer loop MOUNTAIN.
      In other words, options B and C are equivalent because there are no statements after the inner loop within the outer loop.
      If we do either of those options, we start the outer loop again and s is updated to AA.
      On the second evaluation of the if statement, p is 0, and q is 2.
      If we break the inner loop or continue the outer loop as we did before, the outer loop ends as q<2 is violated.
      For these reasons, options B and C are correct.
      Option A is incorrect, as breaking the outer loop MOUNTAIN causes the program to end after the first execution of the outer loop, and only print a single A.
      Option D is also incorrect.
      In the second iteration of the inner loop, p is 1, and q is 1, meaning line 11 is skipped and s is updated with a B, eventually printing ABA.

     */
    static void printAA(){
        System.out.println(" Begin  printAA");
        var s = new StringBuilder(); //  3:
        int q = 0; //  4:
        MOUNTAIN: do { //   5:
            s.append("A"); //   6:
            q++; // 7:
            int p = 1; //    8:
            HILL: for(p=0; p<2; p++) { //  9:
                if(p < q) //  10:
                    break HILL; // 11:   _____________________
                s.append("B"); // 12:
                p++; //  13:
            } //  14:
        } while (q<2); //   15:
        System.out.print(s.toString()); //  16:
        System.out.println(" End  printAA");

    }

    public static void main(String... args){
        printAA();
        System.out.println();  
    }
}