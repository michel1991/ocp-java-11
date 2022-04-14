package definingAnAnonymousClass;

public class ZooGiftShop{
  abstract class SaleTodayOnly{
     abstract int dollarsOff();
  }

    public int admission(int basePrice){
       SaleTodayOnly sale = new SaleTodayOnly(){
              int dollarsOff(){
                 return 3;
             } 
       }; // don't forget the semicolon!
 
       return basePrice - sale.dollarsOff(); 
    }

}
