package annotations.errors;

/**
 *  How many lines of the following declaration contain a compiler error?
    A. None
    B. One
    C. Two
    D. Three
    E. Four
    F. Five

    Lines 3 and 6 do not compile because wrapper classes are not permitted as annotation element types.
    Line 5 does not compile because a constant must be declared with a value.
    For these reasons, option D is correct. The rest of the lines compile without issue.
 */
 @interface Thermometer { // 1:
    int minTemp(); //  2:
    Integer maxTemp() default 1; // 3:
    double[] color(); //  4:
    final String type; //  5:
    Boolean compact; //  6:
} // 7:


public interface ThermoterWrapperNotAllow {

}