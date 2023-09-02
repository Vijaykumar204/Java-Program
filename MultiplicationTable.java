import java.util.*;
class mt
{
   public static void main(String[] args) 
   {
        Scanner s=new Scanner(System.in);
        System.out.print("WHICH TABLE DO YOU WANT?");                                                                 
        int num=s.nextInt();
        System.out.print("ENTER THE TABLE LIMIT:");                                                                
        int n=s.nextInt();
        for(int i=1; i<=n; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}