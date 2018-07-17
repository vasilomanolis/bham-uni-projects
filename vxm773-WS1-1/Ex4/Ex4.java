/**
  * Ex4:
  *
  *
  *
  * @author:Vasileios Manolis	
  * @version: 2017-10-02
  */

  public class Ex4{
    public static double sum(double e1, double d1, double e2, double d2){
       return (e1*d2+e2*d1)/(d1*d2);
     }

    public static double sumnumerator(double e1, double d1, double e2, double d2){
       return (e1*d2+e2*d1);
    }

    public static double sumdenominator(double e1, double d1, double e2, double d2){
       return (d1*d2);
    }


    public static double product(double e1, double d1, double e2, double d2){
       return (e1*e2)/(d1*d2);
    }


    public static double productnumerator(double e1, double d1, double e2, double d2){
       return (e1*e2);
    }


    public static double productdenominator(double e1, double d1, double e2, double d2){
       return (d1*d2);
    }

    public static void main(String[] args) {
   
    System.out.println("The sum of 1/2+1/3 is "+sum(1,2,1,3)+" or "+sumnumerator(1,2,1,3)+"/"+sumdenominator(1,2,1,3));
   System.out.println("The sum of 1/3+3/4 is "+sum(1,3,3,4)+" or "+sumnumerator(1,3,3,4)+"/"+sumdenominator(1,3,3,4));
  System.out.println("The product of 1/2+2/3 is "+product(1,2,2,3)+" or "+productnumerator(1,2,2,3)+"/"+sumdenominator(1,2,2,3));
  System.out.println("The product of 1/4+2/3 is "+product(1,4,2,3)+" or "+productnumerator(1,4,2,3)+"/"+sumdenominator(1,4,2,3));
    }


 
 }

