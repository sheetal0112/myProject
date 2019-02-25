import java.util.Scanner;
public class Ques7 {
   public static void main(String args[]){

       int days,min,hours,c,d;
       System.out.println("Enter the seconds:");
       Scanner in = new Scanner(System.in);
       int sec = in.nextInt();
       days = sec/(24*60*60);
       d = sec%(24*60*60);
       hours = d/(60*60);
       c = d%(60*60);
       min = c/60;
       sec = c%60;
       System.out.println("The days are : " + days + " ,hours are: " + hours + " ,minutes are: " + min + " ,seconds are:" + sec);

   }


}
