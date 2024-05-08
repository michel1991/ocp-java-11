package lambda.canBeInsert;
import java.util.*;
import java.util.function.*;

/**
 * Given :

    //In Data.java
    public class Data{
        int value;
        Data(int value){
            this.value = value;
        }
    }
    
    and the following code fragments:
    public void printUsefulData(ArrayList<Data> dataList, Predicate<Data> p){
        for(Data d: dataList){
                if(p.test(d)) System.out.println(d.value);
        }
    }
    
    ....
            ArrayList<Data> al = new ArrayList<Data>();
            al.add(new Data(1));al.add(new Data(2));al.add(new Data(3));
    
            //INSERT METHOD CALL HERE
    
    
    
    Which of the following options can be inserted above so that it will print 3?
    
    A. printUsefulData(al, (Data d)-> { return d.value>2; }  );
    
    B. printUsefulData(al, d-> d.value>2 );
        1. Compiler already knows the parameter types, so Data can be omitted from the parameter list.
        2. When there is only one parameter in the method, you can omit the brackets because
        the compiler can associate the -> sign with the parameter list without any ambiguity.
        3. When all your method does is return the value of an expression,
        you can omit the curly braces, the return keyword, and the semi-colon from the method body part.
        Thus, instead of { return d.value>2; }, you can just write d.value>
        
    C.
        printUsefulData(al, (d)-> return d.value>2;  );
        If you write return, the compiler assumes that you are writing the complete method
        body and so it expects the curly braces as well as the semi-colon
        
    D. printUsefulData(al, Data d-> d.value>2  );
      If you write parameter type, the compiler assumes that you are writing the complete parameter list of the method and so,
      it expects the parentheses i.e. (Data d) instead of just Data d.
      
    E. printUsefulData(al, d -> d.value>2;   );
    The semi-colon in the method body should not be there because the line of code is not enclosed within curly braces.
    
    ---------------
     correct(A, B)
     
     There is a simple trick to identify invalid lambda constructs.
     When you write a lambda expression for a functional interface,
     you are essentially providing an implementation of the method declared in that interface but in a very concise manner.
     Therefore, the lambda expression code that you write must contain all the pieces
     of the regular method code except the ones that the compiler can easily figure out on its own such as the parameter types, return keyword, and braces. So, in a lambda expression, just check that all the information is there and that the expression follows the basic syntax -
    
    (parameter list) OR single_variable_without_type ->
        { regular lines of code } OR just_an_expression_without_semicolon
    
    For a complete discussion on this topic please see this short tutorial - https://enthuware.com/lambda-for-ocajp
    
 */
public class Print3 {
    
    public void printUsefulData(ArrayList<Data> dataList, Predicate<Data> p){
        for(Data d: dataList){
            if(p.test(d)) System.out.println(d.value);
        }
    }
    
    public static void main(String... args){
        ArrayList<Data> al = new ArrayList<Data>();
        al.add(new Data(1));al.add(new Data(2));al.add(new Data(3));

        //INSERT METHOD CALL HERE
        var print = new Print3();
        print.printUsefulData(al, (Data d)-> { return d.value>2; }  );
        
        print.printUsefulData(al, d-> d.value>2 );
    }
}