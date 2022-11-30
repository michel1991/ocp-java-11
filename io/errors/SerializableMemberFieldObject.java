package io.errors;
import java.io.*;
import java.util.*;

/**
* The code compiles, so option F is incorrect. To be serializable,
* a class must implement the Serializable interface, which Zebra does.
* It must also contain instance members that either are marked transient or are serializable.
* The instance member stripes is of type Object, which is not serializable.
* If Object implemented Serializable, then all objects would be serializable by default,
* defeating the purpose of having the Serializable interface. Therefore, the Zebra class is not serializable,
* with the program throwing an exception at runtime if serialized and making option G correct.
* If stripes were removed from the class, then options A and C would be the correct answers,
* as name and age are both marked transient.
 */
class Zebra implements Serializable {
    private transient String name = "George";
    private static String birthPlace = "Africa";
    private transient Integer age;
    List<Zebra> friends = new java.util.ArrayList<>();
    private Object stripes = new Object();
    { age = 10;}
    public Zebra() {
         this.name = "Sophia";
     }
    static Zebra writeAndRead(Zebra z) {
        // Implementation omitted
        return null;
    }
    public static void main(String[] args) {
         var zebra = new Zebra();
         zebra = writeAndRead(zebra);
    }
}

public class SerializableMemberFieldObject {
   public static void main(String... args){

   }
}