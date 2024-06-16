package stream.groups.whatCanBeInserted;

import java.util.*;
import java.util.stream.*;

/**
   Given:

    public class Student {
        private String name;
        private int marks;
        public Student(String name, int marks){
            this.name = name;
            this.marks = marks;
        }
        public String toString(){
            return name+":"+marks;
        }
        //getters and setters not shown
    }
    
    What can be inserted in the code below so that it will print:
    {20=[S1:20, S3:20], 30=[S3:30]}
    
    
    List<Student> ls = Arrays.asList(new Student("S1", 20),
               new Student("S3", 30), new Student("S3", 20) );
    //INSERT CODE HERE
    System.out.println(grouping);
    
    A.
       Map<Integer, List<Student>> grouping = ls.stream().collect(
            Collectors.groupingBy(
               Student::getMarks,
               Collectors.mapping(Student::getName, Collectors.toList()))
            );
            
         Student::getName returns a String.
         This is the same return type that will be used to determine return type of the List returned by Collectors.toList() i.e. List<String>.

        Therefore, the return type of Collectors.groupingBy will be Map<Integer, List<String>>.
        
        But this is not compatible with the type of the variable grouping, which is Map<Integer, List<Student>>.
        If you change the variable declaration to Map<Integer, List<String>> grouping, it will compile.
        
    B.
       Map<Integer, List<Student>> grouping = ls.stream().collect(
        Collectors.groupingBy(
           Student::getMarks,
           Student)
        );

    C.
       Map<Integer, List<Student>> grouping = ls.stream().collect(
        Collectors.groupingBy(
           Student::getMarks,
           new ArrayList())
        );
        
    D.
      Map<Integer, List<Student>> grouping = ls.stream()
                  .collect(Collectors.groupingBy(s ->s.getMarks()));

   ------------
   This code illustrates the usage of the simplest of the Collectors methods.
    Collectors.groupingBy(s ->s.getMarks())
    returns a Collector that applies a function on the elements of a stream to get a key
    and then group the elements of the stream by that key into lists. Stream's collect method uses this Collector
    and returns a Map where the key is the key returned by the function
    and the value is a List containing all the elements that returned the same key.
    
    Here, the function s ->s.getMarks() provides the marks as the key.
    The keys returned by this function are, therefore, 20, 30, and 20 respectively.
    Since there are two unique keys (20, 30), the Map returned by the collect method will contain two key-value pairs: {20=[S1:20, S3:20], 30=[S3:30]}
    
     correct D)

 */
public class Student {
    private String name;
    private int marks;
    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    public String toString(){
        return name+":"+marks;
    }
    //getters and setters not shown
    public String getName(){
        return name;
    }
    
    public int getMarks(){
        return marks;
    }
    
    public static void main(String... args){
        List<Student> ls = Arrays.asList(new Student("S1", 20),
                                         new Student("S3", 30), new Student("S3", 20) );
        //INSERT CODE HERE
        Map<Integer, List<Student>> grouping = ls.stream()
                  .collect(Collectors.groupingBy(s ->s.getMarks()));
        System.out.println(grouping);
    }
}