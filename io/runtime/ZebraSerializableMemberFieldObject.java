package io.runtime;
import java.io.*;
import java.util.*;

/**
    Which of the following fields will be null after an instance of the class created on line 15 is serialized
    and then deserialized using ObjectOutputStream and ObjectInputStream? (Choose all that apply.)
    A. name
    B. stripes
    C. age
    D. friends
    E. birthPlace
    F. The code does not compile.
    G. The code compiles but throws an exception at runtime.

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
class Zebra implements Serializable { //3
    private transient String name = "George";  //4
    private static String birthPlace = "Africa";  //5
    private transient Integer age;  //6
    List<Zebra> friends = new java.util.ArrayList<>();  //7
    private Object stripes = new Object();  //8
    { age = 10;}  //9
    public Zebra() {  //10
         this.name = "Sophia"; //11
    } //12
    static Zebra writeAndRead(Zebra z) {  //13
        // Implementation omitted //14
        return null;
    } //15
    public static void main(String[] args) { //16
        var zebra = new Zebra(); //17
         zebra = writeAndRead(zebra); // 18
    } // 19
} // 19

public class ZebraSerializableMemberFieldObject {
   public static void main(String... args){

   }
}