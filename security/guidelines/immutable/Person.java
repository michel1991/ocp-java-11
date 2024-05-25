package security.guidelines.immutable;
import java.io.*;

/**
   Given:

    class Person{
        private String name;
        private java.util.Date dob;
        
        public Person(String name, java.util.Date dob){
            this.name = name;
            this.dob = (java.util.Date) dob.clone();
            if(!validateDob(this.dob))
                                    throw new IllegalArgumentException("dob cannot be in future");
        }
        
        protected boolean validateDob(java.util.Date dob){
                return !dob.after(new java.util.Date());
        }
    
        //getter methods for fields not shown
    
    }
    
    What changes should be made to make this class immutable?
    
    A. Remove the call to clone() and assign the dob parameter directly to the dob field.
       ---------------------------
        cloning an input argument is important if the object referred to by the argument is mutable.
        Guideline 6-3 / MUTABLE-3: Create safe copies of mutable and subclassable input values
        
   B.
     validateDob method should be made private.
     --------------------
    Generally, a constructor should not invoke a method that can be overridden because
    this gives the subclass an opportunity to mess with the creation logic of the instance.
    
    Guideline 7-4 / OBJECT-4: Prevent constructors from calling methods that can be overridden
    
   C. erson class should be made final.
      --------------------
        Ideally, as per Guideline 6-1 / MUTABLE-1, an immutable class should not be subclassable.
        In this case, since the given class has a public constructor, this class should be made final.
        
   D.
       name and dob fields should be made final.
       ---------------------------
        Ideally, as per Guideline 6-1 / MUTABLE-1, fields of immutable classes should be declared final.
        However, in this case, since there are no setter methods and the fields are private,
        it may be argued that the class is immutable even if the fields are not final.
        
        In such cases, it is not possible to determine the correct answer because
        it depends on what the question writer at Oracle thinks is the right anwer.
        It is best to use your judgement to select the correct options based on the number of correct options that you have to select
       
     Correct(B, C)

 */
public class Person {
    private String name;
    private java.util.Date dob;
    
    public Person(String name, java.util.Date dob){
    this.name = name;
    this.dob = (java.util.Date) dob.clone();
    if(!validateDob(this.dob))
                throw new IllegalArgumentException("dob cannot be in future");
    }
    
    protected boolean validateDob(java.util.Date dob){
        return !dob.after(new java.util.Date());
    }

    //getter methods for fields not shown
}