package inheritance.casting;

/**
 * What is the output of the following application?
    A. 5
    B. The code does not compile due to an invalid cast.
    C. The code does not compile for a different reason.
    D. The code compiles but throws a ClassCastException at runtime.
    
    Although the casting is a bit much, the object in question is a SoccerBall.
    Since SoccerBall extends Ball and implements Equipment,
    it can be explicitly cast to any of those types, so no compilation error occurs.
    At runtime, the object is passed around and, due to polymorphism,
    can be read using any of those references since the underlying object is a SoccerBall.
    In other words, casting it to a different reference variable
    does not modify the object or cause it to lose its underlying SoccerBall information.
    Therefore, the code compiles without issue, and option A is correct

 */
 abstract class Ball {
    protected final int size;
    public Ball(int size) {
        this.size = size;
    }
}
interface Equipment {}
 class SoccerBall extends Ball implements Equipment {
    public SoccerBall() {
        super(5);
    }
    public Ball get() { return this; }
    public static void main(String[] passes) {
        var equipment = (Equipment)(Ball)new SoccerBall().get();
        System.out.print(((SoccerBall)equipment).size);
    }
}

public class SoccerBallAlwaysWorkWithInterface {
    public static void main(String[] passes) {
        SoccerBall.main(passes);
    }
}