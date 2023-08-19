package collections;
import java.util.*;
import java.io.*;

public class DoesNotConfuse {
    
    class A {

    }

    class B extends A {

    }

    class C extends B {

    }

    void fourth(List<? super B> list){

    }

    class TT extends IOException{

    }
    
    public static void main(String... args){
        
        // il s'agit ici de verification de contenu ce qui devrait entrer
        List<? super IOException>  listAnother = new ArrayList<Exception>();
        listAnother.add(new IOException());
        listAnother.add((new DoesNotConfuse()).new TT());
        listAnother.add(new IOException());
        listAnother.add(new FileNotFoundException());
        FileNotFoundException childFileNotFound = new FileNotFoundException(){
            public String getMessage(){
                return "michel";
            }
        };
        listAnother.add(childFileNotFound);

        List<? super DoesNotConfuse.B>  listAnother1 = new ArrayList<DoesNotConfuse.A>();
        DoesNotConfuse instance = new DoesNotConfuse();
        DoesNotConfuse.B b = instance.new B();
        listAnother1.add(instance.new C());
        
        // ici il s'agit d'affectation qui paraît semblable à la vérification de contenu
        List<? super B> list11 = new ArrayList<A>();
        List<? super B> list12 = new ArrayList<B>();
        // cette instruction ne compilera pas car car C n'est pas super de B
        // ce qui est autorisé est B ou A qui sont respecte ses conidtions
        //List<? super B> list12 = new ArrayList<C>(); 
    }
}