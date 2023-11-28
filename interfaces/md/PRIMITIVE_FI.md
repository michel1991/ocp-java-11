#### Which of the following standard functional interfaces is most suitable to process
#### a large collection of int primitives and return processed data for each of them?

* A. Function<Integer>
* B. IntFunction
* C. Consumer<Integer>
* D. IntConsumer
* E. Predicate<Integer>
    
Using the regular functional interfaces by parameterizing
them to Integer is inefficient as compared to using specially designed interfaces
for primitives because they avoid the cost of boxing and unboxing the primitives.
Now, since the problem statement requires something to be returned after processing each int,
you need to use a Function instead of a Consumer or a Predicate.
Therefore, IntFunction is most appropriate in this case.
(Correct B )
            