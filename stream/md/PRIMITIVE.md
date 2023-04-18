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