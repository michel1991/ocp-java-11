package polymorphism.casting;

public class Fish {
   public static void main(String[] args){
     Fish fish = new Fish();
     Bird bird = (Bird) fish; // does not compile  
      
  }

}
