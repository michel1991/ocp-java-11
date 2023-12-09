package collections.sets;
import java.util.*;

/**
   Given:
    What will be the output when TestClass is compiled and run?
    
    A. It will print MR, MS1, MS2, but the order is unpredictable.
    B. MS2, MR, MS1,
    C. MR, MS1, MS2,
        A TreeSet keeps its its elements in sorted order. Therefore,
        when you iterate through a TreeSet, you will get elements sorted either by the Comparator
        specified while creating the TreeSet or by their natural order (which uses the Comparable interface
        implemented by the class of the elements).
        Every enum implements Comparable and the natural order of enums is the order in which they are defined.
        
        In the given code, the order in which the three enum values are defined is MR, MS1, and MS2. Therefore,
        this is their natural order.
    D. It will not compile.
    Correct(C)


 */
enum Title
    {
        MR("Mr."), MS1("Ms."), MS2("Ms.");
        private String title;
        private Title(String s){
            title = s;
        }  
    }

public class TreeSetWithEnums {
    public static void main(String[] args) {
        var ts = new TreeSet<Title>();
        ts.add(Title.MS2);
        ts.add(Title.MR);
        ts.add(Title.MS1);
        for(Title t :  ts){
            System.out.println(t);
        }
    }
}