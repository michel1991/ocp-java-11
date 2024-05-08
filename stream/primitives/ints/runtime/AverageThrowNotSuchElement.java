package stream.primitives.ints.runtime;
import java.util.*;
/**
    Given:
       class Person{
        private String name;
        private int age;
        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        //getters/setters not shown
    }
    
    What will the following code print?
    
    List<Person> friends = Arrays.asList(new Person("Bob", 31),
                    new Person("Paul", 32),
                    new Person("John", 33));
    double averageAge = friends.stream().filter(f->f.getAge()<30)
        .mapToInt(f->f.getAge())
        .average().getAsDouble();
    System.out.println(averageAge);
    
    A. It will not compile.
    B. It will throw an exception at runtime.
    C. 0.0
    D. 32.0
    E. 0
    F. 32
    
    The given code chains three operations to a stream.
    First, it filters out all the element that do not satisfy the condition f.getAge()<30, which means there will be no element in the stream, second,
    it maps each Person element to an int using the mapping function f.getAge().
    Since there is no element in the stream anyway, the stream remains empty.
    Finally, the average() method tries to compute the average of all the elements.
    
    However, there is a problem with this code.
    The average() method actually returns an OptionalDouble (and not Double).
    Since the stream contains no element and the average() method returns an OptionalDouble containing OptionalDouble.empty.
    Therefore, getAsDouble method throws a java.util.NoSuchElementException.
    To avoid this problem, instead of getAsDouble, you should use orElse(0.0).
    That way, if the OptionalDouble is empty, it will return 0.0.
    Correct (B)
    

 */
class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //getters/setters not shown
    
    String getName(){
        return name;
    }
    
    int getAge(){
        return age;
    }
    
    public static void main(String... args){
        List<Person> friends = Arrays.asList(new Person("Bob", 31),
                        new Person("Paul", 32),
                        new Person("John", 33));
        double averageAge = friends.stream().filter(f->f.getAge()<30)
            .mapToInt(f->f.getAge())
            .average().getAsDouble();
        System.out.println(averageAge);  
    }
}

public class AverageThrowNotSuchElement{
    public static void main(String... args){
        Person.main(args);
    }
}
