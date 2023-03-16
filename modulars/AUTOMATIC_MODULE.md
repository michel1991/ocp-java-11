##### Suppose we have the two JARs in the diagram on the module path
##### and the module-info in the com.magic jar only exports one package: com.magic.unicorn.
##### There is no module-info file in the com.science JAR.
#### How many of the four packages in the diagram can a third module on the module path access?
[image](images/com.magic.unicorn_com.magic.jpg)
* A. 0
* B. 1
* C. 2
* D. 3
* E. 4

The com.magic module exports only one package.
This makes the com.magic.unicorn package accessible, but not the com.magic.dragon package.
Both packages in com.science are accessible because it is an automatic module.
When a module on the module path does not contain a module-info file,
all packages are exported. This gives us three packages that are accessible and a correct answer of option D.

### Given the diagram, which is an automatic module?
[image](images/dog.hair_automatic_module.jpg)
* A. dog.bark
* B. dog.fluffy
* C. dog.hair
* D. dog.husky
* E. None of the above

An automatic module must be on the module path but does not contain a module-info file.
Option C is correct because dog.hair matches this description.