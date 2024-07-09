package stream.groups;
import java.util.*;
import java.util.stream.*;

/**
   Given:

    public class Course{
        private String id;
        private String category;
    
        public Course(String id, String category){
            this.id = id; this.category = category;
        }
        
        public String toString(){
            return id+" "+category;
        }
    
        //accessors not shown
    }
    
    What will the following code print?
    
    List<Course> s1 = Arrays.asList(
            new Course("OCAJP", "Java"),
            new Course("OCPJP", "Java"),
            new Course("C#", "C#"),
            new Course("OCEJPA", "Java")
    );
    
    s1.stream()
           .collect(Collectors.groupingBy(c->c.getCategory()))
           .forEach((m, n)->System.out.println(n));
           
     A.
       C# C#
        OCAJP Java, OCPJP Java, OCEJPA Java

     B.
       [C# C#]
       [OCAJP Java, OCPJP Java, OCEJPA Java]
       -----
        1. Collectors.groupingBy(Function<? super T,? extends K> classifier) returns a Collector that groups elements of a Stream into multiple groups.
        Elements are grouped by the value returned by applying a classifier function on an element.

        2. It is important to understand that the return type of the collect method depends on the Collector that is passed as an argument.
        In this case, the return type would be Map<K, List<T>> because that is the type specified in the Collector returned by the groupingBy method.
        
        3. Java 8 has added a default forEach method in Map interface.
        This method takes a BiConsumer function object and applies this function to each key-value pair of the Map.
        In this case, m is the key and n is the value.
        
        4. The given code provides a trivial lambda expression for BiConsumer that just prints the second parameter,
        which happens to be the value part of of the key-value pair of the Map.
        
        5. The value is actually an object of type List<Course>, which is printed in the output.
        Since there are two groups, two lists are printed. First list has only one Course element and the second list has three.
        
     C. [C#]
        [OCAJP OCPJP OCEJPA]
        
     D. C#
        OCAJP OCPJP OCEJPA
        
     ------
     This is a simple piece of code that illustrates how to group a stream of objects by any given criteria using Stream's collect method.
     There are two important things to understand here:
        1. collect method requires a java.util.stream.Collector object.
   Collector is actually an interface the details of which are not too important for the exam but are good for a clear understanding of how this works.
   JavaDoc API description explains this very clearly: https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collector.html
        
        2. java.util.stream.Collectors is a utility class that lets you create various flavors of readymade Collector objects.
 This is an important class for the exam. You should go through the description of each method of this class:
 https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html
       Correct(B)


 */
public class Course {
    private String id;
    private String category;

    public Course(String id, String category){
        this.id = id; this.category = category;
    }
    
    public String toString(){
        return id+" "+category;
    }

    //accessors not shown
    
    public String getId(){
        return id;
    }
    
    public String getCategory(){
        return category;
    }
    
    public static void main(String... args){
        List<Course> s1 = Arrays.asList(
                new Course("OCAJP", "Java"),
                new Course("OCPJP", "Java"),
                new Course("C#", "C#"),
                new Course("OCEJPA", "Java")
        );
        
        s1.stream()
               .collect(Collectors.groupingBy(c->c.getCategory()))
               .forEach((m, n)->System.out.println(n));
    }
}