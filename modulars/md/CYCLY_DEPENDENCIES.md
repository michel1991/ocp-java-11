##### How many modules are part of the cyclic dependency?
``` java
    module com.light {
        exports com.light;
    }
    module com.animal {
        exports com.animal;
        requires com.light;
        requires com.plant;
    }
    module com.plant {
        exports com.plant;
        requires com.light;
        requires com.animal;
    }
    module com.worm {
        exports com.worm;
        requires com.light;
        requires com.animal;
        requires com.plant;
    }

```

* A. 0
* B. 1
* C. 2
* D. 3
* E. 4

The com.light module does not have any dependencies,
so it is fine. However, com.animal and com.plant
depend on each other giving us a cyclic dependency.
Finally, com.worm depends on all the modules but
does not introduce any more problems.
It will not compile until com.animal or com.plant are fixed,
but is not part of the cycle itself. Option C is correct,
since only two modules are part of the cycle.

##### How many modules are part of the cyclic dependency?
``` java
    module.com.light {
        exports com.light;
    }
    module com.plant {
        exports com.plant;
        requires com.light;
        requires com.animal;
    }
    module com.animal {
        exports com.animal;
        requires com.light;
    }
    module com.worm {
        exports com.worm;
        requires com.light;
        requires com.animal;
        requires com.plant;
    }
```

* A. 0
* B. 1
* C. 2
* D. 3
* E. 4

The com.light module is a dependency for all the other modules but does not depend on them.
Similarly, the com.animal module is a dependency
for the two higher-level modules but does not depend on them.
Finally, the com.plant module is a dependency for the com.worm module but does not depend on it.
While the modules are not defined in this order,
the question is about cyclic dependencies rather
than order of compilation. There is no cyclic dependency, making option A correct.

#### Suppose you have these two JARs from Java 8. Which steps,
#### when taken together, would be the best way to make them modules? (Choose two.)
[image](images/cyclic_dependency_baby_otter_food_fish.jp)
* A. Add a module-info.java to each.
* B. Add them to the classpath.
* C. Create a third module to contain the common code.
* D. Merge them into one module to break the cyclic dependency.
* E. Rename the modules to use dashes instead of dots.


Option A is correct, and option B is incorrect as we want to create named modules when possible.
We also need to be on the lookout for cyclic dependencies.
While option D would work, it is better to be more granular
and create a third module as in option C.
Option E is incorrect because dots are used as separators in names.