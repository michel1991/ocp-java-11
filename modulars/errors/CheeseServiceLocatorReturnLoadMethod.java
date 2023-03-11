package modulars.errors;
import java.util.function.*;
import java.util.stream.*;
import java.util.*;
import java.util.ServiceLoader.Provider;

class Mouse{
    static void favoriteFood(){

    }
}

public class CheeseServiceLocatorReturnLoadMethod {
    /**
     * Fill in the blank with code to look up and call a service.
        A. Mouse.get()
        B. Mouse::get
        C. Provider.get()
        D. Provider::get
        E. None of the above

        The ServiceLoader class has a load() method that returns a Collection of Provider, not a stream.
        Since the call to stream() is missing, option E is the answer.
        If the call to stream() were added, option D would be the answer.

     */
  static void load(){
        String cheese = ServiceLoader.load(Mouse.class)
           .map((s -> s)) // ______________  correct line in question is  .map(______________)
           .map(Mouse::favoriteFood)
           .findFirst()
           .orElse("");

  }
}