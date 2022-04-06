package chainingCatchBlocks;

class InheritExceptionOrderMatter{

    void seeAnimal(){
      throw new ExhibitClosedForLunch();
    }
  
   public void visitMonkeys(){
       try{
          seeAnimal();
       }catch(ExhibitClosedForLunch e){
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
