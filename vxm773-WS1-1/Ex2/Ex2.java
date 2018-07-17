/**
  * Ex2: A Java program that converts masses 
  * given in the imperial system into kilograms, 
  * using the following conversions: <br>
  * 1 ton           = 2240 pounds <br>
  * 1 hundredweight = 112 pounds <br>
  * 1 quarter       = 28 pounds <br>
  * 1 stone         = 14 pounds <br>
  * 1 ounce         = 1/16 pounds <br>
  * 1 drachm        = 1/256 pounds <br>
  * 1 grain         = 1/7000 pounds <br>
  * 1 pound         = 0.45359237 <br>
  * Then, using the program we determine 
  * how many kgs is a person that weights 11 stones and 6 pounds
  * @author: Vasileios Manolis
  * @date: 5/10/2017
  */

public class Ex2{

//Working A

/** @param tons counts the tons
  * @param hundredweights counts the hundredweights 
  * @param quarters counts the quarters
  * @param stones counts the stones
  * @param ounces counts the ounces
  * @param drachms counts the drachms
  * @param grains counts the grains
  * @param pounds counts the pounds
  * @return the masses into kilograms
  */

 public static double imperial2kilograms(
        double tons,
        double hundredweights,  
        double quarters,
        double stones, 
        double ounces,
        double drachms, 
        double grains,  
        double pounds){ 
       return (tons*2240 + hundredweights*112 + quarters*28 + stones*14 + ounces*1/16 + drachms*1/256 + grains*1/7000 + pounds)*0.45359237;
 }

//Working B
 public static void main(String[] args) {
            
        System.out.println("A person who weights 11 stones and 6 pounds would be "+imperial2kilograms(0, 0, 0, 11, 0, 0 , 0, 6 )+"kilograms.");
 }

}


