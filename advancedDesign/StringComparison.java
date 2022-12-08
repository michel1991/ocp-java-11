package advancedDesign;

public class StringComparison {
    /**
    * Which of the following are output by this code? (Choose all that apply.)
        A. one
        B. two
        C. three
        D. four
        E. five
        F. The code does not compile.
        G. None of the above

    The code compiles fine. Line 3 points to the String in the string pool.
    Line 4 calls the String constructor explicitly and is therefore a different object than s.
    Lines 5 checks for object equality, which is true, and so prints one.
    Line 6 uses object reference equality, which is not true since we have different objects.
    Line 7 calls intern(), which returns the value from the string pool and is therefore the same reference as s.
    Line 8 also compares references but is true since both references point to the object from the string pool.
     Finally, line 9 is a trick. The string Hello is already in the string pool, so calling intern() does not change anything.
     The reference t is a different object, so the result is still false.
     */
  static void poolOfString(){
      var s = "Hello"; //  3:
      var t = new String(s); // 4:
      if ("Hello".equals(s)) System.out.println("one"); //  5:
      if (t == s) System.out.println("two"); //  6:
      if (t.intern() == s) System.out.println("three"); // 7:
      if ("Hello" == s) System.out.println("four"); // 8:
      if ("Hello".intern() == t) System.out.println("five"); //  9:
    }

    /**
    *  How many times is the word true printed?
        A. Once.
        B. Twice.
        C. Three times.
        D. Four times.
        E. Five times.
        F. Six times.
        G. The code does not compile.

      String literals are used from the string pool. This means that s1 and s2 refer to the same object and are equal.
      Therefore, the first two print statements print true.
      The concat() method forces a new String to be created making the third print statement print false.
      The intern() method reverts the String to the one from the string pool.
      Therefore, the fourth print statement prints true.
      The fifth print statement prints false because toString() uses a method to compute the value, and it is not from the string pool.
      The final print statement again prints true because equals() looks at the values of String objects.
      For more information, see Chapter 5.
     */
    static void poolOfStringJava(){
        var s1 = "Java";
        var s2 = "Java";
        var s3 = "Ja".concat("va");
        var s4 = s3.intern();
        var sb1 = new StringBuilder();
        sb1.append("Ja").append("va");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));
    }

    public static void main(String... args){
        poolOfString();
    }
}