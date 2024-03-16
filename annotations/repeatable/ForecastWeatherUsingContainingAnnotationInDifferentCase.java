package annotations.repeatable;
import java.lang.annotation.*;

/**
  Assuming @Weather is a valid repeatable annotation that takes a String,
   with its associated containing type annotation @Forecast,
   which of the following can be applied to a type declaration? (Choose two.)

    A. @Forecast({"Storm","Cloudy"})
    B. @Forecast({@Weather("Storm"),@Weather("Cloudy")})
    C. @Weather("Storm") @Weather("Cloudy")
    D. @Weather({@Forecast("Storm"),@Forecast("Cloudy")})
    E. @Forecast("Storm") @Forecast("Cloudy")
    F. @Weather({"Storm","Cloudy"})

    @Weatheris the repeatable annotation, so it can be used twice on the same type declaration, making option C correct.
    A containing type annotation @Forecast takes an array of the repeatable annotation @Weather,
    making option B also correct.
    Options A and F are incorrect, as those represent an annotation that takes an array of String values.
    Option D and E are incorrect because the repeatable and containing type annotations are reversed.
 */
@interface Forecast{
    Weather[] value();
}

@Repeatable(Forecast.class)
@interface Weather{
 String value() default "";
}

public class ForecastWeatherUsingContainingAnnotationInDifferentCase {

@Weather("Storm")
@Weather("Cloudy")
 String weather;

@Forecast({@Weather("Storm"),@Weather("Cloudy")})
 String forecast;
}