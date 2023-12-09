package modulars.codeOfLoad;
// package animal.insect.lookup; (initial in test)
//import animal.insect.api.bugs.Bug; (initial in test)
import java.util.function.*;
import java.util.stream.*;
import java.util.*;
import java.util.ServiceLoader.Provider;

/**
 * Which of the following code fragments correctly loads a service provider that implements api.BloggerService?

    A. Iterable<api.BloggerService> bsLoader = ServiceLoader.load(api.BloggerService.class);
         Remember that java.util.ServiceLoader implements java.util.Iterable.
    B. api.BloggerService bloggerServiceRef = ServiceLoader.load(api.BloggerService.class);
    C. api.BloggerService bloggerServiceRef =
              ServiceLoader<api.BloggerService>.load(api.BloggerService.class);
    D. ServiceLoader<api.BloggerService> bsLoader =
              new ServiceLoader<>(api.BloggerService.class);
    E. api.BloggerService bloggerServiceRef =
         java.util.service.Provider.getProvider(api.BloggerService.class);
         
   The right way to load a service providers is as follows:
    java.util.ServiceLoader<BloggerService>
             bsLoader = java.util.ServiceLoader.load(BloggerService.class);
    
    Once you have the service providers, you can iterate through them using an
    enhanced for loop (ServiceLoader implements Iterable and so, it can be used in an enhanced for loop) :
    
      for (BloggerService bs : bsLoader){
         bs.blog("Hello from textbook");
      }
    
    You can also pick the first provider like this:
        
           Optional<BloggerService> bs1 = bsLoader.findFirst();
        bs1.ifPresent(bs->bs.method());
           (Correct is A)
    
 */

class BloggerService{
    
}
public class BloggerServiceLoader{
    
    public static void main(String... args){
        Iterable<BloggerService> bsLoader = ServiceLoader.load(BloggerService.class);
    }
}