package modulars;
import java.util.stream.*;
import java.util.*;
import java.util.ServiceLoader.Provider;

/**
 *   Fill in the blank with code to look up and call a service.
       String cheese = ServiceLoader.load(Mouse.class)
       .stream()
       .map(______________)
       .map(Mouse::favoriteFood)
       .findFirst()
       .orElse("");

        A. Mouse.get()
        B. Mouse::get
        C. Provider.get()
        D. Provider::get
        E. None of the above

       The ServiceLoader class has a load() method that returns a Collection of Provider. Option D is correct because we need to convert the Provider into a Mouse.
 */
class Mouse{
    String favoriteFood(){
        return "OKOK";
    }
}


public class MouseLoadApiProvider {
  static void load(){
      String cheese = ServiceLoader.load(Mouse.class)
                                   .stream()
                                   .map(Provider::get) // ______________
                                   .map(Mouse::favoriteFood)
                                   .findFirst()
                                   .orElse("");
  }
}