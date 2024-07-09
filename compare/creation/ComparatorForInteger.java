package compare.creation;
import java.util.*;
import java.util.stream.*;

/**
   Which of the following are valid implementations of java.util.Comparator?
   
     A.  Comparator<Integer> cin = new Comparator<Integer>(){
        public int compareTo(Integer i1, Integer i2){
            return i1 - i2;
        }
    };
    The method name should be compare instead of compareTo.
    
    B. var cin = new Comparator<Integer>(){
        public int compare(Integer i1, Integer i2){
            return i1 - i2;
        }
    };
    
    C.
      var cin = new Comparator<Integer>(){
        public int compareTo(Integer i1, Integer i2){
            return i1 - i2;
        }
    };
    
    D.  Comparator<Integer> cin = (i1, i2)-> i1-i2;
    
    E.
      Comparator<Integer> cin = new Comparator<?>(){
        public int compare(Integer i1, Integer i2){
            return i1 - i2;
        }
    };
    Comparator<?> is invalid.
    
   F. var cin = new Comparator<Integer>(){
        public int compare(Integer i1, Integer i2){
            return i1.compareTo(i2);
        }
    };
   
   When the class of the objects that you want to compare does not implement java.lang.Comparable
   interface (which has one method named int compareTo(T t)), or when you want to compare the objects
   using some other comparison criteria than the one implemented by its compareTo method,
   you can use Collections.sort(List, java.util.Comparator) method.
   This method allows you to pass your own custom Comparator to compare the objects. java.util.Comparator
   is a functional interface with one abstract method:

        int compare(T o1, T o2) : Compares its two arguments and returns  a negative integer, zero, or a positive integer
        if the first argument is less than, equal to, or greater than the second.
        
        Comparator has several static and instance methods that return various kinds of Comparators.
        Please see the JavaDoc to know more. The important ones for the exam are: reversed, comparing, and thenComparing.
   Correct(B, D, F)

   


 */
public class ComparatorForInteger {
    public static void responseB(){
        var cin = new Comparator<Integer>(){
            public int compare(Integer i1, Integer i2){
                return i1 - i2;
            }
        };
    }
    
    public static void responseD(){
        Comparator<Integer> cin = (i1, i2)-> i1-i2;
    }
    
    public static void responseF(){
        var cin = new Comparator<Integer>(){
            public int compare(Integer i1, Integer i2){
                return i1.compareTo(i2);
            }
        };
    }
    
    public static void main(String... args){
        
    }
}