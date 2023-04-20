package operations;
/**
   Which of these code snippets behaves differently from the others?
   D. All three code snippets do the same thing.

   Options A and C print one line if numChipmunks is 1, 2, or 3.
    Option B does not behave the same way if numChipmunks is 1 or 2.
    There is no break statement,
    so the case statements fall through, and more than one statement will be printed.
 */
public class SwitchIfChoiceDifferentBehavior {
    static void answerA(int numChipmunks){
        if (numChipmunks == 1)
            System.out.println("One chipmunk");
        if (numChipmunks == 2)
            System.out.println("Two chipmunks");
        if (numChipmunks == 3)
            System.out.println("Three chipmunks");

    }

    static void answerB(int numChipmunks){
        switch (numChipmunks) {
            case 1:  System.out.println("One chipmunk");
            case 2:  System.out.println("Two chipmunks");
            case 3:  System.out.println("Three chipmunks");
        }

    }

    static void answerC(int numChipmunks){
        if (numChipmunks == 1)
            System.out.println("One chipmunk");
        else if (numChipmunks == 2)
            System.out.println("Two chipmunks");
        else if (numChipmunks == 3)
            System.out.println("Three chipmunks");

    }
}