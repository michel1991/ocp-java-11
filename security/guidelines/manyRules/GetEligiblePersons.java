package security.guidelines.manyRules;
import java.util.*;

/**
 Given the following class:

    class Person{
    private String name;
    private java.time.LocalDate dob;
    
    public Person(String name, java.time.LocalDate dob){
        this.name = name;
        this.dob = dob;
    }
    //public getters and setters for name and dob
    
    }
    
    
    and the following method appearing in some other class:
    
    public List<Person> getEligiblePersons(List<Person> people){
        var pl = new ArrayList<Person>();
        for(var p : people){
            if(p.getDob().isBefore(cutoff)){
                pl.add(p);
            }
        }
        return pl;
    }
    
    A. There is no issue with the given code.
    B. A copy of dob parameter should be made and that copy should be assigned to the dob field.
      -------------------------------------
        This is not required because LocalDate is immutable.
    C.
      getEligiblePersons should create a deep copy of the people list before processing the elements.
      ----------------------------------------------------
        Observe that Person class is mutable (due the the presence of setter methods).
        Therefore, it is possible that a Person object's dob field is changed by another code while the method is processing Person objects.
        ( Guideline 6-3 / MUTABLE-3: Create safe copies of mutable and subclassable input values )
        
        Ideally, Person class should provide a copy constructor or some other means to create a copy of a Person instance.
        (Guideline 6-4 / MUTABLE-4: Support copy functionality for a mutable class.)
        
    D.
      Person class should provide a copy constructor.
      -----------------------------------------------
        Since Person class is mutable, it should provide a way for users to create
        a copy of a Person instance which can be used independently without the threat of getting modified by some other code.
        
        Something like:
        public Person copy(){
            return new Person(this.getName(), this.getDob());
        }
        
        Guideline 6-4 / MUTABLE-4: Support copy functionality for a mutable class
        
        ---------------------------------------
         Correct(C, D)
 */

class Person{
    private String name;
    private java.time.LocalDate dob;
    
    public Person(){
        
    }
    
    public Person(String name, java.time.LocalDate dob){
        this.name = name;
        this.dob = dob;
    }
    //public getters and setters for name and dob
    
    public String getName(){
        return null;
    }
    
    public java.time.LocalDate getDob(){
        return null;
    }
    
}
public class GetEligiblePersons {
    public List<Person> getEligiblePersons(List<Person> people){
        var pl = new ArrayList<Person>();
        java.time.LocalDate cutoff = null;
        for(var p : people){
            if(p.getDob().isBefore(cutoff)){
                pl.add(p);
            }
        }
        return pl;
    }
}