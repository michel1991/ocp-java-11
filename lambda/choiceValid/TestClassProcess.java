
package lambda.choiceValid;
import java.util.function.*;
import java.util.*;

/**
 Given :

    interface Process{
        public void process(int a, int b);
    }
    
    public class Data{
        int value;
        Data(int value){
            this.value = value;
        }
    }
    
    and the following code fragments:
    public void processList(ArrayList<Data> dataList, Process p){
       for(Data d: dataList){
            p.process(d.value, d.value);
       }
    }
    
    ....
            ArrayList<Data> al = new ArrayList<Data>();
            al.add(new Data(1));al.add(new Data(2));al.add(new Data(3));
    
            //INSERT METHOD CALL HERE
    
    
    
    Which of the following options can be inserted above so that it will print 1 4 9?
    
    A.
      processList(al, a, b->System.out.println(a*b));
         -----
        Observe that without the parantheses over a, b, it would imply that you are trying to pass 3 arguments
        to processList method - al, a, and b->System.out.println(a*b), which is incorrect.
        You actually want to pass only two arguments - al and the lambda expression.
        Therefore, whenever the method of a functional interface takes more than one parameter, you need to put the arguments within parantheses.
        
        If the method of a functional interface takes one parameter, you can omit the parantheses.
        For example, x -> expression and (x) -> expression are equivalent.
        
        If the method of a functional interface takes no parameter, you must write empty parantheses. For example, ( ) -> expression
        
    B. processList(al, (int a, int b)->System.out.println(a*b) );

    C.
       processList(al, (int a, int b)->System.out.println(a*b); );
       ---
        When your method body comprises only a single expression (i.e. without the opening an closing braces), you must omit the semi-colon.
        The following is valid:
        processList(al, (int a, int b)->{   System.out.println(a*b); });

    D. processList(al, (a, b)->System.out.println(a*b));
        ------
        It is ok to omit the parameter types in case of a functional interface because
        the compiler can determine the type of the parameters by looking at the interface method.
        
    E.
        processList(al, (a, b) ->{  System.out.println(a*b); } );
        ----
        If you enclose your method body within curly braces, you must write complete lines of code including the semi-colon.
        FYI, if the method is supposed to return a value, then you must include a return statement
        just like you do in a regular method if you are using the curly braces syntax
        
    ------------------
    There is a simple trick to identify invalid lambda constructs. When you write a lambda expression for a functional interface,
    you are essentially providing an implementation of the method declared in that interface but in a very concise manner.
    Therefore, the lambda expression code that you write must contain all the pieces of the regular method code except the ones that the compiler can easily figure out on its own such as the parameter types, return keyword, and braces. So, in a lambda expression, just check that all the information is there and that the expression follows the basic syntax -

    (parameter list) OR single_variable_without_type ->
        { regular lines of code } OR just_an_expression_without_semicolon
    
    For a complete discussion on this topic please see this short tutorial - https://enthuware.com/lambda-for-ocajp
      Correct(B, D, E)
 */
interface Process{
    public void process(int a, int b);
}

 class Data{ // public
    int value;
    Data(int value){
        this.value = value;
    }
}

public class TestClassProcess {
    // and the following code fragments:
    static public void processList(ArrayList<Data> dataList, Process p){ // add static
        for(Data d: dataList){
             p.process(d.value, d.value);
        }
     } 
    
    public static void main(String... args){
        ArrayList<Data> al = new ArrayList<Data>();
        al.add(new Data(1));al.add(new Data(2));al.add(new Data(3));
        
        //INSERT METHOD CALL HERE
        processList(al, (int a, int b)->System.out.println(a*b) );
        processList(al, (a, b)->System.out.println(a*b));
        processList(al, (a, b) ->{  System.out.println(a*b); } );
    }

}