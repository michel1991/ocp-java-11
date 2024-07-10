package security.encapsulation;

/**
  Consider the following two classes (in the same package but defined in different source files):
  
  You are assigned the task of refactoring the Square class to make it better in terms of encapsulation.
  What changes will you make to this class?
  
     A. Make setSide() method private.
     B. Make getArea() method private.
        It should be made public so that other classes can get the area.
        
     C. Make side and area fields private.
        ---------
        There is no need to keep the area field because that would amount to duplicating the data.
        If you change side, the value of area will become obsolete.
        
    D. Make the side field private and remove the area field.
    
    E. Change getArea method to:
        public double getArea(){ return side*side; } (with choice)
        
    F. Add a setArea() method.
        This is not required because area is calculated using the side.
        So if you allow other classes to set the area, it could make side and area inconsistent with each other
  
  -----------------
  There can be multiple ways to accomplish this. The exam asks you questions on the similar pattern.
    The key is that your data variable should be private and the functionality that is to be exposed outside should be public.
    Further, your setter methods should be coded such that they don't leave the data members inconsistent with each other.
  Correct(D, E)
  
 */
class Square { // public 
    double side = 0;
    double area;

    public Square(double length){        this.side = length;    }

    public double getSide() {  return side;    }

    public void setSide(double side) {  this.side = side;   }

    double getArea() {   return area;   }
}
public class SquareTestClass {
    public static void main(String[] args) throws Exception {
        Square sq = new Square(10.0);
        sq.area = sq.getSide()*sq.getSide();
        System.out.println(sq.getArea());
    }
}
