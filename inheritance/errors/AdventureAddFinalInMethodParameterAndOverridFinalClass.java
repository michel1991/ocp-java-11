package inheritance.errors;

/**
 * What is the output of the following application?
    A. 3
    B. 9
    C. 93
    D. The code does not compile because of line g1.
    E. The code does not compile because of line g2.
    F. None of the above.
    
    The program does not compile because Story is marked final,
    which means it cannot be extended by Adventure.
    If the final modifier were removed, the rest of the code would compile and print 93 at runtime.
 */
final class Story {
    void recite(int chapter) throws Exception {}
}
 class Adventure extends Story {
    final void recite(final int chapter) {  // g1
        switch(chapter) {                    // g2
            case 2: System.out.print(9);
            default: System.out.print(3);
        }
    }
    public static void main(String... u) {
        var bedtime = new Adventure();
        bedtime.recite(2);
    }
}
public class AdventureAddFinalInMethodParameterAndOverridFinalClass {
  
}