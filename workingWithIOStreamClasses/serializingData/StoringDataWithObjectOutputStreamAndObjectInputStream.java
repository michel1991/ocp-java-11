package workingWithIOStreamClasses.serializingData;
import java.io.*;
import java.util.*;

class StoringDataWithObjectOutputStreamAndObjectInputStream{
  void saveToFile(List<Gorilla> gorillas, File dataFile) throws IOException{
       try (
              var out = new ObjectOutputStream(
                 new BufferedOutputStream(
                      new FileOutputStream(dataFile)
                 )
             )
        ){
             for(Gorilla gorilla : gorillas)
                out.writeObject(gorilla);
       } // try-resource
  }

   
List <Gorilla> readFromFile(File dataFile) throws IOException, ClassNotFoundException{
     var gorillas =  new ArrayList<Gorilla>();
      try(
               var in = new ObjectInputStream(
                     new BufferedInputStream(
                         new FileInputStream(dataFile)
                      )
                 )
       ){
            while (true){
                var object = in.readObject();
                if(object instanceof Gorilla)
                  gorillas.add( (Gorilla) object );


           }
       }catch(EOFException e ){
            //File end reached
       }
     
      return gorillas;
 }


  void saveToFileChimpanzee(List<Chimpanzee> chimpanzees, File dataFile) throws IOException{
       try (
              var out = new ObjectOutputStream(
                 new BufferedOutputStream(
                      new FileOutputStream(dataFile)
                 )
             )
        ){
             for(Chimpanzee chimpanzee : chimpanzees)
                out.writeObject(chimpanzee);
       } // try-resource
  }


List <Chimpanzee> readFromFileChimpanzee(File dataFile) throws IOException, ClassNotFoundException{
     var chimpanzees =  new ArrayList<Chimpanzee>();
      try(
               var in = new ObjectInputStream(
                     new BufferedInputStream(
                         new FileInputStream(dataFile)
                      )
                 )
       ){
            while (true){
                var object = in.readObject();
                if(object instanceof Chimpanzee)
                  chimpanzees.add( (Chimpanzee) object );


           }
       }catch(EOFException e ){
            //File end reached
       }

      return chimpanzees;
 }




}
