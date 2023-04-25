##### On a DoubleStream, how many of the methods average(),
##### count(), max(), and sum() return an OptionalDouble?
* A. None
* B. One
* C. Two
* D. Three
* E. Four

The average() method returns an OptionalDouble.
This reflects that it doesn’t make sense to calculate
an average when you don’t have any numbers.
Similarly, max() returns an OptionalDouble
because there isn’t a maximum of no number.
By contrast, counting without any numbers gives
the long number 0 and summing gives the double number 0.0.
Since only two methods matches the desired return type, option C is correct.

#### Which method is not available on the IntSummaryStatistics class?
* A. getCountAsLong()
* B. getMax()
* C. toString()
* D. None of these methods is available.
* E. All of these methods are available.

Option A is the answer because there is a getCount()
method that returns a long rather than a method named getCountAsLong().
Option B is incorrect because there is in fact a getMax() method.
Option C is incorrect because toString() is declared on Object,
which means it is inherited by all classes.