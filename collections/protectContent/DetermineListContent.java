package collections.protectContent;
import java.util.*;
public class DetermineListContent {

    /**
    *  Which statements about the following code snippet are correct? (Choose all that apply.)
        A. The data type of koko is String.
        B. The data type of koko is Object.
        C. The data type of albert is Object.
        D. The data type of albert is undefined.
        E. The data type of ham is Integer.
        F. The data type of ham is Object.
        G. None of the above, as the code does not compile

    he code does compile, making option G incorrect.
    In the first for-each loop, gorillas has a type of ArrayList<String>,
    so each element koko has a type of String, making option A correct.
    In the second for-each loop, you might think that the diamond operator <>
    cannot be used with var without a compilation error, but it absolutely can.
    This result is monkeys having a type of ArrayList<Object> w
    ith albert having a data type of Object, making option C correct.
    While var might indicate an ambiguous data type,
    there is no such thing as an undefined data type in Java, so option D is incorrect.
    In the last for-each loop, chimpanzee has a data type of List.
    Since the left side does not define a generic type,
    the compiler will treat this as List<Object>,
    and ham will have a data type of Object, making option F correct.
    Even though the elements of chimpanzees might be Integer as defined,
    ham would require an explicit cast to call an Integer method,
    such as ham.intValue().

     */
  static void firstExample(){
      List<String> gorillas = new ArrayList<>();
      for(var koko : gorillas)
          System.out.println(koko);

      var monkeys = new ArrayList<>();
      for(var albert : monkeys)
          System.out.println(albert);

      List chimpanzees = new ArrayList<Integer>();
      for(var ham : chimpanzees)
          System.out.println(ham);
  }

    public static void main(String... args){
        firstExample();
    }
}