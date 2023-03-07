### Why can’t String::charAt be used as a method reference within a Function?
*  A. Method references can only be used on static methods.
*  B. The charAt() method takes an int rather than Integer parameter.
*  C. The method reference is not compatible with Function.
*  D. The method reference syntax is illegal.
*  E. There is no charAt() method in the String class.
*  F. None of the above.

Option D is incorrect as the syntax is fine. Option E is incorrect because there is a charAt() instance method.
While option B is correct that the method takes in an int parameter,
autoboxing would take care of conversion for us if there were no other problems.
So, option B is not the answer either. Option A is not true because there are constructor and instance method references.
This method reference could be assigned to BiFunction˂String,Integer, Character˃.
However, it cannot be assigned to a Function. This makes option C the correct answer.