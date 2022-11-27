package inheritance.errors;

/**
* Question: Which of the following statements about overridden methods are true? (Choose all that apply.)
* A. A top-level type can be marked protected
* B. A member inner class cannot be marked public since that would make it a top-level class.
* C. A member inner class cannot be marked public since that would make it a top-level class.
* D. A top-level type must be stored in a .java file with a name that matches the class name.
* E. If a member inner class is marked private, then it can be referenced only in the outer class for which it is defined.
* F. None of the above
*
* The signature must match exactly, making option A incorrect. There is no such thing as a covariant signature.
* An overridden method must not declare any new checked exceptions or a checked exception that is broader than the inherited method.
* For this reason, option B is correct, and option D is incorrect.
* Option C is incorrect because an overridden method may have the same access modifier as the version in the parent class.
* Finally, overridden methods must have covariant return types, and only void is covariant with void, making option E correct
*
*
 */
class Mother{
    void hello(CharSequence c){
      System.out.println("Denise");
    }
}

class Child extends Mother{
    @Override
    void hello(String c){
        System.out.println("Michel");
    }
}

public class InheritanceNotCovariantWithParameter {
   public static void main(String... args){

   }
}