package encapsulation;

/**
 *  Given the following class, what should be inserted into
 * the two blanks to ensure the class data is properly encapsulated?
    A. private and getStuff
    B. private and isStuff
    C. public and getStuff
    D. public and isStuff
    E. None of the above
    
    The class data, stuff, is declared public, allowing
    any class to modify the stuff variable and making
    the implementation inherently unsafe for encapsulation.
    Therefore, there are no values that can be placed
    in the two blanks to ensure the class properly encapsulates its data,
    making option E correct. Note that if stuff were declared private,
    options A, B, C, and D would all be correct.
    Encapsulation does not require any specific method names,
    just that the internal attributes are protected
    from outside access, which all of these sets of values do achieve.
 */
public class Box {
    public String stuff;
    String  getStuff () { //  __________ String  __________()  (i put the  default value)
        return stuff;
    }

    public void setStuff(String stuff) {
        this.stuff = stuff;
    }
}