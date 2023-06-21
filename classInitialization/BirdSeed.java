package classInitialization;



/**
   Which code can be inserted to have the code print 2?

    A. Replace line 1 with BirdSeed(2);.
    B. Replace line 2 with BirdSeed(2);
    C. Replace line 1 with new BirdSeed(2);
    D. Replace line 2 with new BirdSeed(2);
    E. Replace line 1 with this(2);
    F. Replace line 2 with this(2);
    G. The code prints 2 without any changes.

    Options A and B will not compile because constructors cannot be called without new.
    Options C and D will compile but will create a new object rather than setting the fields in this one.
    The result is the program will print 0, not 2, at runtime. Calling an overloaded constructor,
    using this(), or a parent constructor, using super(),
    is only allowed on the first line of the constructor,
    making option E correct and option F incorrect.
    Finally, option G is incorrect because the program prints 0 without any changes, not 2.

 */
public class BirdSeed {
    private int numberBags;
    boolean call;

    public BirdSeed() {
        // LINE 1
        this(2); // response
        call = false;
        // LINE 2
    }

    public BirdSeed(int numberBags) {
        this.numberBags = numberBags;
    }

    public static void main(String[] args) {
        BirdSeed seed = new BirdSeed();
        System.out.print(seed.numberBags);
    } }
