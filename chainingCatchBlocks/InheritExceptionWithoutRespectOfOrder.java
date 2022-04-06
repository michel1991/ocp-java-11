package chainingCatchBlocks;

class InheritExceptionWithoutRespectOfOrder{

    void seeAnimal(){
      throw new ExhibitClosedForLunch();
    }
  
   public void visitMonkeys(){
       try{
          seeAnimal();
       }catch(ExhibitClosed e){
            System.out.print("try back later ");
        } catch(ExhibitClosedForLunch e ){
           System.out.print("not today");
        }
   }

   public static void main(String[] args){
       
   }
}
