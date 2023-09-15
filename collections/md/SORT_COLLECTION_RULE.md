##### How many of these allow inserting null values: ArrayList, LinkedList, HashSet, and TreeSet?
* A. 0
* B. 1
* C. 2
* D. 3
* E. 4

TreeSet does not allow null values because it needs to compare the values.
While HashSet does call hashCode(), it knows to skip that call if the value is null.
ArrayList and LinkedList do not make method calls on their contents.
Three of the four allow inserting null values, making option D the answer.