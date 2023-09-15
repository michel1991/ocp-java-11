##### Suppose we have the packages in the diagram.
##### What could we add to the module-info.java in com.duck
##### to allow the com.park module to reference the Duckling
##### class but not allow the com.bread module to do the same?

[image](images/com.duck_com.park.jpg)
*  A. exports com.duckling;
*  B. exports com.duckling from com.park;
*  C. exports com.duckling to com.park;
*  D. exports com.park from com.duckling;
*  E. exports com.park to com.duckling;
*  F. None of the above

Option A is incorrect because it exports the package to all modules.
Option C is correct because it limits package sharing to the com.park module.
Option E is incorrect because a package must be exported from the module that contains it.
Options B and D are incorrect because from is not valid syntax.