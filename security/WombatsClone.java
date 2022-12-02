package security;
import java.util.*;

class Wombats{
    List names ;

    List getNames(){
        return names;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}


public class WombatsClone {

  /**
    * The following code prints false. What is true about the clone() method?
      A. It creates a deep copy.
      B. It creates a narrow copy.
      C. It creates a shallow copy.
      D. It creates a wide copy.

       A shallow copy does not create copies of the nested objects, making option C incorrect.
       Options B and D are incorrect because narrow and wide copies are not terms.
       Option A is the answer because a deep copy does copy the nested objects.
       In this case, a new List is created in cloned, containing the same contents and making it a different object than the List in original.
   */
  static void returnFalseDeepCopy() throws CloneNotSupportedException{
      Wombats original = new Wombats();
      original.names = new ArrayList<>();
      Wombats cloned = (Wombats) original.clone();
      System.out.println(original.getNames() == cloned.getNames());

   }

    /**
    *  The following code prints true. What is true about the Wombats class implementation of the clone() method?
        A. It creates a deep copy.
        B. It creates a narrow copy.
        C. It creates a shallow copy.
        D. It creates a wide copy.

        A shallow copy does not create copies of the nested objects, making option C correct.
        Options B and D are incorrect because narrow and wide copies are not terms.
        Option A is incorrect because a deep copy does copy the nested objects.
     */
    static void returnTrueShallowCopy() throws CloneNotSupportedException{
          Wombats original = new Wombats();
          original.names = new ArrayList<>();
          Wombats cloned = (Wombats) original.clone();
          System.out.println(original.getNames() == cloned.getNames());

    }

    public static void main(String... args) throws CloneNotSupportedException{
       returnFalseDeepCopy();
       returnTrueShallowCopy();
    }

}