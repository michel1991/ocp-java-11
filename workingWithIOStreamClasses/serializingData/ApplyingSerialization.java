package workingWithIOStreamClasses.serializingData;
import java.util.*;
import java.io.*;

class ApplyingSerialization{
   public static void main(String... args) throws IOException, ClassNotFoundException{
      StoringDataWithObjectOutputStreamAndObjectInputStream handle = new StoringDataWithObjectOutputStreamAndObjectInputStream();
      var gorillas = new ArrayList<Gorilla>();
      gorillas.add(new Gorilla( "Grodd", 5, false) );
      gorillas.add(new Gorilla( "Ishmael", 8, true) );
     String fullPath = System.getProperty("user.dir") + "/workingWithIOStreamClasses/serializingData"+ "/gorilla.txt";    
     File file = new File(fullPath);
      handle.saveToFile(gorillas, file);

      var gorillasFromDisk = handle.readFromFile(file);
      System.out.println(gorillasFromDisk);


      var chimpanzees = new ArrayList<Chimpanzee>();
      chimpanzees.add(new Chimpanzee( "Ham", 5, 'A') );
      chimpanzees.add(new Chimpanzee( "Enos", 8, 'B') );


       System.out.println(" Gorillas deserialization ");
     String fullPathChimpanzee = System.getProperty("user.dir") + "/workingWithIOStreamClasses/serializingData"+ "/chimpanzee.txt";    
     File fileChimpanzee = new File(fullPathChimpanzee);
     handle.saveToFileChimpanzee(chimpanzees, fileChimpanzee);

      System.out.println();
      var chimpanzeesFromDisk = handle.readFromFileChimpanzee(fileChimpanzee);
      System.out.println(" Chimpanzees deserialization ");
      System.out.println(chimpanzeesFromDisk);
   }
} 
