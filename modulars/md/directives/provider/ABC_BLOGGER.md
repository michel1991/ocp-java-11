### Given:

```
module abc.blogger {
    requires serviceapi;
    provides api.BloggerService with abc.SimpleBlogger;
}
```


Which of the following code fragments appearing in another module correctly loads a service provider that implements api.BloggerService?

* A. BloggerService blogger = BloggerService.getInstance();

* B.
  
```
    ServiceLoader<BloggerService> bsLoader = ServiceLoader.load(BloggerService.class);
    BloggerService bs = bsLoader.findFirst();
```

findFirst() returns an Optional. The following would be valid:
Optional<BloggerService> bs = bsLoader.findFirst();

* C. api.BloggerService bloggerServiceRef = abc.SimpleBlogger()
The module that uses a service is not even aware of the actual implementation class of the service.
So, it cannot directly instantiate the implementing class.

* D. api.BloggerService bloggerServiceRef = ServiceLoader.get(abc.SimpleBlogger.class)

* E.
   ```
    ServiceLoader<BloggerService> bsLoader = ServiceLoader.load(BloggerService.class);
    bsLoader.forEach(bs->bs.blog("hello"));
    (Assuming that BloggerService has a blog(String ) method.)
   ```

    ServiceLoader implements Iterable and Iterable has forEach(Consumer<? super T> action) method.

________
  The right way to load a service providers is as follows:
    java.util.ServiceLoader<BloggerService>
            bsLoader = java.util.ServiceLoader.load(BloggerService.class);
    
Once you have the service providers, you can iterate through them like this
(ServiceLoader implements Iterable and so, it can be used in an enhanced for loop):
   ```
     for (BloggerService bs : bsLoader){
                bs.blog("Hello from textbook");
        }
        
  ```

You can also pick the first provider like this:
 
```
   Optional<BloggerService> bs1 = bsLoader.findFirst();
    bs1.ifPresent(bs->bs.method());
``` 

Correct(E)