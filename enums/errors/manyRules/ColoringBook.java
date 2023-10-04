package enums.errors.manyRules;

/**
   What is the output of the following application?
    A. Painting: 00FF00
    B. One line of code does not compile.
    C. Two lines of code do not compile.
    D. Three lines of code do not compile.
    E. The code compiles but prints an exception at runtime.
    F. None of the above.
    
    Line 10 does not compile because line 9 is missing a semicolon(;)
    at the end of it. A semicolon is required after a list of enum
    values if the enum contains anything besides the list of values.
    Line 20 does not compile because the enum name is missing before
    the enum value green. For these two reasons, option C is correct.
 */
interface HasHue {String getHue();} // 1: 
 enum COLORS implements HasHue { // 2: 
    red { //  3:  
        public String getHue() {return "FF0000";} // 4: 
        }, green { //  5:
        public String getHue() {return "00FF00";} //  6:  
       }, blue { //  7: 
        public String getHue() {return "0000FF";} //  8:  
    } //  9:  
    private COLORS() {} //  10: 
} //   11: 
class Book { // 12: 
    static void main(String[] pencils) {} //  13:  
} // 14:
 public final class ColoringBook extends Book { // 15: with public modifier(final public )
    final void paint(COLORS c) { //   16: 
        System.out.print("Painting: "+c.getHue()); //    17:  
    } //   18: 
    final public static void main(String[] crayons) { //  19: 
        new ColoringBook().paint(green); //   20:   
    } // 21: 
} //  22:
