package stream.joining;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
 Given:

    class Course{
        private String id;
        private String name;
    
        public Course(String id, String name){
            this.id = id; this.name = name;
        }
        //accessors not shows
    }
    
    What will the following code print?
    
    List<Course> cList = Arrays.asList(
            new Course("803", "OCAJP 7"),
            new Course("808", "OCAJP 8"),
            new Course("809", "OCPJP 8")
    );
                
    cList.stream().filter(c->c.getName().indexOf("8")>-1)
            .map(c->c.getId())
            .collect(Collectors.joining("1Z0-"));
    cList.stream().forEach(c->System.out.println(c.getId()));
    
   A.
    803
    808
    809
   
   B. 
    803
    1Z0-808
    1Z0-809
    
   C.
    1Z0-808
    1Z0-809
    
    D. It will throw an exception at run time.
    E. It will not compile.
    
   There are multiple flavors of Collectors.joining method and all of them are meant to join CharSequences and return the combined String.
   For example, if you have a List of Strings, you could join all the elements into one long String using the Collectors returned by these methods.
   You should check their JavaDoc API description for details.

    The given code ostensibly tries to apply "1Z0-" as prefix to the id value of each course that has a name containing "8",
    but that is not what the code actually does.
    It first filters the stream (removing the elements that don't satisfy the condition, which means the stream now contains only two Course objects),
    then replaces each Course element with a String element (containing just the id, which means the stream now has two Strings "808" and "809"),
    and then joins each of the elements with "1Z0-" as delimiter to return "8081Z0-809".
    However, this return value is lost because it is not assigned to any thing.
    
    The next line creates a new stream using the original List of Course objects and prints the id for each Course.
    This prints the three ids values 803, 808, and 809.
    
    Correct(A)

 */
public class Course {
    private String id;
    private String name;

    public Course(String id, String name){
        this.id = id; this.name = name;
    }
    
    //accessors not shows
    public String getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public static void main(String... args){
        List<Course> cList = Arrays.asList(
                new Course("803", "OCAJP 7"),
                new Course("808", "OCAJP 8"),
                new Course("809", "OCPJP 8")
        );
                    
        cList.stream().filter(c->c.getName().indexOf("8")>-1)
                .map(c->c.getId())
                .collect(Collectors.joining("1Z0-"));
        cList.stream().forEach(c->System.out.println(c.getId()));
    }
}