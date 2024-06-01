package sorts;
import java.util.ArrayList;
import java.util.Collections;

/**
 Given the following complete contents of TestClass.java:
 What will be printed?
   A.
     yorkmont ridge ln 11223
    dupont dr 28217
    sharview cir 28217
    
    B.
       sharview cir 28217
        yorkmont ridge ln 11223
        dupont dr 28217
        
    C.
        sharview cir 28217
        dupont dr 28217
        yorkmont ridge ln 11223

    D.  The order of output messages cannot be determined
    E.  It will throw an exception at run time.
    F.  It will not compile.

   -------------------
    
    For Collections.sort(List<T> ) method to sort a Collection of any class T,
    that class must implement java.lang.Comparable interface.
    This interface has only one method: public int compareTo(T o), where T is same as the class to which Comparable is typed.
    In this case, it is typed to Address.

    In cases where a class does not implement Comparable or when you want to sort instances based
    on a different order than the one provided by the class's compareTo method,
    you can use another class that implements Comparator interface to sort your collection.
    For example, if you want to sort Address instances based on street, you can do it like this:
    Comparator<Address> c = new Comparator<Address>(){
        public int compare(Address o1, Address o2) {
                        return o1.street.compareTo(o2.street);
                    }
    };
    and then use Collections.sort(List<T>, Comparator<? super T>) method:
    
    Collections.sort(al, c)
    correct (A)
    
 */
class Address implements Comparable<Address>{
    String street;
    String zip;
    public Address(String street, String zip){
        this.street = street; this.zip = zip;
    }
    public int compareTo(Address o) {
        int x = this.zip.compareTo(o.zip);
        return x == 0? this.street.compareTo(o.street) : x;
    }
}
public class TestClass {
    public static void main(String[] args) {
        ArrayList<Address> al = new ArrayList<>();
        al.add(new Address("dupont dr", "28217"));
        al.add(new Address("sharview cir", "28217"));
        al.add(new Address("yorkmont ridge ln", "11223"));        
        Collections.sort(al);
        for(Address a : al) System.out.println(a.street+" "+ a.zip);
    }
}