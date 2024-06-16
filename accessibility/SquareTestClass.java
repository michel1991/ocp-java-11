package accessibility;

/**
    Given:
    
    Which of the following statements will set the side of Square object referred by mysq to 20?
    
    A. mysq.side = 20;
        Since side is a private variable, you cannot access it from outside Square class
        
    B. mysq = new Square(20);
        This will create a new Square object.
   
     C. mysq.setSide(20);

     D. side = 20;
    
     E. Square.mysq.side = 20;

   ------------------
     Correct(C)
 */
class Square {
    private double side = 0;
    String color;
    public Square(double length){
        this.side = length;
    }
    public double getSide() {  return side;    }

    public void setSide(double side) {  this.side = side;   }
    
}

 class TestClass { // public
    public static void main(String[] args) throws Exception {
        Square mysq = new Square(10);
        mysq.color = "red";
        
        //set mysq's side to 20
        mysq.setSide(20);
    }
}

class SqureTestClass{
    public static void main(String[] args) throws Exception {
        TestClass.main(args);
    }
}