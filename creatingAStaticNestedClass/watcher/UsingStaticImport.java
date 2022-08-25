package creatingAStaticNestedClass.watcher; 
import static creatingAStaticNestedClass.bird.Toucan.Beak;
class UsingStaticImport{

    public static void main(String[] args){
       Beak beak = new Beak();
       System.out.println(" import static inner class with static import ");
    }
}
