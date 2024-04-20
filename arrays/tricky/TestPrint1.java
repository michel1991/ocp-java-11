package arrays.tricky;

/**
 * Consider the following class...
   What will it print when compiled and run ?
    A. It will not compile.
    B. It will throw ArrayIndexOutOfBoundsException when run.
    C. It will print 1.
    D. It will print 3.
    E. It will print 4
    
    In an array access, the expression to the left of the brackets appears
    to be fully evaluated before any part of the expression within the brackets is evaluated.
    In the expression a[(a=b)[3]], the expression a is fully evaluated before the expression (a=b)[3];
    this means that the original value of a is fetched and remembered while the expression (a=b)[3] is evaluated.
    This array referenced by the original value of a is then subscripted by a value
    that is element 3 of another array (possibly the same array) that was referenced by b and is now also referenced by a.
    So, it is actually a[0] = 1.
    Note that if evaluation of the expression to the left of the brackets completes abruptly,
    no part of the expression within the brackets will appear to have been evaluated.
    
     Dans un accès à un tableau, l'expression située à gauche des crochets semble être entièrement
     évaluée avant toute partie de l'expression située entre les crochets.
    Dans l'expression a[(a=b)[3]], l'expression a est entièrement évaluée avant l'expression (a=b)[3] ;
    cela signifie que la valeur originale de a est récupérée et mémorisée pendant que l'expression (a=b)[3] est évaluée.
    Ce tableau référencé par la valeur originale de a est ensuite inscrit en indice par une valeur qui est l'élément 3
    d'un autre tableau (peut-être le même tableau) qui était référencé par b et qui est maintenant également référencé par a.
    Il s'agit donc en fait de a[0] = 1.
    Notez que si l'évaluation de l'expression à gauche des parenthèses se termine brusquement, aucune partie
    de l'expression entre les parenthèses ne semblera avoir été évaluée.
    
    Correct(C)

 */
class Test{
    public static void main(String[ ] args){
        var a = new int[]{ 1, 2, 3, 4 };
        int[] b = { 2, 3, 1, 0 };
        System.out.println( a [ (a = b)[3] ] );
    }
}

public class TestPrint1 {
    public static void main(String[ ] args){
        Test.main(args);
    }
}