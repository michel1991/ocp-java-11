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

Option C is correct because a service provider requires the interface. It also provides the implementation.