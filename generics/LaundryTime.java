package generics;

/**
 * Which option cannot fill in the blank to print Clean socks?
        A. var wash = new Wash<String>();
        B. var wash = new Wash<>();
        C. Wash wash = new Wash();
        D. Wash wash = new Wash<String>();
        E. Wash<String> wash = new Wash<>();
        F. All of these can fill in the blank.
        
        The Wash class takes a formal type parameter named T.
        Options A and E show the best ways to call it.
        These option declare a generic reference type that specifies the type is String.
        Option A uses local variable type inference,
        whereas option E uses the diamond syntax
        to avoid redundantly specifying the type of the assignment.

         Options B, C, and D show that you can omit the generic
         type in the reference and still have the code compile.
         You do get a compiler warning scolding you for having a raw type.
         But compiler warnings do not prevent compilation.
         With the raw type, the compiler treats T as if it is of type Object.
         That is OK in this example, because the only method we call is toString() implicitly
         when printing the value.
         Since toString() is defined on the Object class, we are safe, and options B, C, and D work.
         Since all can fill in the blank, option F is the answer.
 */
class Wash<T> {
    T item;
    public void clean(T item) {
        System.out.println("Clean " + item);
    }
}
public class LaundryTime {
    public static void main(String[] args) {
        // __________________________ anwser
        Wash wash = new Wash();
        var wash1 = new Wash<String>();
        var wash2 = new Wash<>();
        Wash wash3 = new Wash<String>();
        Wash<String>wash4 = new Wash<>();
        wash.clean("socks");
    }
}


