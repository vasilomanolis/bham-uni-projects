/**
  * Ex1: A Java program that:
  * 
  * 1. calculates the area A of the circle by π*r*r and then <br> 
  * 2. initializes the variable r to 5 <br>
  * 3. and prints the result
  *
  * @author: Vasileios Manolis
  * @version: 2017-10-01
  */


public class Ex1{

  public static double A(double r){
/** @param r radius of the circle
  * @param A Area of the circle
  *
  */
      return (r*r) * Math.PI;
  }

  public static void main(String[] args) {
/** @param r: radius of the circle
  * Didn't use int type, as r isn't necessarily integer
  */
      double r = 5;
      System.out.println("The area A of the circle with r=5 is "+A(r));
  }


}



