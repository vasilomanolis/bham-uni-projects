
/**
  * Ex5: Program computing angle between hour and minute hand
  *
  *
  * @author: Vasileios Manolis
  * @version: 5/10/2017
  */




public class Ex5{

  public static int Angle(int Hours, int Minutes){



/** 
  * HOUR HAND: For every 1 hour, the Hour Hand moves 30 degrees 
  *(30=360/12 because in 12 hours it makes a circle). 
  * For every additional minute, the Hour hand moves additional 
  * 0.5 degrees (0.5=30/60). In total the movement of the 
  * HDegrees=30*Hours+0.5*Minutes
  *
  * MINUTE HAND: For every 1 minute, the Minute Hand moves 6 degrees 
  * (6 = 360/60 because in 60 minutes it makes a circle)
  * At any moment, the minutes hand moves MDegrees=6*Minutes
  *
  * Angle = HDegrees - MDegrees
  *
  * We are adding 360 degrees to include instaces where degrees <0
  * We'll use the Remainder Operator % to also include hour values >12
  */
    
    return (int)Math.round(((((30*(Hours)+0.5*Minutes) - (6*Minutes)+360))%360));
  }

  public static void main(String[] args) {
    System.out.println("When the time is 9:00, the angle is "+Angle(9,0));
    System.out.println("When the time is 3:00, the angle is "+Angle(3,0));
    System.out.println("When the time is 18:00, the angle is "+Angle(18,0));
    System.out.println("When the time is 1:00, the angle is "+Angle(1,0));
    System.out.println("When the time is 2:30, the angle is "+Angle(2,30));
    System.out.println("When the time is 4:41, the angle is "+Angle(4,41));

  }



}
