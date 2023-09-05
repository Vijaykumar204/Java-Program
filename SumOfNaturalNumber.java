import java.util.Scanner;
class SumOfNaturalNumber  
 {  
    public static void main(String[] args)   
    {  
       int i, num , sum = 0;  
       Scanner s=new Scanner(System.in);
       System.out.print("ENTER THE NO OF DIGIT:");
       num=s.nextInt();
       for(i = 1; i <= num; ++i)  
       {  
         sum = sum + i;  
       }  
      System.out.println("Sum of First 10 Natural Numbers is = " + sum);  
   }  
 }  