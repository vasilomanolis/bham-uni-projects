/** 
 * Ex3: The class computes and prints the balance of a particular 
 * investement after 5 and 500 years. 
 * @author: Vasileios Manolis
 * @version: 2017-10-01
 */

public class Ex3{
   public static double total(double capital, double interest_rate, double years){
     return capital*(Math.pow((1+0.01*interest_rate),years));

   } 
  
   public static void main(String[] args) {
   double interest_rate=2.3;
   double capital=100;
   double years=1;
   System.out.println("If a capital of £ 100 is invested at a fixed interest rate of 2.3 per cent, the balance after 1, 2, 3, 4, 5, and 500 years will respectively be:");  
   System.out.println(total(capital, interest_rate, years));
   System.out.println(total(capital, interest_rate, years+1));
   System.out.println(total(capital, interest_rate, years+2));
   System.out.println(total(capital, interest_rate, years+3));
   System.out.println(total(capital, interest_rate, years+4));
   System.out.println(total(capital, interest_rate, years+499));
   System.out.println("Note: The formula total = capital * (1+0.01*interest_rate)^years was used for calculations.");
   }

}

