#### In Java, Strings are immutable. A direct implication of this is...

* A. You cannot call methods like "1234".replace('1', '9'); and expect to change the original String.
    Calling methods such as replace that seem to alter the given String
    do not actually alter the String at all. They create a new String with the required changes and return that new String.
    Remember that Strings are immutable.
* B. You cannot change a String object, once it is created.
* C. You can change a String object only by the means of its methods.
* D. You cannot extend String class.
    That's because it is final, not because it is immutable.
    You can have a final class whose objects are mutable.
* E. You cannot compare String objects.
    String class implements Comparable interface,
    which has the int compareTo(String ) method. So you can definitely compare two Strings.
(Correct A, B)