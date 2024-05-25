
package sorts;
import java.util.*;


/**
 Consider the following code:
    //Assume appropriate imports
    class Person{
        String name;
        String dob;
        public Person(String name, String dob){
            this.name = name; this.dob = dob;
        }
    }
    public class SortTest {
        public static void main(String[] args) {
            ArrayList<Person> al = new ArrayList<>();
            al.add(new Person("Paul", "01012000"));
            al.add(new Person("Peter", "01011990"));
            al.add(new Person("Patrick", "01012002"));        
    
            //INSERT CODE HERE
    
            for(Person a : al) System.out.println(a.name+" "+ a.dob);
        }
    }

   What can be inserted in the code so that it will sort the collection of Persons by Person's dob attribute?
   
   A.
     Collections.sort(al, new Comparable<Person>(){
            public int compare(Person o1, Person o2) {
                return o1.dob.compareTo(o2.dob);
            }
        });

   B.
      Collections.sort(al, new Comparator<Person>(){
        public int compare(Person o1, Person o2) {
            return o1.dob.compareTo(o2.dob);
        }
    });

   C.
      Collections.sort(al, new Comparable<Person>(){
        public int compare(Person o1, Person o2) {
            return o1.dob.compare(o2.dob);
        }
    });
    
   D.
      Collections.sort(al, new Comparator<Person>(){
        public int compare(Person o1, Person o2) {
            return o1.dob.compare(o2.dob);
        }
    });
    
   
   ------------------------
   When the class of the objects that you want to compare does not implement java.lang.Comparable interface
   (which has one method named int compareTo(T t)), or when you want to compare the objects using some other
   comparison criteria than the one implemented by its compareTo method, you can use Collections.sort(List, java.util.Comparator) method.
   This method allows you to pass your own custom Comparator to compare the objects. java.util.Comparator
   is a functional interface with one abstract method:

    int compare(T o1, T o2) : Compares its two arguments and returns  a negative integer, zero, or a positive integer
    if the first argument is less than, equal to, or greater than the second.
    
    Comparator has several static and instance methods that return various kinds of Comparators.
    Please see the JavaDoc to know more. The important ones for the exam are: reversed, comparing, and thenComparing.
     
 * */

class Person{
    String name;
    String dob;
    public Person(String name, String dob){
        this.name = name; this.dob = dob;
    }
    
    public String getName(){
        return name;
    }
    
    public String getDob(){
        return dob;
    }
}
 class SortTest {
    public static void main(String[] args) {
        ArrayList<Person> al = new ArrayList<>();
        al.add(new Person("Paul", "01012000"));
        al.add(new Person("Peter", "01011990"));
        al.add(new Person("Patrick", "01012002"));        

        //INSERT CODE HERE
        Collections.sort(al, new Comparator<Person>(){
            public int compare(Person o1, Person o2) {
                return o1.dob.compareTo(o2.dob);
            }
        });
        

        for(Person a : al) System.out.println(a.name+" "+ a.dob);
    }
}
public class ByDobAttribute {
    public static void main(String[] args) {
        SortTest.main(args);
    }
}