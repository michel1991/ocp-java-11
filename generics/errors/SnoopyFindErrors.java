package generics.errors;

/**
   Which line in the main() method doesn’t compile or
    points to a class that doesn’t compile?
   
    A. Line 21.
    B. Line 22.
    C. Line 23.
    D. Line 24.
    E. None of the above. All of the code compiles.
    
    The Comic<C> interface declares a formal type parameter.
    This means that a class implementing it needs to specify this type.
    The code on line 21 compiles because the lambda reference
    supplies the necessary context making option A incorrect.
    Option B declares a generic class.
    While this doesn’t tell us the type is Snoopy,
    it punts the problem to the caller of the class.
    The declaration of c2 on line 22 compiles because it supplies the type, making option B incorrect.
    The code on line 23 compiles because the SnoopyClass itself supplies the type, making option C incorrect.
    Option D has a problem. SnoopyClass and SnoopyComic appear similar.
    However, SnoopyComic refers to C. This type parameter exists in the interface.
    It isn’t available in the class because the class has said it is using Snoopy as the type.
     Since the SnoopyComic class itself doesn’t compile,
     the line with c4 can’t instantiate it, and option D is the answer.
 */
interface Comic<C>{ // 1: 
    void draw(C c); //  2:   
} //    3: 
 class ComicClass<C> implements Comic<C> { // 4: 
    public void draw(C c) { //    5:  
        System.out.println(c); //      6: 
    } //     7: 
} // 8: 
 class SnoopyClass implements Comic<Snoopy> { // 9: 
    public void draw(Snoopy c) { //  10: 
        System.out.println(c); //    11:
    } //  12: 
} // 13:
class SnoopyComic implements Comic<Snoopy> { // 14: 
    public void draw(C c) { //   15:  
        System.out.println(c); //  16: 
    } //   17: 
} // 18:
class Snoopy { // 19:
    public static void main(String[] args) { //  20: 
        Comic<Snoopy> c1 = c -> System.out.println(c); //  21:
        Comic<Snoopy>c2 = new ComicClass<>(); //  22: 
        Comic<Snoopy> c3 = new SnoopyClass(); //   23:
        Comic<Snoopy> c4 = new SnoopyComic(); //   24: 
    } //  25: 
} //     26:


public class SnoopyFindErrors {
  
}