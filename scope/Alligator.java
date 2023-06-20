package scope;

/**
 * What is the result of compiling and executing the following application?
    A. 0 1
    B. 1 1
    C. 1 2
    D. 2 2
    E. The code does not compile.
    F. The code compiles but produces an exception at runtime.
    
    The code compiles and runs without exception, making options E and F incorrect.
    The question is testing your knowledge of variable scope.
    The teeth variable is static in the Alligator class, meaning the same value is accessible from all instances of the class,
    including the static main() method. The static variable teeth is incremented each time the constructor is called.
    Note that the constructor uses this to access a static variable, which is bad practice, but allowed.
   Since teeth is a local variable within the snap() method, the argument value is used,
   but changes to the local variable do not affect the static variable teeth.
   The local variable teeth is not used after it is decremented,
   the decrement operation has no meaningful effect on the program flow or the static variable teeth.
   Since the constructor is called twice, with snap() executed after each constructor call,
   the output printed is 1 2, making option C the correct answer.
 */
class Alligator {
    static int teeth;
    double scaleToughness;
    public Alligator() {
        this.teeth++;
    }
    public void snap(int teeth) {
        System.out.print(teeth+" ");
        teeth--;
    }
    public static void main(String[] unused) {
        new Alligator().snap(teeth);
        new Alligator().snap(teeth);
    }
}

