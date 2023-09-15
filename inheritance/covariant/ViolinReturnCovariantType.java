package inheritance.covariant;


/**
   Given that Integer and Long are direct subclasses of Number,
   what type can be used to fill in the blank in the following class to allow it to compile?
  
    A. Long
    B. Integer
    C. Long or Integer
    D. Long or Number
    E. Long, Integer, or Number
    F. None of the above
    
   The play() method is overridden in Violin for both MusicCreator and StringInstrument,
   so the return type must be covariant with both. Long is a subclass of Number,
   and therefore, it is covariant with the version in MusicCreator.
   Since it matches the type in StringInstrument,
   it can be inserted into the blank, and the code would compile.
   While Integer is a subclass of Number, meaning the override for MusicCreator is valid,
   it is not a subclass of Long used in StringInstrument.
   Therefore, using Integer would cause the code to not compile.
   Finally, Number is compatible with the version of the method in MusicCreator
   but not with the version in StringInstrument, because Number is a superclass of Long, not a subclass.
   For these reasons, Long is the only class that allows the code to compile,
   making option A the correct answer.
 */
interface MusicCreator { public Number play(); }
abstract class StringInstrument {
    public Long play() {return 3L;}
}
 class Violin extends StringInstrument 
implements MusicCreator {
    public Long play() { //  _________ 
        return null;
    }
}
public class ViolinReturnCovariantType {
  
}