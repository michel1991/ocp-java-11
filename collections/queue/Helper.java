package collections.queue;
import java.util.*;

/**
   Identify the correct statements about the following code:
   
   A.
      It will print :
        Helped : Pope
        Helped : John

   B. It will compile with a warning.

   
   C. It will throw an exception at runtime.
   D. It will compile without warning but will throw an exception at runtime.
   E.
      It will print :
    Helped : John
    Helped : Pope

   F. It will print : Helped : John
   G. It will print : Helped : Pope
   
   -------------------
   Correct(A, B)
   
   The helpPeople() method is an old style (legacy) method that takes type-unsafe Queues.
   At Runtime, JVM does not have any type information for the generic classes.
   Therefore, this method is free to add any kind of object in the queues without any exception even though the 'helped'
   Queue was supposed to have only Person objects.

    Remember that type safety of generic classes is checked only at compilation time.
    To allow legacy code to run without any modification, the compiler relaxes the rules when you pass a type safe class to a legacy method.
    However, the compiler warns you that this is a potentially dangerous operation because the legacy code can add any element
    to your typesafe collection that is not supposed to be added.
    
    
    
    The poll() method removes the 0th element. Thus, it prints Helped : Pope and then Helped : John.
    
    Note that Queue's offer method adds an element to the end of the queue.
 */
class Person {
    private String name;
    public Person(String name) {  this.name = name;    }
    public String getName() { return name;  }
    public void setName(String name) { this.name = name; }

    public String toString() { return name; }
}

class Helper {

    public void helpPeople(Queue people, Queue helped) {
        do {
            Person p = (Person) people.poll();
            System.out.println("Helped : " + p + " ");
            helped.offer(p.getName());
        } while (!people.isEmpty());
    }

    public static void main(String[] args) {
        Queue<Person> q = new LinkedList<Person>();
        q.offer(new Person("Pope"));
        q.offer(new Person("John"));
        Queue<Person> helpedQ = new LinkedList<Person>();
        Helper h = new Helper();
        h.helpPeople(q, helpedQ);
    }
}