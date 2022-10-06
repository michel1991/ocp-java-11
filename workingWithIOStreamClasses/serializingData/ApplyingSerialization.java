package workingWithIOStreamClasses.serializingData;
import java.util.*;
import java.io.*;

class ApplyingSerialization{
   public static void main(String... args) throws IOException{
      StoringDataWithObjectOutputStreamAndObjectInputStream handle = new StoringDataWithObjectOutputStreamAndObjectInputStream();
      var gorillas = new ArrayList<Gorilla>();
      gorillas.add(new Gorilla( "Grodd", 5, false) );
      gorillas.add(new Gorilla( "Ishmael", 8, true) );
     String fullPath = System.getProperty("user.dir") + "/workingWithIOStreamClasses/serializingData"+ "/gorilla.txt";    
     File file = new File(fullPath);
      handle.saveToFile(gorillas, file); 
   }
} 
