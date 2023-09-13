package inheritance.errors.override;

/**
    Given that Short and Integer extend Number directly,
    what type can be used to fill in the blank
    in the following class to allow it to compile?

    A. Object
    B. Integer
    C. Short
    D. Number
    E. None of the above
    
    The play() method is overridden in Saxophone
    for both Horn and Woodwind, so the return type must be covariant with both.
     Object and Number do not work, because neither
     is a subclass of Integer or Short.
     As stated in the question text,
     both Integer and Short extend Number directly,
     so neither can be a subclass of the other.
     Therefore, nothing can fill in the blank
     that would allow this code to compile, and option E is correct.

 */
interface Horn {
    public Integer play();
}
abstract class Woodwind {
    public Short play() {
        return 3;
    }
}
public final class Saxophone extends Woodwind implements Horn {
    public Short play() { // _________  default value i put 
        return null;
    }
}


public class SaxophoneNotCovariantExist {
  
}