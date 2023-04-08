package io.serialization.runtime;
import  io.PathUtility;
import java.util.*;
import java.io.*;


/**
  Given the following Dolphin class, which of the following fields will always be null
  after the class is serialized and then deserialized? (Choose all that apply.)
  
    A. name
    B. age
    C. birthPlace
    D. friends
    E. The class does not compile.
    F. None of the above, as the code generates an exception at runtime.

   The code appears to be about the deserialization process, but the class itself does not implement Serializable,
   so it will throw a NotSerializableException at runtime when it is serialized, and option F is correct.
   If the class was corrected to implement the Serializable interface,
   then name would be null after the class is deserialized, since it is marked transient.
   On the other hand, birthPlace would not be null since it is static and set on the class level.
   The instance member age is an int, so while it is marked transient, it would default to 0, not null.
   Finally, friends would be serialized and deserialized with whatever value it was stored with.
 */
class Dolphin {
    private transient String name = "Flipper";
    private static String birthPlace = "ocean";
    private transient int age;
    private List<String> friends = new ArrayList<>();

    // Getters/Settings/Constructors omitted

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getBirthPlace(){
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace){
       this.birthPlace=  birthPlace;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=  age;
    }
}

public class DolphinNotImplementSerializable {

    static void applySerialization() throws IOException{

        String path =  PathUtility
                            .getResourcePath()
                            .append(PathUtility.getFileSeparator())
                            .append("result_dolphin_not_implement_serializable.txt")
                            .toString();
        var file = new File(path);
        file.delete();
       try( var ob = new ObjectOutputStream(
               new BufferedOutputStream(
                       new FileOutputStream( file)
               )
           )
       ){
           var dolphin =   new Dolphin();

           ob.writeObject(dolphin);
       }
    }

    public static void main(String... args) throws IOException{
       applySerialization();
   }
}