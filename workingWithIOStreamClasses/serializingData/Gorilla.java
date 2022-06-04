package workingWithIOStreamClasses.serializingData;
import java.io.Serializable;

class Gorilla implements Serializable{
  private static final long serialVersionUID = 1L;

   private String name;
   private int age;
   private Boolean friendly;
   private transient String favoriteFood;

  //constructors/getters/setters/toString() omitted

  public String getName(){
    return  name;
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
 

}
