package sorts;
import java.util.*;

/**
   Given:

    class Person{
        String name;
        String dob;
        public Person(String name, String dob){
            this.name = name; this.dob = dob;
        }
    }
    class MySorter {
        public int compare(Person p1, Person p2){
            return p1.dob.compareTo(p2.dob);
        }
    }
    public class SortTest {
        public static int diff(Person p1, Person p2){
            return p1.dob.compareTo(p2.dob);
        }
        
        public static int diff(Date d1, Date d2){
            return d1.compareTo(d2);
        }
        public static void main(String[] args) {
            ArrayList<Person> al = new ArrayList<>();
            al.add(new Person("Paul", "01012000"));
            al.add(new Person("Peter", "01011990"));
            al.add(new Person("Patrick", "01012002"));        
            
            INSERT CODE HERE
        }
    }
    
    and the following lines of code:
    I     java.util.Collections.sort(al, (p1, p2)->p1.dob.compareTo(p2.dob));
            
    II    java.util.Collections.sort(al, SortTest::diff);
    
    III   java.util.Collections.sort(al, new MySorter()::compare);
            
    IV    java.util.Arrays.sort(al, SortTest::diff);
    
    How many of the above lines can be inserted into the given code, independent of each other, to sort the list referred to by al?
    
    A. 1
    B. 2
    C. 3
    D. 4
    E. None of these

    -------
      Only the line java.util.Arrays.sort(al, SortTest::diff); will not work because Arrays.sort works on arrays not lists.
      If you had an array of Person objects, it would have been valid.
      All others are valid implementations of Comparator interface using lambda expressions or method references.
     Correct(C)
 */
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
class MySorter {
    public int compare(Person p1, Person p2){
        return p1.dob.compareTo(p2.dob);
    }
}
public class SortTest {
    public static int diff(Person p1, Person p2){
        return p1.dob.compareTo(p2.dob);
    }
    
    public static int diff(Date d1, Date d2){
        return d1.compareTo(d2);
    }
    public static void main(String[] args) {
        ArrayList<Person> al = new ArrayList<>();
        al.add(new Person("Paul", "01012000"));
        al.add(new Person("Peter", "01011990"));
        al.add(new Person("Patrick", "01012002"));        
        
        //INSERT CODE HERE
       java.util.Collections.sort(al, (p1, p2)->p1.dob.compareTo(p2.dob));
            
        java.util.Collections.sort(al, SortTest::diff);
        
        java.util.Collections.sort(al, new MySorter()::compare);
    }
}
