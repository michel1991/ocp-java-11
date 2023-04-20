package operations.loops;
public class ChoiceCorrectLoop {
    /**
    *  Given the following array, which code snippets print the elements in reverse order from how they are declared? (Choose all that apply.)
        A.
            int q = wolf.length;
            for( ; ; ){
            System.out.print(wolf[--q]);
            if(q==0) break;
            }
        B.
            for(int m=wolf.length-1; m>=0; --m)
            System.out.print(wolf[m]);
            C.
            for(int z=0; z<wolf.length; z++)
            System.out.print(wolf[wolf.length-z]);
        D.
            int x = wolf.length-1;
            for(int j=0; x>=0 && j==0; x--)
            System.out.print(wolf[x]);
        E.
            final int r = wolf.length;
            for(int w = r-1; r>-1; w = r-1)
            System.out.print(wolf[w]);
        F.
            for(int i=wolf.length; i>0; --i)
            System.out.print(wolf[i]);
        G. None of the above

       To print items in the wolf array in reverse order, the code needs to start with wolf[wolf.length-1] and end with wolf[0].
       Option A accomplishes this and is the first correct answer, albeit not using any of for loop structures, and ends when the index is 0.
       Option B is also correct and is one of the most common ways a reverse loop is written.
       The termination condition is often m>=0 or m>-1, and both are correct.
       Options C and F each cause an ArrayIndexOutOfBoundsException at runtime since both read from wolf[wolf.length] first,
        with an index that is passed the length of the 0-based array wolf.
        The form of option C would be successful if the value was changed to wolf[wolf.length-z-1].
        Option D is also correct, as the j is extraneous and can be ignored in this example.
        Finally, option E is incorrect and produces an infinite loop at runtime, as w is repeatedly set to r-1, in this case 4, on every loop iteration.
        Since the update statement has no effect after the first iteration, the condition is never met, and the loop never terminates.
     */
   static public final void choice(){
       char[] wolf = {'W', 'e', 'b', 'b', 'y'};

       int q = wolf.length;
       for( ; ; ){
           System.out.print(wolf[--q]);
           if(q==0) break;
       }

        System.out.println();

       for(int m=wolf.length-1; m>=0; --m)
           System.out.print(wolf[m]);

       System.out.println();

       int x = wolf.length-1;
       for(int j=0; x>=0 && j==0; x--)
           System.out.print(wolf[x]);

       System.out.println();
   }

    public static void main(String... args){
        choice();
    }
}