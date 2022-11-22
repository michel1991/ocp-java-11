package generics;
public class ErrorBallSearchError<X> {

    /**
    * Which are true statements about this code? (Choose all that apply.)
    * A. catchBall() compiles.
    * B. dribbleBall() compiles.
    * C. fetchBall() compiles.
    * D. inflateBall() compiles.
    * E. spinBall() compiles.
    * F. throwBall() compiles.
    * G. In at least one of the methods, t and x are guaranteed to be the same type.
    *
    * The catchBall() and spinBall() methods do not compile because X is valid only for instance methods.
    *  We can eliminate options A and E. We can also eliminate option C because fetchBall() has the <X> in the wrong place.
    * It needs to be after the static keyword. The other methods all compile. Option G is correct because inflateBall() redefines X so the type on Ball is hidden.
    * This means both parameters refer to the same type.
    */
    public static <T> void catchBall(T t, X x) {}
    public <T> void dribbleBall(T t, X x) {}
    public <X> static void fetchBall(X t, X x) {}
    public <X> void inflateBall(X t, X x) {}
    public <T> static void spinBall(T t, X x) {}
    public static <X> void throwBall(X t, X x) {}
}