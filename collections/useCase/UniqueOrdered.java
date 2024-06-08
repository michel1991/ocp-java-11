package collections.usesCase;
import java.util.*;
import java.io.*;

/**
   Following is a program to capture words from command line and create two collections.
   One that keeps only unique words and one that keeps all the words in the order they were entered. What should replace AAA and BBB?

   static Collection unique = new AAA();
    static Collection ordered = new BBB();
    public static void main(String args[]) throws Exception
    {
        BufferedReader bfr = new BufferedReader( new InputStreamReader( System.in ) );
        String s = bfr.readLine();
        while(s != null && s.length() >0)
        {
            unique.add(s);
            ordered.add(s);
            s = bfr.readLine();
        }
        System.out.println(unique);
        System.out.println(ordered);
    }
    
    A. Set, List
        Set and List are interfaces. They cannot be instantiated. So you cannot do new Set(); or new List();
        
    B. LinkedList, HashSet
    C. HashSet, LinkedList
    D. HashSet, ArrayList
    E. Vector, TreeSet
    
   ----------------------
    unique means you need a class that implements Set. So options are: HashSet, LinkedHashSet, and TreeSet
    ordered means you need a class that implements List. So options are: ArrayList, LinkedList.
    
    Correct(C, D)

 */
public class UniqueOrdered {
    static Collection unique = new HashSet(); // AAA
    static Collection ordered = new LinkedList(); // BBB
    public static void main(String args[]) throws Exception
    {
        BufferedReader bfr = new BufferedReader( new InputStreamReader( System.in ) );
        String s = bfr.readLine();
        while(s != null && s.length() >0)
        {
            unique.add(s);
            ordered.add(s);
            s = bfr.readLine();
        }
        System.out.println(unique);
        System.out.println(ordered);
    }
}