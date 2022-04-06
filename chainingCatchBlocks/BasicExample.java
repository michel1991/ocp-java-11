package chainingCatchBlocks;

class BasicExample{

    void seeAnimal(){
      throw new AnimalsOutForWalk();
    }
  
   public void visitPorcupine(){
       try{
          seeAnimal();
       }catch(AnimalsOutForWalk e){
            System.out.print("try back later ");
        } catch(ExhibitClosed e ){
           System.out.print("not today");
        }
   }

   public static void main(String[] args){
       BasicExample sample = new BasicExample();
      sample.visitPorcupine();
   }
}
