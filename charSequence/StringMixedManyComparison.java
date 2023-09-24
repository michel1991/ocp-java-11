package charSequence;

public class StringMixedManyComparison {
    
    /**
      How many of these variables are true?
        A. One.
        B. Two.
        C. Three.
        D. Four.
        E. Five.
        F. None. The code does not compile.
        
        The variables smiley and smirk are both false ,since a String should
        be compared with a method rather than ==, especially
        when not comparing two values from the string pool.
        The variable blush is also false because one value
        is uppercase and the other is lowercase.
        The variable cool is true because both values are uppercase.
        Finally, the variables wink and yawn print true because
        they don’t look at the case. This makes option C the answer.

     */
    public static void main(String... args){
        var lol = "lol";
        var smiley = lol.toUpperCase() == lol;
        var smirk = lol.toUpperCase() == lol.toUpperCase();
        var blush = lol.toUpperCase().equals(lol);
        var cool = lol.toUpperCase().equals(lol.toUpperCase());
        var wink = lol.toUpperCase().equalsIgnoreCase(lol);
        var yawn = lol.toUpperCase().equalsIgnoreCase(
                lol.toUpperCase());
        
    }
}