package enums.errors;

/**
  How many lines of the following program do not compile?
    A. Zero
    B. One
    C. Two
    D. Three
    E. More than three

    Line 3 does not compile because printColor() is marked final and cannot be overridden.
    Line 5 does not compile because the method toSpectrum()
    is marked abstract and must be overridden by each enum value.
    Finally, line 6 does not compile because enum constructors are implicitly private.
    For these three reasons, option D is correct.

 */
 enum Color { // 1:
     RED(1,2) { void toSpectrum() {} }, // 2:
    BLUE(2) { void toSpectrum() {} void printColor() {} }, // 3:
    ORANGE() { void toSpectrum() {} }, // 4:
    GREEN(4);  // 5:
    public Color(int... color) {} // 6:
    abstract void toSpectrum(); //  7:
    final void printColor() {} //   8:
 } //  9:
public class ColorWithVarargsInConstructors {

}