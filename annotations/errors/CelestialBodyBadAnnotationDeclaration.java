package annotations.errors;
import java.lang.annotation.*;

/**
 *  Fill in the blank with the correct annotation usage that allows the code to compile.
    A. @CelestialBody(name="Venus")
    B. @CelestialBody(name="Pluto",size=2,lightYears=5)
    C. @CelestialBody(lightYears=10)
    D. @CelestialBody("Jupiter")
    E. @CelestialBody(size=3)
    F. None of the above

    CelestialBody is not an annotation definition because
    it is not declared with the @interface type, making option Fcorrect.
    If the correct declaration was used,
    then option A would be the correct answer.
    Options B and C are incorrect, because lightYears
    is a constant and cannot be set as part of the annotation.
    Options C and E are also incorrect because they are missing a nameelement.
    Option D is incorrect because there is no value()element.
 */

 interface CelestialBody {
    String name();
    double size() default 100;
    int lightYears = 2;
}

// _________________ class Planet {}
 class Planet {} // _________________ To put before
public class CelestialBodyBadAnnotationDeclaration {

}