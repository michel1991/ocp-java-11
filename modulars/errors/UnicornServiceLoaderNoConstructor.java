package modulars.errors;
import java.util.function.*;
import java.util.stream.*;
import java.util.*;
import java.util.ServiceLoader.Provider;

class  Unicorn{

}


public class UnicornServiceLoaderNoConstructor{
    /**
    * Which of the following compiles and is equivalent to the commented-out code loop?
         A.
            List<Unicorn> all  = loader.load(Unicorn.class)
            .getStream()
            .collect(Collectors.toList());

        B.
            List<Unicorn> all  = loader.load(Unicorn.class)
            .stream()
            .collect(Collectors.toList());

        C.
            List<Unicorn> all  = loader.load(Unicorn.class)
            .getStream()
            .map(Provider::get)
            .collect(Collectors.toList());

        D.
            List<Unicorn> all  = loader.load(Unicorn.class)
            .stream()
            .map(Provider::get)
            .collect(Collectors.toList());

        E. None of the above

      This is a trick question. Option E is correct because the code provided in the question does not compile.
      There is no public constructor. Instead, the code should have called ServiceLoader.load(Unicorn.class).
    */
  static void currentAWayUse(){
      List<Unicorn> all  = new ArrayList<>();
      ServiceLoader loader = new ServiceLoader();
      // for (Unicorn current : loader.load(Unicorn.class))
      //   all.add(current);
  }
}