import java.lang.annotation.*; // 1:

/**
* Which of the following lines of code do not compile? (Choose all that apply.)
*   A. Line 2.
    B. Line 3.
    C. Line 4.
    D. Line 5.
    E. Line 6.
    F. Line 7.
    G. All of the lines compile.

   Line 3 does not compile because the deprecated annotation should be written @Deprecated.
   There is a Javadoc @deprecated annotation, but that is not the same as the built-in Java annotation and is used only within a Javadoc comment.
   Line 4 also does not compile as the default value of an element must be non-null constant.
   Finally, line 6 does not compile as Integer is not one of the predefined types.
   An annotation must be a primitive, String, Class, enum, another annotation, or an array of these types.
   Note that line 5 does compile, as it uses an annotation as the type and declares a default value—in this case, an empty array.
 */
@interface Target{
   String[] value();
}

@Inherited // 2:
@deprecated @interface Movie { // 3:
    String title() default null; //   4:
    Target myTarget() default @Target({}); //  5:
    Integer score();  //  6:
    final static public long opening = 1; //  7:
} //   8:

public interface MovieChoiceInvalidLine{

}