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
so it is fine. However, com.animal and com.plant depend on each other giving us a cyclic dependency.
Finally, com.worm depends on all the modules but does not introduce any more problems.
It will not compile until com.animal or com.plant are fixed,
but is not part of the cycle itself. Option C is correct, since only two modules are part of the cycle.