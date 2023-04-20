#### Suppose the consumer, service locator, service provider,
#### and service provider interface are each in separate modules.
#### Which of the following best describes the following module-info file?

```java
module nature.tree {
    requires nature.sapling;
    requires nature.bush;
}
```

* A. Consumer
* B. Service locator
* C. Service provider
* D. Service provider interface
* E. None of the above

Option A is correct because a consumer has two dependencies.
It requires both the service provider interface and the service locator.