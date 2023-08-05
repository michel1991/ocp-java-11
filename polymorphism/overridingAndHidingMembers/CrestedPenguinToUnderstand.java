package polymorphism.overridingAndHidingMembers;

public class CrestedPenguinToUnderstand extends Penguin {
    public static int getHeight(){
        return 8;
    }
    
    @Override 
    public void printInfo(){
        System.out.println(this.getHeight());
    }
    
    public static void main(String... fish){
        new CrestedPenguinToUnderstand().printInfo();
        CrestedPenguinToUnderstand crested =  new CrestedPenguinToUnderstand();
        
        crested.printInfo();
        
        // take ref type  of the left
        Penguin peguinRefLeft = new  CrestedPenguinToUnderstand();
        peguinRefLeft.printInfo();
       
        
    }
    
}