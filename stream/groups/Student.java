package stream.groups;
import java.util.*;
import java.util.stream.*;


/**
   Given:

        public class Student {
        public static enum Grade{ A, B , C, D, F}    
        
            private String name;
            private Grade grade;
            public Student(String name, Grade grade){
                this.name = name;
                this.grade = grade;
            }
            public String toString(){
                return name+":"+grade;
            }
            //getters and setters not shown
        }
        
        What can be inserted in the code below so that it will print:
        {C=[S3:C], A=[S1:A, S2:A]}
        
        
        List<Student> ls = Arrays.asList(new Student("S1", Student.Grade.A),
                    new Student("S2", Student.Grade.A),
                    new Student("S3", Student.Grade.C));
        //INSERT CODE HERE
        System.out.println(grouping);
        
       A.
        Map<Student.Grade, List<Student>> grouping = ls.stream().groupBy(
            Collectors.groupingBy(s ->s.getGrade()));
            
          groupBy is not a valid method in Stream interface.
          
       B.
         Map<Student.Grade, List<Student>> grouping = ls.stream().collect(
                Collectors.groupingBy(s ->s.getGrade()));
                
       C.
       Map<Integer, List<Student>> grouping = ls.stream().groupBy(
        Collectors.mapping(
            Student::getGrade,
            new ArrayList())
        );
        ------
        Collectors does have a mapping method but it is an invalid usage of this method
       
       D.
          Map<Integer, List<Student>> grouping = ls.stream().map(
    Collectors.groupingBy(s ->s.getGrade()));
      ------
            Stream.map method is used to convert elements of a stream from one type to another. It is not really helpful here
       
      -----------------
      Correct(B)
      This code illustrates the usage of the simplest of the Collectors methods.
        Collectors.groupingBy(s ->s.getGrade()) returns a Collector that applies a function on the elements of a stream
        to get a key and then group the elements of the stream by that key into lists. Stream's collect method uses this Collector
        and returns a Map where the key is the key returned by the function and the value
        is a List containing all the elements that returned the same key.

    Here, the function s ->s.getGrade() provides the Grades as the key.
    The keys returned by this function are, therefore, A, A, and C respectively.
    Since there are two unique keys (A, C), the Map returned by the collect method will contain two key-value pairs: {C=[S3:C], A=[S1:A, S2:A]}
 */

public class Student {
    public static enum Grade{ A, B , C, D, F}    
    
        private String name;
        private Grade grade;
        public Student(String name, Grade grade){
            this.name = name;
            this.grade = grade;
        }
        public String toString(){
            return name+":"+grade;
        }
        //getters and setters not shown
       String getName(){
            return name;
        }
    
      Grade getGrade(){
             return grade;
        }
    
    public static void main(String... args){
            List<Student> ls = Arrays.asList(new Student("S1", Student.Grade.A),
                                   new Student("S2", Student.Grade.A),
                                new Student("S3", Student.Grade.C));
        //INSERT CODE HERE
        Map<Student.Grade, List<Student>> grouping = ls.stream().collect(
                Collectors.groupingBy(s ->s.getGrade()));
        System.out.println(grouping);
    }
}
    