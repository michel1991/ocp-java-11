package generics;
/**
* What is the result of the following class?
    A. Compiler error on line 1
    B. Compiler error on line 2
    C. Compiler error on line 11
    D. Compiler error on line 12
    E. a string123
    F. An exception is thrown.

  This class is a proper use of generics. Box uses a generic type named T.
  On line 11, the generic type is String.
  On line 12, the generic type is Integer.
  Both lines 11 and 12 use var for local variables to represent the types, so you have to keep track of them yourself.
  For more information, see Chapter 3.
 */
public class Box<T> { // 1:
    T value; //  2:
    //3:
    public Box(T value) { // 4:
        this.value = value; //    5:
    } //  6:
    public T getValue() { //   7:
        return value; //  8:
    }  //  9:
    public static void main(String[] args) { //  10:
        var one = new Box<String>("a string"); //     11:
        var two = new Box<Integer>(123); //   12:
        System.out.print(one.getValue()); //   13:
        System.out.print(two.getValue()); //   14:
    } } // 15: