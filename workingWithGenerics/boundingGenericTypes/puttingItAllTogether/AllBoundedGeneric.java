package workingWithGenerics.boundingGenericTypes.puttingItAllTogether;
import java.util.*;

class A{
   public String toString(){
     return "i am A";
   }

}

class B extends A{ 
   public String toString(){
     return "i am B";
   }
}

class C extends B{ 
   public String toString(){
     return "i am C";  
   }		
}

class AllBoundedGeneric{

	static void show(List<?> list){
          System.out.println(list);
	}

       static void showOnlyChildOfA(List<? extends A> list){
          System.out.println(list);
        }

       static void showFromAToObject(List<? super A> list){
          System.out.println(list);
        }

   public static void main(String... args){
    	   
      List<Object> listAllObject = new ArrayList<>();
      listAllObject.add(new Object());
      listAllObject.add(new A());
      listAllObject.add(new B());
      listAllObject.add(new C());
      listAllObject.add(new String(" I am a string "));
      listAllObject.add(1); 
      listAllObject.add(2.9); 

      System.out.println("All object any class ");  
      show( listAllObject );
      System.out.println();

      System.out.println("List of child of A ");	
      List<A> listOfChildOfA = new ArrayList<>();
      listOfChildOfA.add(new A());
      listOfChildOfA.add(new B());
      listOfChildOfA.add(new C());
      showOnlyChildOfA( listOfChildOfA );
      System.out.println();

      System.out.println("List from A to Object take all sub class of A and A include ");
      showFromAToObject(listOfChildOfA);
      System.out.println();

      System.out.println("List from A to Object take all sub class of A and A include and go top which is object ");
       showFromAToObject( listAllObject );

      //List <?  A> allChildsOfAIncludeA = new ArrayList<A>();
      //List<? super A> fromAToObject = new ArrayList<A>();
   }      
}
