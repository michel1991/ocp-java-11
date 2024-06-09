package collections.lists.lambda;
import java.util.*;
import java.util.function.*;

/**
 Given :

    //In Data.java
    public class Data{
        int value;
        Data(int value){
            this.value = value;
        }
        public String toString(){ return ""+value; }
    }
    
    and the following code fragments:
    public  void filterData(ArrayList<Data> dataList, Predicate<Data> p){
    Iterator<Data> i = dataList.iterator();
    while(i.hasNext()){
            if(p.test(i.next())){
                i.remove();
        }
    }
    }
    ....
            ArrayList<Data> al = new ArrayList<Data>();
            Data d = new Data(1); al.add(d);
            d = new Data(2); al.add(d);
            d = new Data(3); al.add(d);
    
            //INSERT METHOD CALL HERE
        System.out.println(al);
    
    
    Which of the following options can be inserted above so that it will print [1, 3]?
    
    A. filterData(al, d -> d.value%2 == 0 );
        ---
        Syntactically, this lambda expression is correct.
        However, remember that a lambda expression does not create a new scope for variables.
        Therefore, you cannot reuse the variable names that have already been used to define new variables in your argument list .
        Here, observe that the variable d is already defined so your argument list cannot use d as a variable name.
        It would be like defining the same variable twice in the same scope.
        
    B. filterData(al, (Data x) -> x.value%2 == 0 );
        ---
        When all your method does is return the value of an expression, you can omit the curly braces,
        the return keyword, and the semi-colon from the method body part.
        Thus, instead of { return x.value%2 == 0; }, you can just write x.value%2 == 0

    C.
        filterData(al, (Data y) -> y.value%2  );
           ---
            java.util.function.Predicate interface has one method named test and this method returns a boolean.
            Therefore, the body of the lambda expression that satisfies this method must return a boolean.
            Here, y.value%2 is an int and not a boolean.
            
    D. filterData(al, d -> return d.value%2 );
        This is invalid because of three reasons -
        1. You cannot use d as the name for your parameter as explained in option 1.
        2. If you write return statement in your method body, you must enclose it within curly braces and include the semi-colon.
        3. To satisfy the Predicate interface, your lambda expression must return a boolean not an int as explained in option 3.
        
     -------
      There is a simple trick to identify invalid lambda constructs.
      When you write a lambda expression for a functional interface,
      you are essentially providing an implementation of the method declared in that interface but in a very concise manner.
      Therefore, the lambda expression code that you write must contain all the pieces
      of the regular method code except the ones that the compiler can easily
      figure out on its own such as the parameter types, return keyword, and braces. So, in a lambda expression,
      just check that all the information is there and that the expression follows the basic syntax -

        (parameter list) OR single_variable_without_type ->
            { regular lines of code } OR just_an_expression_without_semicolon
        
        For a complete discussion on this topic please see this short tutorial - https://enthuware.com/lambda-for-ocajp
      correct(B)
 */
class Data{
    int value;
    Data(int value){
        this.value = value;
    }
    public String toString(){ return ""+value; }
}

class TestData{
    public static  void filterData(ArrayList<Data> dataList, Predicate<Data> p){ // add static 
        Iterator<Data> i = dataList.iterator();
        while(i.hasNext()){
            if(p.test(i.next())){
                    i.remove();
        }
        }
    }
    
    public static void main(String... args){
        ArrayList<Data> al = new ArrayList<Data>();
        Data d = new Data(1); al.add(d);
        d = new Data(2); al.add(d);
        d = new Data(3); al.add(d);
    
        //INSERT METHOD CALL HERE
        filterData(al, (Data x) -> x.value%2 == 0 );
        System.out.println(al);
    
    }
}