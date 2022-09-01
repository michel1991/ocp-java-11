package workingWithGenerics.boundingGenericTypes.lowerBoundedWildcards;
import java.util.*;
import java.io.*;
class UnderstandGenericSuperTypes{
   public static void main(String... args){
     List<? super IOException> exceptions = new ArrayList<Exception>();
     exceptions.add(new Exception() );
     exceptions.add( new IOException() );
     exceptions.add( new FileNotFoundException() );
   }
}
