package annotations.meta.retentionPolicy;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.*;

/**
 Given:

    @Retention(RetentionPolicy.RUNTIME)
    public @interface DebugInfo {
        String[] params() default {""};
        String date() default "";
        int depth() default 10;
        String value() ;
    }
    
    Which of the following options correctly uses the above annotation?
    
    A.
       List<Integer> al = new ArrayList<Integer>();
        al.forEach((@DebugInfo("lambda") x) ->{ System.out.println(x);});
        ---------
        It is possible to annotate lambda parameters but to do that the type of the lambda parameter must be specified.

    B.
        List<Integer> al = new ArrayList<Integer>();
        al.forEach((@DebugInfo("lambda") var x) ->{ System.out.println(x);});
        -------
        Normally, when a lambda express requires only a single parameter, you don't need to specify its type because it can be inferred by the compiler.
        However, in that case, you cannot apply an annotation to it.
        To be able to apply an annotation and to get the benefit of type inferencing, you can specify the type of the variable as var.

    C.
       List<Integer> al = new ArrayList<Integer>();
        al.forEach((@DebugInfo("lambda") Integer x) ->System.out.println(x));

    D.
        @DebugInfo( "01/01/2019")    
            void applyLogic(int index){
        }
        ------
        Since there is only one element in the @DebugInfo annotation that does not have a default value and since its name is value,
        you can pass a value for this element directly without specifying the name.
        
    E.
        BinaryOperator<Integer> bin = @DebugInfo("lambda")( a, b)-> a+b;
        ----------
        The annotation is not placed correctly. You can do something like this:
        BinaryOperator<Integer> bin = ( @DebugInfo("lambda") Integer a, Integer b)-> a+b;
        or
        BinaryOperator<Integer> bin = ( @DebugInfo("lambda1") Integer a,
            @DebugInfo("lambda1") Integer b)-> a+b;
        or even this:
        BinaryOperator<Integer> bin = ( @DebugInfo("lambda") var a, var b)-> a+b;
        
        But you cannot do:
        BinaryOperator<Integer> bin =
             ( @DebugInfo("lambda") var a, Integer b)-> a+b; because you cannot mix var and explicit types in lambda.
             
      F. @DebugInfo( date=new Date(), value="01/01/2019")    
        void applyLogic(int index){
        }
        ------
        Value of an element must be a constant expression. So, new Date() is not a valid value for date element.

      Correct(B, C, D)

    F.
 */

@Retention(RetentionPolicy.RUNTIME)
 @interface DebugInfo { // public
    String[] params() default {""};
    String date() default "";
    int depth() default 10;
    String value() ;
}

public class DebugInfo2 {
    public static void responseB(){
        List<Integer> al = new ArrayList<Integer>();
        al.forEach((@DebugInfo("lambda") var x) ->{ System.out.println(x);});
    }
    
    public static void responseC(){
        List<Integer> al = new ArrayList<Integer>();
        al.forEach((@DebugInfo("lambda") Integer x) ->System.out.println(x));
    }
    
    @DebugInfo( "01/01/2019")    
      void applyLogic(int index){
    }
}