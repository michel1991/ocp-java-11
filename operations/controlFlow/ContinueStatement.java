package operations.controlFlow;

public class ContinueStatement {

    /**
     *  What is the output of the following code snippet?
        A. 0
        B. 1
        C. 2
        D. 3
        E. The code does not compile.
        F. None of the above.

        On the first iteration of the loop, stops[++count] evaluates to stops[1],
        while also setting count to 1.
        Since stops[1] is Monroe and it has six characters, the break is reached, and the loop stops.
        For this reason, 1 is printed, making option B correct.

     */
    static void firstExample(){
        int count = 0;
        var stops = new String[] { "Washington", "Monroe", "Jackson", "LaSalle" };
        while (count < stops.length)
            if (stops[++count].length() < 8)
                break;
        else continue;
        System.out.println(count);

    }
  
}