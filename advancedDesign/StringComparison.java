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

    public static void main(String... args){
        poolOfString();
    }
}