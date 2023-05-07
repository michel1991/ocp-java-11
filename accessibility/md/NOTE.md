#### before answer
 * checking class scope
 * checking constructor scope
 * checking member scope
 * no argument constructor is public
 * identify member property with (package-private, protected) that cause you problem
 * checking constructor inheritance
 
 ### My  Rule Protected in Different package 
 * prior static analysis at the left side(1)
 * While Reference type(at left) is current Reference type of current child it is ok for method that hold accessibility protected
 
 ### Simple ruler work very well with ( My  Rule Protected in Different package )
 * same package => package private, protected, public
 * different package ==> protected, public