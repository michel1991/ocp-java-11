package workingWithIOStreamClasses.serializingData;
import java.io.Serializable;

public class Chimpanzee implements Serializable{
 private static final long serialVersionUID = 2L;
 private transient String name;
 private transient  int age = 10;
 private static char type = 'C';
 {
     this.age = 14;
 }

 public Chimpanzee(){
    this.name = "Unknown";
    this.age = 12;
    this.type = 'Q';
 }

 public String getName(){
    return name;
 }

 public void setName(String name){
   this.name = name;
 }

 public int getAge(){
    return age;
  }

 public void setAge(int age){
    this.age = age;

  }

 public char getType(){
    return type;
 } 

 public void setType(char type){
     this.type = type;
 } 

  
 public Chimpanzee(String name, int age, char type){ 
    this.name = name;
    this.age = age;
    this.type = type;
 }

// getters/setters/toString() omiited


 public String toString() {
    return " {name="+name + " age="+ age + " type=" +type + "}";
 }


}
