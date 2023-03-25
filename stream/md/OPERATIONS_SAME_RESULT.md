### Which stream operations produce consistent results when operated on an ordered stream, regardless of whether it is serial or parallel? (Choose all that apply.)
*  A. limit()
*  B. skip()
*  C. findAny()
*  D. forEachOrdered()
*  E. forEach()
*  F. map()
*  G. findFirst()

The limit(), skip(), forEachOrdered(), and findFirst() methods produce the same results, regardless of whether the stream is serial or parallel.
There may be a performance cost with using them on a parallel stream, though, as the stream is forced into a single-threaded operation.
While the findAny() operation often returns the first result on a serial stream, it is permitted to return any result in the stream even on serial streams.
The forEach() and map() operations are executed concurrently in a parallel stream, possibly changing the expected results.