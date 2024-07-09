package nestedClass.errors.badMembersProperties;

/**
    Identify correct statements about the following code:
    
A. It will compile without any error.

B. Compilation error at //1
    Var declarations are allowed only within method code (that is why it is called "local" type inferencing).
    It is not allowed for declaring class or instance fields, method return type, and method parameters.
    
C.
  Compilation error at //2
   ----
    This code creates an anonymous subclass of Student and overrides the toString method.
    Inner classes are not officially on the exam objectives but candidates have reported getting
    questions that make use of such inner classes. As another example, the following is also valid:
    var o = new Object(){
                   @Override
                    public String toString(){ return "student obj"; };
             };
   

D.  Compilation error at //3
E. Compilation error at //4
F. Compilation error at //5
 ------
     This is a valid lambda expression because the type of the lambda argument
     can be inferred by the compiler from the context (It is Student because slist is a Set of Students).
    
        However, the following will not compile:
        var m1 = (str)-> str.length()>10;
        because the compiler cannot determine the type of the object that will be created using the lambda expression from the context.
        
        The following will compile fine:
        Predicate<String> m2 = (str)-> str.length()>10

  
  Java 9 has added List.of/Set.of methods that return an unmodifiable list/set containing an arbitrary number of elements.
  
  Correct(B)
 */
import java.util.*;
class Student{
    int marks;
 }  
 
 class TestClass {
     var k = new Student(); //1
 
     public static void main(String[] args) {
 
        var s = new Student(){    //2
                 @Override
                 public String toString(){ return "student obj"; };
                };
 
        var slist = Set.of(new Student()); //3
 
        for(var i : slist){  //4
             System.out.println(i);
        }
     
        slist.removeIf((var s1) -> s1.marks<0); //5
     }
 }