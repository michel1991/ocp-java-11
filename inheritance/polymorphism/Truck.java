package inheritance.tricky.polymorphism;

/**
  Given the following classes, what will be the output of compiling and running the class Truck?
  
   A. Compiler error at line 3.
   B. Runtime error at line 3.
   
   C.
      It will print:
      Automobile: drive
      Truck: drive
      Automobile: drive
      in that order.
   
   D.
      It will print:
      Automobile: drive
      Truck: drive
      Truck: drive
      in that order.
      
   E.
     I t will print:
      Automobile: drive
      Automobile: drive
      Automobile: drive
      in that order
      
      -------
      Since Truck is a subclass of Automobile, a = t will be valid at compile time as well at runtime.
      But a cast is needed to make t = (Truck) a; work.
      This will be ok at compile time but if at run time 'a' does not refer to an object of class Truck, a ClassCastException will be thrown.
      Now, method to be executed is decided at run time and it depends on the actual class of object referred to by the variable.
      Here, at line 4, variable a refers to an object of class Truck. So Truck's drive() will be called which prints Truck: drive.
      This is polymorphism in action!
      
        Correct(D)
 */
class Automobile{
    public void drive() {  System.out.println("Automobile: drive");   }
 }
 
 public class Truck extends Automobile{
    public void drive() {  System.out.println("Truck: drive");   }
    public static void main (String args [ ]){
       Automobile  a = new Automobile();
       Truck t  = new Truck();
       a.drive(); //1
       t.drive(); //2
       a = t;     //3
       a.drive(); //4
    }
 }