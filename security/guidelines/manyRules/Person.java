package security.guidelines.manyRules;
/**
 Gven:

    public class Person{
    private String name;
    private java.util.Date dob;
    public Person(String name, java.util.Date dob){
        this.name = name;
        this.dob = dob;
    }
    
        public  String getName(){ return name; }
        public  java.util.Date getDob(){ return dob; }
    }
    
    
    What, if anything, is wrong with the above code from secure coding guidlines perspective?
    
    A. There is nothing wrong.
    B. setter methods for name and dob should be added.
    C. name and dob should be set using setter methods instead of the constructor.
    D. The constructor should clone name and dob parameters before assigning them to the instance fields.
        ---------------
        Only dob needs to be cloned because name is immutable already.
    
        Guideline 6-3 / MUTABLE-3: Create safe copies of mutable and subclassable input value
        
    E. The getDob method should return a clone of dob.
        Date is not an immutable class. So, anyone having a reference to the same Date object can potentially change it.
        This may cause serious problem with the Person instance.
        For example, a rogue code might change the Date object pointed to by dob to a future date.
        
        Therefore, the constructor should clone the passed Date object and the getter method should return a clone of the dob field.
        
        String (and other immutable classes) fields do not have this issue because they are immutable.
        So, even if other code gets access to such objects, it cannot change them.
        
        This is one of the reasons, the new java.time.LocalDate class is preferred instead of java.util.Date class.
        
        Guideline 6-2 / MUTABLE-2: Create copies of mutable output values
    
   
     Correct(E)
 */
public class Person {
    private String name;
    private java.util.Date dob;
    public Person(String name, java.util.Date dob){
        this.name = name;
        this.dob = dob;
    }
    
    public  String getName(){ return name; }
    public  java.util.Date getDob(){ return dob; }
}