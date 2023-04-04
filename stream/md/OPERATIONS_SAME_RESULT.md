##### Which stream operations produce consistent results when operated on an ordered stream,
##### regardless of whether it is serial or parallel? (Choose all that apply.)
*  A. limit()
*  B. skip()
*  C. findAny()
*  D. forEachOrdered()
*  E. forEach()
*  F. map()
*  G. findFirst()

The limit(), skip(), forEachOrdered(), and findFirst() methods produce the same results,
regardless of whether the stream is serial or parallel.
There may be a performance cost with using them on a parallel stream,
though, as the stream is forced into a single-threaded operation.
While the findAny() operation often returns the first result on a serial stream,
it is permitted to return any result in the stream even on serial streams.
The forEach() and map() operations are executed concurrently
in a parallel stream, possibly changing the expected results.

##### Five of the following six methods always produce the same
##### result whether they are executed on an ordered serial
##### or parallel stream. Which one does not?
* A. findAny()
* B. findFirst()
* C. limit()
* D. skip()
* E. anyMatch()
* F. count()

The findAny() method can return the first, last, or any element of the stream,
regardless of whether the stream is serial or parallel.
While on serial streams this is likely to be the first element in the stream,
on parallel streams the result is less certain.
For this reason, option A is the correct answer.
The anyMatch() and count() methods produce the same result,
regardless of whether the stream is serial or parallel.
The rest of the operations force the stream to behave
in a sequential manner when applied to an ordered stream,
even if it is parallel.
Note that the behavior is not the same on an unordered stream.
For example, findFirst() can return any element when applied to an unordered stream.

##### Which statements about the findAny() method applied to a stream are correct? (Choose three.)
* A. It always returns the first element on an ordered serial stream.
* B. It may return any element on an ordered serial stream.
* C. It always returns the first element on an unordered stream.
* D. It may return any element on an unordered stream.
* E. It always returns the first element on an ordered parallel stream.
* F. It may return any element on an ordered parallel stream.

The findAny() method is capable to return any element of the stream regardless of whether it is serial,
parallel, ordered, or unordered.
For this reason, options B, D, and F are correct.
Option C is actually invalid, as an unordered stream does not have a first element.

