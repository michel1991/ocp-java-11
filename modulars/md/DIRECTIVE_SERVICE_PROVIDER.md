##### Suppose the consumer, service locator, service provider, and
##### service provider interface are each in separate modules.
##### Which of the following best describes the following module-info file?

``` java
    module nature.tree{
        requires nature.sapling;
        provides nature.sapling.Tree with nature.tree.Maple
    }
```


* A. Consumer
* B. Service locator
* C. Service provider
* D. Service provider interface
* E. None of the above

Option C is correct because a service provider requires the interface.
It also provides the implementation.


#### Why is this module-info incorrect for a service provider?

```java

    module plant.flower {
        exports plant.flower.impl;
        requires plant.flower.api;
        provides plant.flower.api.Petal
        with plant.flower.impl.PetalImpl;
    }
```

* A. The exports directive should be export.
* B. The exports directive should not be present because all calls to the service provider should use the service locator.
* C. The provides directive should be uses instead.
* D. The provides directive has the implementation and interface in the wrong order.
* E. The requires directive should be exports instead.
* F. The requires directive should not be present because provides implies it.

Option B is correct because a service provider
should not contain an exports directive.
The service locator is used to reference any implementation exposed by provides.
