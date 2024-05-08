package collections.tricky.lists;
import java.util.*;
import java.util.function.*;

 /**
  Given: 
    public class Student {
        private String name;
        private int marks;
    
        //constructor and getters and setters not shown
    
        public void addMarks(int m){
            this.marks += m;
        }
        public void debug(){
            System.out.println(name+":"+marks);
        }
    }

    What will the following code print when compiled and run?
        
    List<Student> slist = List.of(new Student("S1", 40), new Student("S2", 35),
                                                  new Student("S3", 30));
    Consumer<Student> increaseMarks = s->s.addMarks(10);
    slist.forEach(increaseMarks);
    slist.forEach(Student::debug);
    
    A.
        S1:50
        S2:45
        S3:40
        
    B.
        S1:40
        S2:35
        S3:30
        
     C. It will not print anything.

     D.  It will not compile.
    
    --------------------------
     This is a straightforward code that shows how to iterate through a list and perform an operation on each element.
    
    Java 8 has added a default method default void forEach(Consumer<? super T> action) in java.lang.Iterable interface (which is extended by java.util.List interface).
    It performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
     Unless otherwise specified by the implementing class, actions are performed in the order of iteration (if an iteration order is specified).
     Exceptions thrown by the action are relayed to the caller.
    
    Java 9 has added List.of/Set.of methods that return an unmodifiable list/set containing an arbitrary number of elements.
     Correct(A)
  */
 class Student { // public
    private String name;
    private int marks;

    //constructor and getters and setters not shown
    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    
    String getName(){
        return name;
    }
    
    int getMarks(){
        return marks;
    }

    public void addMarks(int m){
        this.marks += m;
    }
    public void debug(){
        System.out.println(name+":"+marks);
    }
}

public class ImplicitConsumer {
    public static void main(String...args){
        List<Student> slist = List.of(new Student("S1", 40), new Student("S2", 35),
        new Student("S3", 30));
        Consumer<Student> increaseMarks = s->s.addMarks(10);
        slist.forEach(increaseMarks);
        slist.forEach(Student::debug);
    }
}