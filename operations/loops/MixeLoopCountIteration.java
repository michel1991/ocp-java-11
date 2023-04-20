package operations;

public class MixeLoopCountIteration {
    /**
     * Which of the following iterates a different number of times than the others?
        A. for (int k=0; k ˂ 5; k++) {}
        B. for (int k=1; k ˂= 5; k++) {}
        C. int k=0; do { } while(k++ ˂ 5);
        D. int k=0; while (k++ ˂ 5) {}
        E. All of these iterate the same number of times.

      Option A goes through five indexes on the iterations: 0, 1, 2, 3, and 4.
      Option B also goes through five indexes: 1, 2, 3, 4, and 5.
      Option D goes through five iterations as well, from 0 to 4.
      However, option C goes through six iterations since
      the loop condition is at the end of the loop.
      Therefore, it is not like the others, and option C is the correct answer.
     */
   public static void main(String... args){
        for (int k=0; k < 5; k++) {
            System.out.println("first" +k);
        }
        System.out.println();
        for (int k=1; k <= 5; k++) {    System.out.println("first " +k);}
        System.out.println();
        int k=0; do {  System.out.println("third " +k);  } while(k++ < 5);
        System.out.println();
        int k2=0; while (k2++ < 5) {  System.out.println("last " +k2);}
   }
}