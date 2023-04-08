package security.immutable;

/**
 *  What changes, taken together, would make the Tree class immutable? (Choose three.)
    A. Make all constructors private.
    B. Change the access level of species to private.
    C. Change the access level of species to protected.
    D. Remove the setSpecies() method.
    E. Mark the Tree class final.
    F. Make a defensive copy of species in the Tree constructor.
    
     Immutable objects are ones that are not modified after they are created.
     Immutable objects can have public constructors.
     There is no need to change the access modifier to private, making option A incorrect.
     All instance variables should be private in an immutable class to prevent subclasses
     and classes within the package from modifying them outside the class, making option B correct
     and option C incorrect. They should not have any setter methods, making option D correct.
     The class should also either be marked final or contain final methods to prevent subclasses
     from altering the behavior of the class, making option E correct.
     Finally, option F is incorrect as String is immutable,
     so a defensive copy is not required. Note that if species were a mutable type,
     like List, a defensive copy would be required.

 */
class Tree { // 1: 
    String species; //  2: 
    public Tree(String species) { // 3: 
        this.species = species; //   4:
    } //   5:
    public String getSpecies() { // 6: 
        return species; //  7:  
    } //  8:
    private final void setSpecies(String newSpecies) { //   9: 
        species = newSpecies; //  10:  
    } //  11:
} //    12:

public class TreeChoiceAnswer {
  
}