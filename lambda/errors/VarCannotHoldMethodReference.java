package generics.errors;


import java.util.*; 
 import java.util.function.*; 

 /**
  How many of these lines have compiler errors?
    A. One.
    B. Two.
    C. Three.
    D. Four.
    E. Five.
    F. The code compiles as is.
    
    Like a lambda, method references use type inference.
    When assigned to a local variable,
    var cannot be used because there is not enough information to infer the type.
    Due to this, lines 17, 18, and 19 do not compile.
    Consumer˂Object˃ takes a single Object argument and does not return any data.
    The classes ArrayList and String do not contain constructors that take an Object,
    so lines 14 and 15 do not compile either. Line 16 does support an Object variable,
    since the System.out.println(Object) method exists.
    For these reasons, option E is the correct answer.

  */
public class VarCannotHoldMethodReference {
  static void findErrors (){
      Consumer<Object> c1 = ArrayList::new; // 14:
      Consumer<Object> c2 = String::new; //  15:
      Consumer<Object> c3 = System.out::println; //   16:
      var c4 = ArrayList::new; //   17:
      var c5 = String::new; //  18:
      var c6 = System.out::println; //  19: 
      
  }
}