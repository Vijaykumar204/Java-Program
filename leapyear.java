import java.io.*;
import java.util.Scanner;
class m 
{
   public static void main(String[] args) 
   {
         Scanner s=new Scanner(System.in);
         System.out.print("ENTER THE YEAR");
        int year = s.nextInt();
        boolean leap = false;
        if (year % 4 == 0) 
        {
             if (year % 100 == 0) 
             {
                 if (year % 400 == 0)
                     leap = true;
                else
                     leap = false;
           }
      
     
          else
              leap = true;
     }
    else
      leap = false;

    if (leap)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");
  }
}