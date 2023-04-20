###### Suppose module puppy depends on module dog
###### and module dog depends on module animal.
###### Which two lines allow module puppy to access
###### the animal.behavior package in module animal? (Choose two.)
```java
module animal {
    exports animal.behavior to dog;
}
module dog {
    _______ animal;  // line S
}
module puppy {
    _______ dog;     // line T
}
```
* A. require on line S
* B. require on line T
* C. requires on line S
* D. requires on line T
* E. require transitive on line S
* F. require transitive on line T
* G. requires transitive on line S
* H. requires transitive on line T

Options A, B, E, and F are incorrect because they refer to keywords that don’t exist.
The requires transitive keyword is used when specifying a module to be used
by the requesting module and any other modules that use the requesting module.
Therefore, dog needs to specify the transitive relationship, and option G is correct.
The module puppy just needs to require dog,
and it gets the transitive dependencies, making option D correct.

##### Suppose module puppy depends on module dog
##### and module dog depends on module animal.
##### Which fills in the blank to allow module puppy
##### to access the animal.behavior package in module animal?

```java
    module animal {
        //__________________________
    }
    
    module dog {
        requires transitive animal;
    }
    module puppy {
        requires dog;
    }

```
* A. export animal.behavior for dog;
* B. export animal.behavior for puppy;
* C. export animal.behavior to dog;
* D. export animal.behavior to puppy;
* E. exports animal.behavior for dog;
* F. exports animal.behavior for puppy;
* G. exports animal.behavior to dog;
* H. exports animal.behavior to puppy;

Options A, B, C, and D are incorrect because the keyword is exports, not export.
Options E and F are incorrect because you export a package to a module.
Options G and H both are syntactically correct.
However, option H would require the puppy module to require the animal module.
Since it does not, option G is correct.

#### Suppose module puppy depends on module dog
#### and module dog depends on module animal.
#### Which two lines allow module puppy to access
#### the animal.behavior package in module animal? (Choose two.)
```java
    module animal {
        exports animal.behavior to dog;
    }
    module dog {
        _______ animal;  // line S
    }
    module puppy {
        _______ dog;     // line T
    }
    
```
* A. require on line S
* B. require on line T
* C. requires on line S
* D. requires on line T
* E. require transitive on line S
* F. require transitive on line T
* G. requires transitive on line S
* H. requires transitive on line T

Options A, B, E, and F are incorrect because they refer to keywords that don’t exist.
The requires transitive keyword is used when specifying a module to be used by
the requesting module and any other modules that use the requesting module.
Therefore, dog needs to specify the transitive relationship, and option G is correct.
The module puppy just needs to require dog,
and it gets the transitive dependencies, making option D correct.