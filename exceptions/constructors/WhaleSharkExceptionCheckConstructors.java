package exceptions.constructors;

/**
   How many constructors in WhaleSharkException compile in the following class?
    A. None
    B. One
    C. Two
    D. Three

  The Exception class contains multiple constructors, including one that takes Throwable,
  one that takes String, and a no-argument constructor.
  The first WhaleSharkException constructor compiles, using the Exception constructor that takes a String.
  The second WhaleSharkException constructor also compiles.
  The two statements, super() and new Exception(), actually call the same constructor in the Exception class,
  one after another.
  The last WhaleSharkException compiles with the compiler inserting the default no-argument constructor super(),
  because it exists in the Exception class.
  For these reasons, all of the constructors compile, and option D is the correct answer.
  
 */
 class WhaleSharkException extends Exception {
    public WhaleSharkException() {
        super("Friendly shark!");
    }

    public WhaleSharkException(String message) {
        super(new Exception(new WhaleSharkException()));
    }

    public WhaleSharkException(Exception cause) {}
}


public class WhaleSharkExceptionCheckConstructors {
  public static void main(String... args){
      
  }
}