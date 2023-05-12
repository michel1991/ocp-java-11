package workingWithGenerics.boundingGenericTypes.lowerBoundedWildcards;
import java.util.*;
import java.util.function.*;
import java.io.*;

public class UnderstandGenericSuperTypesAddFileNotExceptionToAllList {
    
    /**
     * La liste qui pourrait être List<IOException> ou List<Exception> ou List<Object>
     * FileNotFoundException peut également être ajouté à l'un de ces trois types (demontrer plus bas )
     */
    public static void adding(List<? super IOException> list){
        list.add(new FileNotFoundException());
        System.out.println(list);
        System.out.println();
    }
    
    static List<IOException> adding1ToByBaseEraseTypeWithOverload(){
        List<IOException> exceptions = new ArrayList<>();
        exceptions.add(new FileNotFoundException("FileNotFoundException add to list IOException"));
        
        return exceptions;
    }
    

    static  List<Exception> adding2ToByBaseEraseTypeWithOverload(){
        List<Exception> exceptions = new ArrayList<>();
        exceptions.add(new FileNotFoundException("FileNotFoundException add to list Exception"));
        
        return exceptions;
    }

    static List<Object>  adding3ToByBaseEraseTypeWithOverload(){
        List<Object> exceptions = new ArrayList<>();
        exceptions.add(new FileNotFoundException("FileNotFoundException add to list Object"));
        
        return exceptions;
    }
    
    public static void prooveThatAllTypeListAreAdmitAndFileNotFoundExceptionSatisfyCondition(){
        adding(adding1ToByBaseEraseTypeWithOverload());
        adding(adding2ToByBaseEraseTypeWithOverload());
        adding(adding3ToByBaseEraseTypeWithOverload());
    }
    
    public static void main(String... args){
        prooveThatAllTypeListAreAdmitAndFileNotFoundExceptionSatisfyCondition();
    }
    
    
    
}