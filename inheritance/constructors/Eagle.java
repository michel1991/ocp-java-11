package inheritance.constructors;

/**
 * Consider the following code appearing in Eagle.java
   
   class Bird {
        private Bird(){     }
    }
    
    class Eagle extends Bird { 
        public String name;
        public Eagle(String name){
            this.name = name;
        }
        
        public static void main(String[] args) {
            System.out.println(new Eagle("Bald Eagle").name);
        }
    }
   What can be done to make this code compile?
   
    A. Nothing, it will compile as it is.
    
    B. Make Eagle class declaration public:
        public class Eagle { ... }
        
    C.
       Make the Eagle constructor private:
        private Eagle(String name){ ... }
    
    D.
      Make Bird constructor public:
         public Bird() { ... }
    
    E.
       Insert super(); as the first line in Eagle constructor:
        public Eagle(String name){
            super();
            this.name = name;
        }
        
      If a subclass class constructor doesn't explicitly call the super class constructor, the compiler automatically inserts super();
      as the first statement of the subclass constructor. So this option is not needed.
      
      -----------------
        Since the constructor of Bird is private, the subclass cannot access it and therefore,
        it needs to be made public. protected or default access is also valid.
   Correct(D)
 */
class Bird {
    // private Bird(){     } original 
    public Bird(){     }
}
class Eagle extends Bird { 
    public String name;
    public Eagle(String name){
        this.name = name;
    }
    
    public static void main(String[] args) {
        System.out.println(new Eagle("Bald Eagle").name);
    }
}