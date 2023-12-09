package modulars.codeOfLoad;
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

       The ServiceLoader class has a load() method that returns a Collection of Provider.
       Option D is correct because we need to convert the Provider into a Mouse.
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
    /**
       Which line of code belongs in a service locator?
            A. ServiceLoader loader = ServiceLoader.load();
            B. ServiceLoader loader = ServiceLoader.load(Mouse.class);
            C. ServiceLoader˂Mouse˃ loader = ServiceLoader.load();
            D. ServiceLoader˂Mouse˃ loader = ServiceLoader.load(Mouse.class);
            E. Mouse loader = ServiceLoader.load();
            F. Mouse loader = ServiceLoader.load(Mouse .class)

           The service locator contains a ServiceLoader
           call to look up the service loader.
           It takes the type of class it looked up
           as a parameter and returns a generic, making option D the correct answer.
     */
    static void loadWithOutStream(){
      ServiceLoader<Mouse> loader = ServiceLoader.load(Mouse.class);
    }
}