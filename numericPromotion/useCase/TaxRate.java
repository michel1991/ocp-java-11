package numericPromotion.useCase;
/**
 You are writing a piece of code that determines tax rate on a given grossIncome. The tax rate is to be computed as follows -
   If grossIncome is less than or equals to 18000, taxRate is 0.
   If grossIncome is more than 18000 but less than or equal to 36000, taxRate is 10%
   If grossIncome is more than 36000, taxRate is 20%.

    Which of following code fragments do it correctly?
    
    A. double taxRate = grossIncome<=18000 ? 0 : (grossIncome<=36000) ? .1 : .2;
    
    B.
        double taxRate = .2;
        taxRate = grossIncome<=18000?0:.1;
        taxRate = grossIncome<=36000?.1:.2;
        It will assign .1 to taxRate even if grossIncome is less than 18000.

    C.
       double taxRate = .2;
        if(grossIncome>36000) {
           taxRate = .2;
        }else taxRate = 0;
        if(grossIncome>18000 ) {
           taxRate = .1;
        }
        -----
        This will assign .1 to taxRate even if grossIncome is greater than 36000.

    D.
       double taxRate = 0;
        taxRate = grossIncome>18000?grossIncome<=36000?.1:.2:0;
        
     
 
    
    -------
    This question is assigned a rating of tough only because it is a bit time consuming to check each option.
    Otherwise, it is quite easy to figure out what each option is doing. You may expect such questions in the exam.
    Correct(A, C, D)
 */
public class TaxRate {
    static double responseA(int grossIncome){
        double taxRate = grossIncome<=18000 ? 0 : (grossIncome<=36000) ? .1 : .2;
        return taxRate;
    }
    
    static double responseC(int grossIncome){
        double taxRate = 0;
        if(grossIncome>36000) taxRate = .20;
        if(grossIncome>18000 && grossIncome<=36000) taxRate = .10;
        return taxRate;
    }
    
    static double responseD(int grossIncome){
        double taxRate = 0;
        taxRate = grossIncome>18000?grossIncome<=36000?.1:.2:0;
        
        return taxRate;
    }
    
    public static void main(String... args){
        
    }
}