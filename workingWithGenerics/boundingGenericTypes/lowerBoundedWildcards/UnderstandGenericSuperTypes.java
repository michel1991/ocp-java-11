package workingWithGenerics.boundingGenericTypes.lowerBoundedWildcards;
import java.util.*;
import java.io.*;
class UnderstandGenericSuperTypes{
  
  /**
   *   La ligne 3 fait référence à une liste qui pourrait être List<IOException> ou List<Exception> ou List<Object>.
   *  La ligne 4 ne compile pas parce que nous pourrions avoir une Liste<IOException>
   *  et un objet Exception n'y aurait pas sa place(ne rentrerait pas là)
   *
   *  La ligne 5 est correcte. IOException peut être ajouté à n'importe lequel de ces types.
   *  La ligne 6 est également correcte. FileNotFoundException peut également être ajouté à l'un de ces trois types.
   *  C'est délicat car FileNotFoundException est une sous-classe de IOException, et le mot clé dit super.
   *  Ce qui se passe, c'est que Java dit : «  Eh bien, FileNotFoundException est aussi une IOException, donc tout va bien. » 
   */
   public static void main(String... args){
    List<? super IOException> exceptions = new ArrayList<Exception>(); // ligne 3
     exceptions.add(new Exception() );
     exceptions.add( new IOException() ); // La ligne 5 
    exceptions.add( new FileNotFoundException() ); // La ligne 6
   }
}
